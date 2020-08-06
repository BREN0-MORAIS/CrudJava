package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;
public  class Conexao {
    public Statement stm; 
    public ResultSet rs; 
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String caminho = "jdbc:sqlserver://192.168.56.1:1433;databaseName=CrudPaciente"; // O "control" representa a minha database 
    private String usuario = "sa";
    private String senha = "Wcogeomtgeo3027";
    public static Connection conexao; 

    
    public void conectar() { 
        try {
            System.setProperty("jdbc.Drivers", driver); 
            conexao = DriverManager.getConnection(caminho, usuario, senha); 
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro de conexão!\nERRO: " + ex.getMessage(), "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void desconectar() { 
        try {
            conexao.close(); 
            JOptionPane.showMessageDialog(null, "Conexão fechada com sucesso!", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\nERRO: " + ex.getMessage(), "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public static  Connection getConexao() {
		
		return conexao;
    	
    }
    
}