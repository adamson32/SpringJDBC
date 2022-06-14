
package DAO;

import domainmodel.Employee;
import java.util.List;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public interface IDao {
    void setDataSource(DriverManagerDataSource ds);
    void deleteByID(int id);
    void create(String imie,String nazw,int wiek,String nr_tel,String e_mail);
     List<Employee> selectAll();
     Employee getByID(int id);
     void update(int id,String imie,String nazw,int wiek,String nr_tel,String e_mail);

}
