/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.servlet;

import com.main.services.MySqlConnection;
import java.sql.ResultSet;

/**
 *
 * @author yuvraj
 */
public class LoginProcess {

    public static String loginDoctor(String username, String password) {
        String string = "";
        try {
            String sql = "SELECT *  FROM  `dregistration` WHERE email_id = '" + username + "' AND password = '" + password + "'";
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                string = executeQuery.getString(1);
            }
        } catch (Exception e) {
        }
        return string;
    }

    public static String checkDoctor(String username) {
        String string = "";
        try {
            String sql = "SELECT txtId  FROM  `dregistration` WHERE email_id = '" + username + "'";
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                string = executeQuery.getString(1);
            }
        } catch (Exception e) {
        }
        return string;
    }

    public static String loginPaitenet(String username, String password) {
        String string = "";
        try {
            String sql = "SELECT *  FROM  `pregistration` WHERE email_id = '" + username + "' AND password = '" + password + "'";
            System.out.println("sql = " + sql);
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                string = executeQuery.getString(1);
                System.out.println("executeQuery = " + string);
            }
        } catch (Exception e) {
        }
        return string;
    }
    
    
    public static String checkPaitent(String username) {
        String string = "";
        try {
            String sql = "SELECT txtId  FROM  `pregistration` WHERE email_id = '" + username + "'";
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                string = executeQuery.getString(1);
            }
        } catch (Exception e) {
        }
        return string;
    }

    public static String dLoginName(String username, String password) {
        String string = "";
        try {
            String sql = "SELECT full_name  FROM  `dregistration` WHERE email_id = '" + username + "' AND password = '" + password + "'";
            System.out.println("sql = " + sql);
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                string = executeQuery.getString("full_name");
                System.out.println("executeQuery = " + string);
            }
        } catch (Exception e) {
        }
        return string;
    }

    public static String loginName(String username, String password) {
        String string = "";
        try {
            String sql = "SELECT full_name  FROM  `pregistration` WHERE email_id = '" + username + "' AND password = '" + password + "'";
            System.out.println("sql = " + sql);
            ResultSet executeQuery = MySqlConnection.preStateMent(sql).executeQuery();
            while (executeQuery.next()) {
                string = executeQuery.getString("full_name");
                System.out.println("executeQuery = " + string);
            }
        } catch (Exception e) {
        }
        return string;
    }
}
