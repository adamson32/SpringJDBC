
package com.mycompany.zadanie1_springjdbc;

import DAO.EmployeeDAO;
import connect.SpringJdbcConfig;


public class Main {

    
    public static void main(String[] args) {
        EmployeeDAO empDao=new EmployeeDAO();
        SpringJdbcConfig sjc=new SpringJdbcConfig();
        empDao.setDataSource(sjc.mssqlDataSource());
    }
    
}
