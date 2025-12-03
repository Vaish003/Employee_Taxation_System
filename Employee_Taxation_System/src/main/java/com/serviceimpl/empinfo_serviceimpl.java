package com.serviceimpl;

import com.pojo.empinfo;
import com.service.empinfo_service;

import java.sql.*;
import java.util.List;

public class empinfo_serviceimpl implements empinfo_service {
    public int i;

    @Override
    public boolean add_emp(empinfo e) {
        Integer id=e.getId();
        String name=e.getName();
        Long salary=e.getSalary();
        Integer year=e.getYear();
        Long expenses=e.getExpenses();

        String query = "INSERT INTO empinfo (id, name, salary, year,expenses) VALUES (?, ?, ?, ?,?)";
       try{
           Connection con = DB_Connection.get_DBconnect();
           PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setLong(3,salary);
            ps.setInt(4, year);
            ps.setLong(5,expenses);

             i=ps.executeUpdate();
            ps.close();
            con.close();
       }
       catch (SQLException ex1) {
       ex1.printStackTrace();
       }catch (Exception ex) {
           throw new RuntimeException(ex);
       }
       return true;
    }

    @Override
    public empinfo get_emp(empinfo e) {
       Integer eid=e.getId();

        String query = "SELECT * FROM empinfo WHERE id = ?";
        try {
            Connection con = DB_Connection.get_DBconnect();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, eid);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Id = " + rs.getInt("id"));
                System.out.println("Name = " + rs.getString("name"));
                System.out.println("Salary = " + rs.getString("salary"));
                System.out.println("Expenses = " + rs.getString("expenses"));
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
return null;
    }

    @Override
    public empinfo delete_emp(empinfo e) {
        Integer eid=e.getId();
        String query="delete from empinfo where id =?";
        try {
            Connection con = DB_Connection.get_DBconnect();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, eid);

        i=ps.executeUpdate();
         ps.close();
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
       return null;
    }

    @Override
    public List<empinfo> getAll_emp(empinfo e) {

        String query="select * from empinfo";
        try{
            Connection con=DB_Connection.get_DBconnect();
            PreparedStatement ps= con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                System.out.print("Id ="+ rs.getInt("id")+ " ");
                System.out.print("Name ="+rs.getString("name")+ " ");
                System.out.print("Salary ="+rs.getLong("salary")+ " ");
                System.out.print("Expenses ="+rs.getLong("expenses")+ " ");
                System.out.println("\n");
            }

            i=ps.executeUpdate();
            ps.close();
            con.close();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return List.of();
    }
}
