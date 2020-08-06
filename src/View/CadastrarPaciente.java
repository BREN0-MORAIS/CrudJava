package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.Conexao;
import DAO.PacienteDAO;
import Model.Paciente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class CadastrarPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldCPF;
	private JTextField textFieldCelular;
	private JTextField textFieldBairro;
	private JTextField textFieldTelefone;
	private JTextField textFieldIdade;
	private JTextField textFieldSexo;
	private JTextField textFieldCidade;
	private JTextField textFieldSobrenome;
	private JTextField textFieldRG;
	private JTextField textFieldId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarPaciente frame = new CadastrarPaciente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarPaciente() {
		setTitle("Cadastrar Paciente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 363);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(10, 33, 128, 20);
		contentPane.add(textFieldNome);
		
		JLabel label = new JLabel("Nome ");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(10, 11, 128, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Cidade");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(10, 76, 128, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Endere\u00E7o");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(10, 132, 128, 20);
		contentPane.add(label_2);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(10, 163, 590, 20);
		contentPane.add(textFieldEndereco);
		
		JLabel label_3 = new JLabel("CPF");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(10, 194, 128, 20);
		contentPane.add(label_3);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(10, 216, 128, 20);
		contentPane.add(textFieldCPF);
		
		JButton button = new JButton("Salvar");
		button.setBackground(new Color(51, 153, 255));
		button.setForeground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
				
		
			public void actionPerformed(ActionEvent arg0) {
				String nome = textFieldNome.getText();
				String sobrenome = textFieldSobrenome.getText();
				int idade = Integer.parseInt(textFieldIdade.getText());
				String sexo = textFieldSexo.getText();
				String cidade = textFieldCidade.getText();
				String bairro = textFieldBairro.getText();
				String celular = textFieldCelular.getText();
				String telefone = textFieldTelefone.getText();
				String endereco = textFieldEndereco.getText();
				String cpf = textFieldCPF.getText();
				String rg = textFieldRG.getText();
				
		    Paciente p = new Paciente( nome, sobrenome,  idade, sexo, cidade, bairro ,  celular, telefone,  endereco, cpf, rg );
		
			PacienteDAO pacientedao = new PacienteDAO();
			pacientedao.incluir(p);  
			
			}
		});
		
		
		
		
	
		button.setBounds(260, 279, 115, 34);
		contentPane.add(button);
		
		textFieldCelular = new JTextField();
		textFieldCelular.setColumns(10);
		textFieldCelular.setBounds(321, 98, 128, 20);
		contentPane.add(textFieldCelular);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setColumns(10);
		textFieldBairro.setBounds(167, 98, 128, 20);
		contentPane.add(textFieldBairro);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(474, 98, 128, 20);
		contentPane.add(textFieldTelefone);
		
		JLabel label_5 = new JLabel("Telefone");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(474, 76, 128, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Celular");
		label_6.setForeground(new Color(255, 255, 255));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(321, 76, 128, 20);
		contentPane.add(label_6);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setColumns(10);
		textFieldIdade.setBounds(321, 33, 128, 20);
		contentPane.add(textFieldIdade);
		
		JLabel label_7 = new JLabel("Idade");
		label_7.setForeground(new Color(255, 255, 255));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(321, 11, 128, 20);
		contentPane.add(label_7);
		
		textFieldSexo = new JTextField();
		textFieldSexo.setColumns(10);
		textFieldSexo.setBounds(474, 33, 128, 20);
		contentPane.add(textFieldSexo);
		
		JLabel label_9 = new JLabel("Sexo");
		label_9.setForeground(new Color(255, 255, 255));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(474, 11, 128, 20);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Bairro");
		label_10.setForeground(new Color(255, 255, 255));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(167, 76, 128, 20);
		contentPane.add(label_10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(10, 98, 128, 20);
		contentPane.add(textFieldCidade);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setColumns(10);
		textFieldSobrenome.setBounds(167, 33, 128, 20);
		contentPane.add(textFieldSobrenome);
		
		textFieldRG = new JTextField();
		textFieldRG.setColumns(10);
		textFieldRG.setBounds(167, 216, 128, 20);
		contentPane.add(textFieldRG);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setForeground(Color.WHITE);
		lblRg.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRg.setBounds(167, 194, 128, 20);
		contentPane.add(lblRg);
		
		textFieldId = new JTextField();
		textFieldId.setColumns(10);
		textFieldId.setBounds(324, 216, 128, 20);
		contentPane.add(textFieldId);
		
		JLabel lblIdPaciente = new JLabel("Id Paciente");
		lblIdPaciente.setForeground(Color.WHITE);
		lblIdPaciente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdPaciente.setBounds(324, 194, 128, 20);
		contentPane.add(lblIdPaciente);
		
		JLabel label_4 = new JLabel("Sobrenome");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(167, 11, 128, 20);
		contentPane.add(label_4);
	}
}
