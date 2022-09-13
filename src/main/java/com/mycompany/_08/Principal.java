/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._08;

import java.sql.*;

/**
 *
 * @author 22159663
 */
public class Principal {
    public static void main(String[] args) {
        
        Conectar obj = new Conectar();
        
        Connection conexao = obj.connectionMySql();
        
        obj.closeConnectionMySql(conexao);
        
        
        
    }
}
