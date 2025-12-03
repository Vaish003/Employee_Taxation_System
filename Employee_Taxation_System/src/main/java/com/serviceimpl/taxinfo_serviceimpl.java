package com.serviceimpl;
import com.pojo.empinfo;
import com.pojo.taxinfo;
import com.service.taxinfo_service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class taxinfo_serviceimpl implements taxinfo_service {
    int i;
    @Override
    public empinfo getemp(int empid) {

        String query="select * from taxinfo where empid=?";

        try{
            Connection con=DB_Connection.get_DBconnect();
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs= ps.executeQuery();

            while(rs.next()){
                System.out.println("empid ="+rs.getInt("empid"));
                System.out.println("Salary ="+rs.getInt("salary"));
                System.out.println("Total_expense ="+rs.getInt("total_expense"));
                System.out.println("Tax_amount ="+rs.getInt("tax_amount"));
                System.out.println("Onprofit ="+rs.getInt("onprofit"));

                rs.close();
                ps.close();
                con.close();

            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    @Override

    public boolean taxcal(Integer id) {
        taxinfo t=new taxinfo();
        String query = "SELECT * FROM empinfo WHERE id = ?";
        try {
            Connection con = DB_Connection.get_DBconnect();
            PreparedStatement ps1 = con.prepareStatement(query);
            ps1.setInt(1, id);

            ResultSet rs1 = ps1.executeQuery();
            if(!rs1.next()) {
                System.out.println("Employee Not Found.............");
            }

               int tid=rs1.getInt("id");
               String tname=rs1.getString("name");
               long tsalary=rs1.getLong("salary");
               long texpense=rs1.getLong("expenses");

        String query2 = "select * from taxinfo where id=?";
        Boolean b = false;



        Long onprofit= 0l;
        onprofit = tsalary - texpense;
        double income = onprofit;
        double tax = 0.0d;

        if (income <= 1200000) {
            tax = 0.0;
        } else {
            tax = (income - 1200000) * 0.10;
        }
        Double tax_cal = tax;

        String query4 = "INSERT INTO taxinfo (empid, salary, total_expense, tax_amount, onprofit) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps3 = con.prepareStatement(query4);

            ps3.setInt(1, id);
            ps3.setLong(2, tsalary);
            ps3.setLong(3, texpense);
            ps3.setDouble(4,tax_cal);
            ps3.setLong(5, onprofit);

            int rows = ps3.executeUpdate();
            if (rows > 0) {
                System.out.println("Tax record inserted successfully!");
                return true;



        } }catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}