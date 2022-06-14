package DAO;

import DAO.mapper.EmployeeRowMapper;
import domainmodel.Employee;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployeeDAO implements IDao {

    private DriverManagerDataSource dataSource;

    @Override
    public void setDataSource(DriverManagerDataSource ds) {
        dataSource = ds;

    }

    @Override
    public void deleteByID(int id) {
        JdbcTemplate deleteByID = new JdbcTemplate(dataSource);
        deleteByID.update("DELETE from pracownicy where prac_id= ?",
                new Object[]{id});
    }

    @Override
    public void create(String imie, String nazw, int wiek, String nr_tel, String e_mail) {
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update("INSERT INTO pracownicy (prac_imie,prac_nazwisko,prac_wiek,prac_nr_telefonu,prac_email) VALUES(?,?,?,?,?)",
                new Object[]{imie, nazw, wiek, nr_tel, e_mail});
    }

    @Override
    public List<Employee> selectAll() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("select prac_id,prac_imie,prac_nazwisko,prac_wiek,prac_nr_telefonu,prac_email from pracownicy",
                new EmployeeRowMapper());
    }

    @Override
    public Employee getByID(int id) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        String sql = "select prac_id,prac_imie,prac_nazwisko,prac_wiek,prac_nr_telefonu,prac_email from pracownicy where prac_id= ?";

        return select.queryForObject(sql, new Object[]{id},
                (rs, rowNum)
                -> new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6)
                )
        );
    }

    @Override
    public void update(int id, String imie, String nazw, int wiek, String nr_tel, String e_mail) {
        String query = "update pracownicy\n"
                + "set prac_imie= ?,prac_nazwisko= ?,prac_wiek= ?,prac_nr_telefonu= ?,prac_email= ?\n"
                + "where prac_id= ?";
        JdbcTemplate update = new JdbcTemplate(dataSource);
        update.update(query, new Object[]{imie, nazw, wiek, nr_tel, e_mail, id});

    }

}
