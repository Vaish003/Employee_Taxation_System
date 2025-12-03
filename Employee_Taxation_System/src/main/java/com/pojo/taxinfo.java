package com.pojo;

public class taxinfo {
    public Integer empid;
   public Double tax_amount;
    public Integer empyear;
    public Long onprofit;
   public Long total_expense;

    public taxinfo(Integer empid, Double tax_amount, Integer empyear, Long onprofit, Long total_expenses){
        this.empid= empid;
        this.tax_amount=tax_amount;
        this.empyear=empyear;
        this.onprofit=onprofit;
        this.total_expense=total_expense;

    }
    public taxinfo(Integer empid){
        this.empid=empid;
    }
    public taxinfo(){}

    public void calculatetax(){

    }

    public Integer getEmpid() {
        return empid;
    }

    public Double getTax_amount() {
        return tax_amount;
    }

    public Integer getEmpyear() {
        return empyear;
    }

    public Long getOnprofit() {
        return onprofit;
    }

    public Long getTotal_expenses() {
        return total_expense;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public void setTax_amount(Double tax_amount) {
        this.tax_amount = tax_amount;
    }

    public void setEmpyear(Integer empyear) {
        this.empyear = empyear;
    }

    public void setOnprofit(Long onprofit) {
        this.onprofit = onprofit;
    }

    public void setTotal_expenses(Long total_expenses) {
        this.total_expense = total_expense;
    }
}
