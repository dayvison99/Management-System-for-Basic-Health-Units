/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Persistencia;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author dayvison
 */
public class conexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost/SGUBS";
    private String usuario = "root";
    private String senha = "marley99";
    public Connection con;
    
    public void conexao(){
        
        try {
        System.setProperty("jdbc.Driver", driver);
        con=DriverManager.getConnection(caminho, usuario, senha);
           // JOptionPane.showMessageDialog(null, "ok");
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "erro : \n"+ex.getMessage());
        }
   }
    
    public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "desconectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro : \n"+ex.getMessage());
        }
    }
    
    public void excultaSQL(String sql){
        try {
            stm=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY,rs.CONCUR_UPDATABLE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro"+e.getMessage());
        }
       
    }
}
