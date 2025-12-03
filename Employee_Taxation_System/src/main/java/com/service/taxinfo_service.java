package com.service;

import com.pojo.empinfo;

public interface taxinfo_service {
    empinfo getemp(int empid);
    boolean taxcal(Integer id);
}
