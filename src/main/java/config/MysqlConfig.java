package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConfig {

    // Mở kết nối tới cơ sở dữ liệu

    public static Connection getConnection() {

        Connection connection = null ;

        try {

            //Google driver class mySQL - Khai báo driver sử dụng cho JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/crm06", "root" , "admin123");

        } catch (Exception e) {
            System.out.println("Lỗi không tìm thấy CSDL" + e.getMessage());
        }

        return connection;
    }

}

