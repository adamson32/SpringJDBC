
package connect;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class SpringJdbcConfig {
     public DriverManagerDataSource mssqlDataSource() {
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://LAPTOP-442E11CB\\SQLEXPRESS:1433;databaseName=company;selectMethod=cursor;encrypt=false");
        dataSource.setUsername("adam");
        dataSource.setPassword("adam");
         return dataSource;
         
     }
    
}
