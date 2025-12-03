package com.controller;

import com.pojo.empinfo;
import com.serviceimpl.empinfo_serviceimpl;

import java.util.Scanner;

public class add_emp_empinfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id :");
        int id=sc.nextInt();

        System.out.println("Enter Name :");
        String name=sc.next();

        System.out.println("Enter Salary :");
        long salary=sc.nextLong();

        System.out.println("Enter Year :");
        int year=sc.nextInt();

        System.out.println("Enter Expenses :");
        long expense=sc.nextLong();

    empinfo e1=new empinfo(id,name,salary,year,expense);
    empinfo_serviceimpl ei=new empinfo_serviceimpl();
    boolean b= ei.add_emp(e1);
    System.out.println(b);
        System.out.println(ei.i + " row inserted ");
 }
}
