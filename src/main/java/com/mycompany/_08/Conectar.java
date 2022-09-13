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
public class Conectar {
    private static Connection conexao_MySql = null;
    
    private static String localBD = "localhost";
    
    private static String LINK = "jdbc:mysql://" + localBD + ":3306/siri_cascudo";
    
    private static final String usuario = "root";
    
    private static final String senha = "senha123";



    public Connection connectionMySql() {

        try {
            conexao_MySql = DriverManager.getConnection(LINK, usuario, senha);
            System.out.println("conexão OK");

        } catch (SQLException e) {
            throw new RuntimeException("Ocorreu um problema na conexão com o BD", e);

        }
        return conexao_MySql;

    }   
    
    
    
    public void insereDireto (Connection con){
        try{
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO aluno(codigo, nome," + "email, codcidade)" + "VALUES (null, \"José\", \"jose@gmail.com\", 3);");
        }
        catch (Exception e){
            System.out.println("Erro!!" + e);
        }
        
    }
    
    public void closeConnectionMySql (Connection con) {
        
            try{
                if (con != null){
                    con.close();
                    System.out.println("Fechamento OK");
                }
            } catch (SQLException e){
                throw new RuntimeException("Ocorreu um problema para encerrar a conexão com o BD", e);
            }
        }
    
    public void novoFuncionario(Connection con, long CPF, String Nome, String RG, float Salario, long CEP, String Senha, int Nivel){
        try{
            String sql = "INSERT IGNORE INTO Funcionarios VALUES (?,?,?,?,?,?,?);";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setLong(1, CPF);
            pstm.setString(2, Nome);
            pstm.setString(3, RG);
            pstm.setFloat(4, Salario);
            pstm.setLong(5, CEP);
            pstm.setString(6, Senha);
            pstm.setInt(7, Nivel);
            
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao inserir!" + e);
        }
    
    }
    
    public void consultaFuncionario(Connection con) {
        try {
            Statement stml = con.createStatement();
            ResultSet rs = stml.executeQuery("select * from Funcionarios");
            while (rs.next()){
                System.out.println("\n   CPF:" + rs.getLong(1) +"\n   Nome:" + rs.getString(2) + "\n   RG:" + rs.getString(3) + "\n   Salário:" + rs.getFloat(4) + "\n   CEP: " + rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
