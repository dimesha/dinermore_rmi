/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author dimesha
 */
public class DBconnection {
    private static DBconnection dBconnection;
    private BasicDataSource bs;

    private DBconnection() throws SQLException, ClassNotFoundException{
        bs=new BasicDataSource();
        bs.setDriverClassName("com.mysql.jdbc.Driver");
        bs.setUrl("jdbc:mysql://localhost:3308/dine");
        bs.setUsername("root");
        bs.setPassword("12345");
        bs.setInitialSize(2);
        bs.setMaxTotal(2);
        
    }
    public static DBconnection getinstance() throws SQLException, ClassNotFoundException{
        if (dBconnection==null) {
            dBconnection=new DBconnection();
                    
        }
        return dBconnection;
    }
    public Connection getconnection() throws SQLException{
        return bs.getConnection();
    }
    
}
