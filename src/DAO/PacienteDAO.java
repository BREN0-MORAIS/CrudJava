package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Paciente;

public class PacienteDAO{	
	String SqlInsertPessoa = "insert into Paciente (nome,sobrenome,idade,sexo,cidade,bairro,celular,telefone,endereco , CPF,RG)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?)";
	String SqlUpdatePessoa = "update Paciente set nome = ?,sobrenome = ?,cidade = ?,bairro= ?,celular = ?,telefone = ?,endereco =? where id = ?";
	String SqlDeletePessoa = "delete from Paciente where id = ? or CPF = ?";
		PreparedStatement psSqlInsertPessoa1,psSqlAtualizarPessoa1,psSqlDeletePessoa1;
	public PacienteDAO( ) {
		
		try {
			Conexao conexao = new Conexao();
	       conexao.conectar();

	        psSqlInsertPessoa1 = Conexao.getConexao().prepareStatement(SqlInsertPessoa);
	        psSqlAtualizarPessoa1 = Conexao.getConexao().prepareStatement(SqlUpdatePessoa);
	        psSqlDeletePessoa1 = Conexao.getConexao().prepareStatement(SqlDeletePessoa);
	        psSqlDeletePessoa1.execute();
	        psSqlInsertPessoa1.execute();
	        psSqlAtualizarPessoa1.execute();
			
		} catch (Exception e) {
					}
	}
	
    public void incluir(Paciente paciente){
        try {
           
        	psSqlInsertPessoa1.setString(1, paciente.getNome());
        	psSqlInsertPessoa1.setString(2, paciente.getSobrenome());
        	psSqlInsertPessoa1.setInt(3, paciente.getIdade());
        	psSqlInsertPessoa1.setString(4, paciente.getSexo());
        	psSqlInsertPessoa1.setString(5, paciente.getCidade());
        	psSqlInsertPessoa1.setString(6, paciente.getBairro());
        	psSqlInsertPessoa1.setString(7, paciente.getCelular());
        	psSqlInsertPessoa1.setString(8, paciente.getTelefone());
         	psSqlInsertPessoa1.setString(9, paciente.getEndereco());
         	psSqlInsertPessoa1.setString(10, paciente.getCPF());
         	psSqlInsertPessoa1.setString(11, paciente.getRG());
           
          
        	psSqlInsertPessoa1.execute();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }

       }

    public void Atualizar(Paciente paciente){
        try {
        	psSqlAtualizarPessoa1.setInt(8, paciente.getId());
        	psSqlAtualizarPessoa1.setString(1, paciente.getNome());
        	psSqlAtualizarPessoa1.setString(2, paciente.getSobrenome());
        	psSqlAtualizarPessoa1.setString(3, paciente.getCidade());
        	psSqlAtualizarPessoa1.setString(4, paciente.getBairro());
        	psSqlAtualizarPessoa1.setString(5, paciente.getCelular());
        	psSqlAtualizarPessoa1.setString(6, paciente.getTelefone());
        	psSqlAtualizarPessoa1.setString(7, paciente.getEndereco());
           
          
        	psSqlAtualizarPessoa1.execute();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
        
       
       }
    

public void Delete(Paciente paciente){
    try {
    	psSqlDeletePessoa1.setInt(1, paciente.getId());
    	psSqlDeletePessoa1.setString(2, paciente.getCPF());
      
    	psSqlDeletePessoa1.execute();
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
    
   
   }

}


