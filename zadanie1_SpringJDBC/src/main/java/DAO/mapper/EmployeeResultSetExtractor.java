package DAO.mapper;

import domainmodel.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeResultSetExtractor implements ResultSetExtractor {

    @Override
    public Object extractData(ResultSet rs) throws SQLException {
        Employee emp = new Employee();
        emp.setPracId(rs.getInt(1));
        emp.setPracImie(rs.getString(2));
        emp.setPracNazwisko(rs.getString(3));
        emp.setPracWiek(rs.getInt(4));
        emp.setPracNrTelefonu(rs.getString(5));
        emp.setPracEmail(rs.getString(6));
        return emp;

    }
}
