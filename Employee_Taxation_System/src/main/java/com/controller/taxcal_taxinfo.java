package com.controller;

import com.pojo.empinfo;
import com.pojo.taxinfo;
import com.serviceimpl.taxinfo_serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class taxcal_taxinfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id : ");
        int id=sc.nextInt();
        taxinfo_serviceimpl ti=new taxinfo_serviceimpl();
        boolean b= ti.taxcal(id);
        System.out.println(b);

        
    }
}
