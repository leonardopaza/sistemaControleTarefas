/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author leonardo
 */
public class CriarConexao {
    
    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Conectado ao banco");
            return DriverManager.getConnection("jdbc:mysql://localhost/rdalteracoes", "root", "12qwaszx@");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}