package com.controller;

import com.pojo.empinfo;
import com.serviceimpl.empinfo_serviceimpl;

import java.util.Scanner;

public class delete_emp_empinfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id :");
        int id=sc.nextInt();
        empinfo e=new empinfo(id);
        empinfo_serviceimpl ei=new empinfo_serviceimpl();
        empinfo b=ei.delete_emp(e);
        System.out.println(ei.i +"row deleted succesfully");
    }
}
