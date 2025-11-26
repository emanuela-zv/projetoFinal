package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	
	private String user = "emanuela";
	private String senha = "123";
	private Usuario usuario;
	private JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 410);
		
		setResizable(false); //ao usar esse set, ele não deixa redimencionar a tela		
		setLocationRelativeTo(null); // abre a tela de forma centralizada
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel.setBounds(103, 125, 75, 14);
		contentPane.add(lblNewLabel);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(208, 122, 211, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(103, 180, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario = new Usuario (tfUsuario.getText(), tfSenha.getText()); // instancia e cria objeto da classe Usuario 
				
				if ((usuario.getUsuario().equals(user)) &&  (usuario.getSenha().equals(senha))) { 
					// getUsuario e getSenha são da classe Usuario
					
				//	JOptionPane.showMessageDialog(null, "Acesso Permitido\n" + usuario.getmsg(), "Permitido!!!",1);
					JOptionPane.showMessageDialog(null, "Acesso Permitido\n", "", 1);
					
					Tela1 tela1 = new Tela1();
					tela1.setVisible(true);
										
				}
				else {
					JOptionPane.showMessageDialog(null, "Tente novamente", "Acesso Negado",0);
					
					tfUsuario.setText("");
					tfSenha.setText("");
					tfUsuario.requestFocus();
				}
				
			}
		});
		
		btEntrar.setFont(new Font("Courier New", Font.PLAIN, 15));
		btEntrar.setBounds(233, 225, 166, 23);
		contentPane.add(btEntrar);
		
		tfSenha = new JTextField();
		tfSenha.setBounds(208, 177, 211, 20);
		contentPane.add(tfSenha);

	}
}
