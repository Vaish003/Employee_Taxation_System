package com.service;

import com.pojo.empinfo;

import java.util.List;

public interface empinfo_service {
    boolean add_emp(empinfo e);
    empinfo get_emp(empinfo e);
    empinfo delete_emp(empinfo e);
    List<empinfo>getAll_emp(empinfo e);
}
