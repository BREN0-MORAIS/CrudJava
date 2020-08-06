package Model;

public class Paciente {



	private int Id;
	private String Nome;
	private String Sobrenome;
	private int Idade;
	private String Sexo;
	private String Cidade;
	private String Bairro;
	private String Celular;
	private String Telefone;
	private String Endereco;
	private String CPF;
	private String RG;
	//, String sobrenome, int idade, String sexo, String cidade, String bairro,
		//	String celular, String telefone, String endereco, String cPF, String rG
	public Paciente(String nome,String sobrenome,String cidade,String bairro , String celular,String telefone, String endereco,int id) {
	    this.Id = id;
		this.Nome = nome;
	    this.Sobrenome = sobrenome;
		this.Cidade = cidade;
		this.Bairro = bairro;
		this.Celular = celular;
		this.Telefone = telefone;
		this.Endereco = endereco;
	}
	
	public Paciente(String nome,String sobrenome,  int idade,String sexo,String cidade,String bairro , String celular,String telefone, String endereco,String cpf,String rg) {
		this.Nome = nome;
	    this.Sobrenome = sobrenome;
		this.Idade = idade;
		this.Sexo = sexo;
		this.Cidade = cidade;
		this.Bairro = bairro;
		this.Celular = celular;
		this.Telefone = telefone;
		this.Endereco = endereco;
		this.CPF = cpf;
		this.RG = rg;
	}
	
	
	public Paciente(int id ) {
		this.Id = id;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	
	
}
