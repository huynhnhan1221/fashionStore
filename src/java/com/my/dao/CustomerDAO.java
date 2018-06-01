/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.dao;

import com.my.bean.Customer;
import com.my.bean.User;
import com.my.common.Common;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;

/**
 *
 * @author vivtory
 */
public class CustomerDAO {
    private Connection conn;
    public CustomerDAO() {}
    
    public Hashtable selectAll(){
        Hashtable customers = new Hashtable();
        //String query = "Select a.*, b.email From customer a, user b WHERE b.username=a.username AND b.role=2";
        String query = "Select a.*, b.email, b.role From customer a, user b WHERE b.username=a.username";
        conn = new Common().getDBConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Customer cus = new Customer(rs.getString(1), rs.getString(2),rs.getString(3),
                        rs.getDate(4),rs.getString(5),rs.getString(6),rs.getLong(7), rs.getString(8));
                customers.put(cus.getId(), cus);
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return customers;
    }
    
    public Hashtable selectAll_1(){
        Hashtable customers = new Hashtable();
        String query = "Select a.*, b.email From customer a, user b WHERE b.username=a.username AND b.role=2";
       // String query = "Select a.*, b.email, b.role From customer a, user b WHERE b.username=a.username";
        conn = new Common().getDBConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Customer cus = new Customer(rs.getString(1), rs.getString(2),rs.getString(3),
                        rs.getDate(4),rs.getString(5),rs.getString(6),rs.getLong(7), rs.getString(8));
                customers.put(cus.getId(), cus);
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return customers;
    }
    
    public boolean addCustomer(Customer cus){
        String query = "Insert Into customer(username,fullname,birthday,address,phonenumber,balance) VALUES(?,?,?,?,?,?)";
        String query2 = "INSERT INTO user(username,pword,role,email) VALUES(?,?,?,?)";
        conn = new Common().getDBConnection();
        try{
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, cus.getUsername());
            cs.setString(2, cus.getFullname());
            cs.setString(3, cus.getBirthdayToString());
            cs.setString(4, cus.getAddress());
            cs.setString(5, cus.getPhonenumber());
            cs.setLong(6, cus.getBalance());
            int result = cs.executeUpdate();
            
            CallableStatement cs2 = conn.prepareCall(query2);
            cs2.setString(1, cus.getUsername());
            cs2.setString(2, cus.getPword());
            cs2.setString(3, cus.getRole());
            cs2.setString(4, cus.getEmail());
            result = cs2.executeUpdate();
            
            conn.close();
            if(result==1)   return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public boolean editCustomer(Customer cus){
        String query = "UPDATE customer a,user b SET pword=?, address=?, phonenumber=?, email=? "
                + "WHERE a.username=? AND a.username=b.username";
        conn = new Common().getDBConnection();
        try{
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, cus.getPword());
            cs.setString(2, cus.getAddress());
            cs.setString(3, cus.getPhonenumber());
            cs.setString(4, cus.getEmail());
            cs.setString(5, cus.getUsername());
            int result = cs.executeUpdate();
            System.out.println(result);
            conn.close();
            if(result>=1) return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    public boolean deleteCustomer(String cusName){
        String query = "DELETE FROM customer WHERE username=?";
        conn = new Common().getDBConnection();
        try{
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, cusName);
            int result = cs.executeUpdate();
            conn.close();
            if(result==1) return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
   
    public boolean buyBalance(String cusID, int balance){
        long bl = getBalance(cusID);
        balance += bl;
        String query = "UPDATE customer SET balance=? WHERE id=?";
        conn = new Common().getDBConnection();
        try{
            CallableStatement cs = conn.prepareCall(query);
            cs.setInt(1, balance);
            cs.setString(2, cusID);
            int result = cs.executeUpdate();
            conn.close();
            if(result==1)   return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    public long getBalance(String cusID){
        int balance=0;
        String query = "SELECT balance FROM customer WHERE id=" + cusID;
        conn = new Common().getDBConnection();
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(rs.next())   balance = rs.getInt(1);
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
            return balance;
        }
        return balance;
    }
    public Customer checkLogin(User user){
        Customer cus = null;
        String query = "SELECT a.*, b.* FROM user a, customer b "
                + "WHERE a.username=? AND a.pword=? AND a.username=b.username";
        conn = new Common().getDBConnection();
        try{
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, user.getUsername());
            cs.setString(2, user.getPword());
            
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                cus = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), 
                     rs.getString(4), rs.getString(5), rs.getString(7), 
                        rs.getDate(8), rs.getString(9), rs.getString(10), rs.getLong(11));
            }
        }catch(Exception e){
            e.printStackTrace();
            return cus;
        }
        return cus;
    }
    public boolean payOrder(String cusID, long fee){
        long balance = getBalance(cusID);
        balance -= fee;
        String query = "UPDATE customer SET balance=? WHERE id=?";
        conn = new Common().getDBConnection();
        try{
            CallableStatement cs = conn.prepareCall(query);
            cs.setLong(1, balance);
            cs.setString(2, cusID);
            int result = cs.executeUpdate();
            conn.close();
            if(result==1)   return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
