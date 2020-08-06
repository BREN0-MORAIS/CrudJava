package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Principal {

	private JFrame frmSistemaCovid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Principal window = new Principal();
					window.frmSistemaCovid.setVisible(true);
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaCovid = new JFrame();
		frmSistemaCovid.getContentPane().setBackground(new Color(51, 102, 204));
		frmSistemaCovid.setTitle("Sistema Covid");
		frmSistemaCovid.setBackground(new Color(51, 51, 204));
		frmSistemaCovid.setBounds(100, 100, 450, 300);
		frmSistemaCovid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaCovid.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema COVID");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel.setBounds(116, 24, 279, 74);
		frmSistemaCovid.getContentPane().add(lblNewLabel);
		
		JButton btnCadastrarPaciente = new JButton("Cadastrar");
		btnCadastrarPaciente.setForeground(new Color(255, 255, 255));
		btnCadastrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CadastrarPaciente().setVisible(true);
				
			}
		});
		btnCadastrarPaciente.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCadastrarPaciente.setBackground(new Color(51, 153, 255));
		btnCadastrarPaciente.setBounds(10, 145, 124, 47);
		frmSistemaCovid.getContentPane().add(btnCadastrarPaciente);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AtualizarPaciente().setVisible(true);
			}
		});
		btnAtualizar.setForeground(Color.WHITE);
		btnAtualizar.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnAtualizar.setBackground(new Color(51, 153, 255));
		btnAtualizar.setBounds(157, 145, 124, 47);
		frmSistemaCovid.getContentPane().add(btnAtualizar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeletarPaciente().setVisible(true);
			}
		});
		btnDeletar.setForeground(Color.WHITE);
		btnDeletar.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnDeletar.setBackground(new Color(51, 153, 255));
		btnDeletar.setBounds(300, 145, 124, 47);
		frmSistemaCovid.getContentPane().add(btnDeletar);
		
		JButton btnPacientes = new JButton("Pacientes  Cadastrados");
		btnPacientes.setForeground(new Color(0, 0, 0));
		btnPacientes.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnPacientes.setBackground(new Color(224, 255, 255));
		btnPacientes.setBounds(10, 203, 414, 47);
		frmSistemaCovid.getContentPane().add(btnPacientes);
	}

	protected void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
