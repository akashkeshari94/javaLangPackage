package com.learning.lang.object.getclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("");
        System.out.println(con.getClass().getName());
    }

    // After loading every .clas dile, JVM will create an object of the type java.lang.class in heap area,
    // Programmer can use this class object, to get class level information

    // We can use get class method, in reelection
}
