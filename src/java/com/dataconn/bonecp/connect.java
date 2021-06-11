/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataconn.bonecp;

/**
 *
 * @author Hanzla Khan
 */

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class connect {
    
    
    
    private static connect datasource;
    private BoneCP connectionPool;

    private connect() throws IOException, SQLException, PropertyVetoException {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try {
            
            BoneCPConfig config = new BoneCPConfig();
            
            config.setJdbcUrl("jdbc:mysql://localhost/ooselab6");
            config.setUsername("root");
            config.setPassword("");
            config.setMinConnectionsPerPartition(5);
            config.setMaxConnectionsPerPartition(10);
            config.setPartitionCount(1);
            
            connectionPool = new BoneCP(config);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

    }

    public static connect getInstance() throws IOException, SQLException, PropertyVetoException {
        if (datasource == null) {
            datasource = new connect();
            return datasource;
        } else {
            return datasource;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.connectionPool.getConnection();
    }
    
    
    
    
}
