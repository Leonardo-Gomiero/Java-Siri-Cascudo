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
    
    public void novoItemCardapio(Connection con, String nome, String tipo, int valor, String composicao){
        try{
            
            String sql = "INSERT IGNORE INTO Cardapio VALUES (null,?,?,?,?);";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setString(1, nome);
            pstm.setString(2, tipo);
            pstm.setInt(3, valor);
            pstm.setString(4, composicao);
            
            
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao inserir!" + e);
        }
    
    }
    
    public void consultaCardapio(Connection con) {
        try {
            Statement stml = con.createStatement();
            ResultSet rs = stml.executeQuery("select * from Cardapio");
            while (rs.next()){
                System.out.println(
                        "\n   ID:" + rs.getInt(1) +
                        "\n   Nome:" + rs.getString(2) +
                        "\n   Tipo:" + rs.getString(3) +
                        "\n   Valor:" + rs.getFloat(4) +
                        "\n   Composição: " + rs.getString(5)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public void novoServicoDelivery(Connection con, String nome, int taxa){
        try{
            
            String sql = "INSERT IGNORE INTO Delivery VALUES (null,?,?);";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setString(1, nome);
            pstm.setInt(2, taxa);
            
            
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao inserir!" + e);
        }
    
    }
    
    public void consultaDelivery(Connection con) {
        try {
            Statement stml = con.createStatement();
            ResultSet rs = stml.executeQuery("select * from Delivery");
            while (rs.next()){
                System.out.println(
                        "\n   ID:" + rs.getInt(1) +
                        "\n   Nome:" + rs.getString(2) +
                        "\n   Taxa:" + rs.getInt(3)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void novoFornecedor(Connection con, long cnpj, String nome, String produto){
        try{
            
            String sql = "INSERT IGNORE INTO Fornecedores VALUES (?,?,?);";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setLong(1, cnpj);
            pstm.setString(2, nome);
            pstm.setString(3, produto);
            
            
            
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao inserir!" + e);
        }
    
    }
    
    public void consultaFornecedor(Connection con) {
        try {
            Statement stml = con.createStatement();
            ResultSet rs = stml.executeQuery("select * from Fornecedores");
            while (rs.next()){
                System.out.println(
                        "\n   ID:" + rs.getLong(1) +
                        "\n   Nome:" + rs.getString(2) +
                        "\n   Produto:" + rs.getString(3)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void novoInsumo(Connection con, String nome, int preco, int quantidade){
        try{
            
            String sql = "INSERT IGNORE INTO Insumos VALUES (null, ?,?,?);";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setString(1, nome);
            pstm.setInt(2, preco);
            pstm.setInt(3, quantidade);
            
            
            
            pstm.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao inserir!" + e);
        }
    
    }
    
    public void consultaInsumo(Connection con) {
        try {
            Statement stml = con.createStatement();
            ResultSet rs = stml.executeQuery("select * from Insumos");
            while (rs.next()){
                System.out.println(
                        "\n   ID:" + rs.getInt(1) +
                        "\n   Nome:" + rs.getString(2) +
                        "\n   Produto:" + rs.getInt(3) +
                        "\n   Quantidade:" + rs.getInt(4)      
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
