package com.mycompany.zadanie1_springjdbc;

import DAO.EmployeeDAO;
import connect.SpringJdbcConfig;
import domainmodel.Employee;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmployeeDAO empDao = new EmployeeDAO();
        SpringJdbcConfig sjc = new SpringJdbcConfig();
        empDao.setDataSource(sjc.mssqlDataSource());
//        empDao.create("Adam", "Kowalski", 22, "123789546", "email@op.pl");
//        empDao.create("Jan", "Kowalski", 22, "123789547", "jan@op.pl");
//        List<Employee> list = empDao.selectAll();
//        for (Employee emp : list) {
//            System.out.print(emp.getPracId() + " ");
//            System.out.println(emp.getPracImie() + " ");
//            System.out.println(emp.getPracNazwisko() + " ");
//            System.out.println(emp.getPracWiek() + " ");
//            System.out.println(emp.getPracNrTelefonu() + " ");
//            System.out.println(emp.getPracEmail() + " ");
//        }
//        Employee p1 = empDao.getByID(34);
//        System.out.println(p1.getPracId() + " " + p1.getPracImie() + " " + p1.getPracEmail());
//        empDao.update(1, "Ada", "Nowak", 22, "432561765", "ada@op.pl");
    }

}
