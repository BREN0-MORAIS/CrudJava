package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.PacienteDAO;
import Model.Paciente;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletarPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletarPaciente frame = new DeletarPaciente();
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
	public DeletarPaciente() {
		setTitle("Deletar Paciente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id = Integer.parseInt(textFieldId.getText());
		
				
		    Paciente p = new Paciente(id);
		    
		
			PacienteDAO pacientedao = new PacienteDAO();
			pacientedao.Delete(p); 
				
				
			}
		});
		btnDeletar.setForeground(Color.WHITE);
		btnDeletar.setBackground(new Color(51, 153, 255));
		btnDeletar.setBounds(153, 193, 115, 34);
		contentPane.add(btnDeletar);
		
		textFieldId = new JTextField();
		textFieldId.setColumns(10);
		textFieldId.setBounds(153, 118, 128, 20);
		contentPane.add(textFieldId);
		
		JLabel lblIdPaciente = new JLabel("ID Paciente");
		lblIdPaciente.setForeground(Color.WHITE);
		lblIdPaciente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdPaciente.setBounds(178, 83, 128, -28);
		contentPane.add(lblIdPaciente);
		
		JLabel label = new JLabel("ID Paciente");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(173, 66, 128, 20);
		contentPane.add(label);
	}
}
