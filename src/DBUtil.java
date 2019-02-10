/* Input Module */

package com.student.util;

/* Import JDBC */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.AppConstants;

/* Class Files */
public class DBUtil {
    private static DBUtil db;

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    private DBUtil(){

    }
}

public static DBUtil getDbUtil() {
    if(db == null){
        db == new DBUtil();
    }
    return db;
}

public int executeUpdate(String sql) {
    int result = -1;
    if (getConn() == null){
        return result;
    }
    try {
        ps = conn.prepareStatement(sql);
        result = ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return result;
    }
}
