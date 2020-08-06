package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.PacienteDAO;
import Model.Paciente;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldCelular;
	private JTextField textFieldBairro;
	private JTextField textFieldTelefone;
	private JTextField textFieldCidade;
	private JTextField textFieldSobrenome;
	private JTextField textFieldId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarPaciente frame = new AtualizarPaciente();
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
	public AtualizarPaciente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(0, 153, 204));
		panel.setBounds(0, 0, 624, 336);
		contentPane.add(panel);
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		textFieldNome.setBounds(174, 33, 178, 20);
		panel.add(textFieldNome);
		
		JLabel label = new JLabel("Nome ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(174, 11, 128, 20);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Cidade");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(10, 76, 128, 20);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Endere\u00E7o");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(10, 132, 128, 20);
		panel.add(label_2);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(10, 163, 590, 20);
		panel.add(textFieldEndereco);
		
		textFieldCelular = new JTextField();
		textFieldCelular.setColumns(10);
		textFieldCelular.setBounds(321, 98, 128, 20);
		panel.add(textFieldCelular);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setColumns(10);
		textFieldBairro.setBounds(167, 98, 128, 20);
		panel.add(textFieldBairro);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		textFieldTelefone.setBounds(474, 98, 128, 20);
		panel.add(textFieldTelefone);
		
		JLabel label_4 = new JLabel("Telefone");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(474, 76, 128, 20);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Celular");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(321, 76, 128, 20);
		panel.add(label_5);
		
		JLabel label_8 = new JLabel("Bairro");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(167, 76, 128, 20);
		panel.add(label_8);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(10, 98, 128, 20);
		panel.add(textFieldCidade);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setColumns(10);
		textFieldSobrenome.setBounds(362, 33, 238, 20);
		panel.add(textFieldSobrenome);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(textFieldId.getText());
				String nome = textFieldNome.getText();
				String sobrenome = textFieldSobrenome.getText();
				String cidade = textFieldCidade.getText();
				String bairro = textFieldBairro.getText();
				String celular = textFieldCelular.getText();
				String telefone = textFieldTelefone.getText();
				String endereco = textFieldEndereco.getText();
				
		    Paciente p = new Paciente(nome,sobrenome,cidade,bairro,celular,telefone,endereco,id);
		
			PacienteDAO pacientedao = new PacienteDAO();
			pacientedao.Atualizar(p); 
			}
		});
		btnAtualizar.setForeground(Color.WHITE);
		btnAtualizar.setBackground(new Color(51, 153, 255));
		btnAtualizar.setBounds(261, 262, 115, 34);
		panel.add(btnAtualizar);
		
		textFieldId = new JTextField();
		textFieldId.setColumns(10);
		textFieldId.setBounds(10, 33, 138, 20);
		panel.add(textFieldId);
		
		JLabel label_10 = new JLabel("Id Paciente");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(10, 11, 128, 20);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Sobrenome");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_11.setBounds(362, 11, 128, 20);
		panel.add(label_11);
	}
}
