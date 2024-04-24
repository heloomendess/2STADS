/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocrudjdbc.dao;

import com.mycompany.exemplocrudjdbc.models.NotaFiscal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author heloisa.mnbarbosa
 */
public class NotaFiscalDao {
    
    public static String URL = "jdbc:mysql://localhost3306/basenotafiscal";
    public static String login = "root";
    public static String senha = "P@$$0rd";
    
    public static boolean salvar(NotaFiscal obj) {
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //Passo 1 - Carregar o drive
            Class.forName("com.mysql.cj.jdbl.Driver");
            
            //Passo 2 - Abrir conexao com o banco 
            conexao = DriverManager.getConnection(URL, login, senha);
            
            //Passo 3 - Preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM NotaFiscal");
            
            //Passo 4 - Passar os parametros para o comando SQL
            //comandoSQL.setInt(1, obj.getNumeroNota());
            //comandoSQL.setDouble(1, obj.getValorNota());
            
            //Passo 5 - Executar o comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotaFiscalDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    } // Fim do metodo Salvar
    
    public static ArrayList<NotaFiscal> listar() {
        
        ArrayList<NotaFiscal> lstNotas = new ArrayList<>();
            try {
            //Passo 1 - Carregar o drive
            Class.forName("com.mysql.cj.jdbl.Driver");
            
            //Passo 2 - Abrir conexao com o banco 
            conexao = DriverManager.getConnection(URL, login, senha);
            
            //Passo 3 - Preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT * FROM NotaFiscal");
            
            //Passo 4 - Passar os parametros para o comando SQL
            //comandoSQL.setInt(1, obj.getNumeroNota());
            //comandoSQL.setDouble(1, obj.getValorNota());
            
            //Passo 5 - Executar o comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            
            while(rs.next()) {
                int idNota = rs.getInt("idNota");
                int numeroNota = rs.getInt("numeroNota");
                double valorNota = rs.getDouble("valorNota");
                
                NotaFiscal itemNota = new NotaFiscal(idNota, numeroNota, valorNota);
                
                lstNotas.add(itemNota);
            }
            
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NotaFiscalDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NotaFiscalDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstNotas;
    }
    
}
