package com.pojo;

public class empinfo {
   public Integer id;
    private String name;
    public Long salary;
    private Integer year;
   public Long expenses;

    public empinfo(Integer id, String name, Long salary, Integer year,Long expenses){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.year=year;
        this.expenses=expenses;
    }
    public empinfo(Integer id){
        this.id=id;
    }
    public empinfo(){}


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public Integer getYear() {
        return year;
    }

    public Long getExpenses() {return expenses; }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setExpenses(Long expenses) {this.expenses = expenses;}
}
