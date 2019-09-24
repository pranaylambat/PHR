/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yuvraj
 */
public class MySqlConnection {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dn_phr", "root", "");
            String sql = "";
            System.out.println("sql = " + sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public static PreparedStatement preStateMent(String query) throws SQLException {
        return getConnection().prepareStatement(query);
    }

    public static void main(String[] args) {
        try {
            String catalog = getConnection().getCatalog();
            System.out.println("catalog = " + catalog);
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
