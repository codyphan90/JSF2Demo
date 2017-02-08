/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class RegDTO implements Serializable {

    private String username;
    private String password;
    private String lastname;
    private boolean roles;
    
    //Tham so ket noi DB
    String hostName = "10.84.82.50";
    String dbName = "anhpv";
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public RegDTO() {
    }

    public RegDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public RegDTO(String username, String password, boolean roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public RegDTO(String username, String password, String lastname, boolean roles) {
        this.username = username;
        this.password = password;
        this.lastname = lastname;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isRoles() {
        return roles;
    }

    public void setRoles(boolean roles) {
        this.roles = roles;
    }

    public void connectDB() throws ClassNotFoundException, SQLException {
        //Ket noi DB
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        con = DriverManager.getConnection(url, "root", "rdvivas@123");
    }
    public void closeConnDB() throws SQLException{
        if (rs != null) {
                    rs.close();
                }
                if (stm != null) {
                    stm.close();
                }
                if (con != null) {
                    con.close();
                }
    }

    public boolean checkLogin() throws SQLException, ClassNotFoundException {
        try{    
        //Goi ham ket noi DB
            connectDB();
            String sql = "Select * from Registration where username = ? and "
                    + "password = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, this.username);
            stm.setString(2, this.password);
            rs = stm.executeQuery();

            //Kiem tra login dung ko?
            if (rs.next()) {
                return true;
            }
        } finally {
            closeConnDB();
        }
        return false;
    }
    public RegDTO[] seachLikeLastName(String name) throws ClassNotFoundException, SQLException{
        try{
        connectDB();
        String sql = "Select * from Registration where lastname like ?";
        stm = con.prepareStatement(sql);
        stm.setString(1, "%" + name + "%");
        rs = stm.executeQuery();
        ArrayList list = new ArrayList();
        while (rs.next()){
            String sUser = rs.getString("username");
            String sPass = rs.getString("password");
            String sLast = rs.getString("lastname");
            boolean sRole = rs.getBoolean("isAdmin");
            RegDTO tmp = new RegDTO(sUser, sPass, sLast, sRole);
            list.add(tmp);
        }
        RegDTO[] result = new RegDTO[list.size()];
        list.toArray(result);
        if (!result.equals(null)){
            return result;
        }
        } finally{
        closeConnDB();
        }
        return null;
    }
    public boolean updateAccount() throws ClassNotFoundException, SQLException{
        try{
        connectDB();
        String sql ="Update Registration set lastname = ?, isAdmin = ? where "
                + "username = ?";
        stm = con.prepareStatement(sql);
        stm.setString(1, lastname);
        stm.setBoolean(2, roles);
        stm.setString(3, username);
        int row = stm.executeUpdate();
        if(row>0){
            System.out.println("update succes");
            return true;
        }
        } finally {
        closeConnDB();
        }
        return false;
    }
    public boolean insertAccount() throws ClassNotFoundException, SQLException {
        try{
        connectDB();
        String sql = "insert into Registration(username, password, lastname,isAdmin)"
                + "values(?,?,?,?)";
        stm = con.prepareStatement(sql);
        stm.setString(1, username);
        stm.setString(2, password);
        stm.setString(3, lastname);
        stm.setBoolean(4, roles);
        int row = stm.executeUpdate();
            System.out.println("Inserting into DB...");
        if (row>0){
            return true;
        }
        } finally {
        closeConnDB();
            System.out.println("Insert done");
        }
        return false;
}
    public boolean deleteAccount() throws ClassNotFoundException, SQLException{
        try {
            connectDB();
            String sql = "Delete from Registration where username = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, username);
            int row = stm.executeUpdate();
            System.out.println("Deleting account in DB: "+username);
            if (row>0){
                
                return true;
            }
        } 
        finally {
            closeConnDB();
            System.out.println("Delete done");
        }
        return false;
    }
}
