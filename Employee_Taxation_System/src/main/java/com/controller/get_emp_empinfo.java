package com.controller;

import com.pojo.empinfo;
import com.serviceimpl.empinfo_serviceimpl;

import java.util.Scanner;

public class get_emp_empinfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id :");
        int id=sc.nextInt();
        empinfo e2=new empinfo(id);
        empinfo_serviceimpl esi =new empinfo_serviceimpl();
        empinfo b= esi.get_emp(e2);
        System.out.println(b);
    }

}
