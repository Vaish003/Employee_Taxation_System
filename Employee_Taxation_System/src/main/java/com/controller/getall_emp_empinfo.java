package com.controller;

import com.pojo.empinfo;
import com.serviceimpl.empinfo_serviceimpl;

import java.util.List;

public class getall_emp_empinfo {
    public static void main(String[] args) {
        empinfo e=new empinfo();
        empinfo_serviceimpl ei=new empinfo_serviceimpl();
        List<empinfo> l=ei.getAll_emp(e);
    }
}
