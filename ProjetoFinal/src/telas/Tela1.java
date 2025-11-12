package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setTitle("Cadastro de Livros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(104, 155, 193));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qual ação você deseja realizar?");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 23));
		lblNewLabel.setBounds(77, 78, 459, 96);
		contentPane.add(lblNewLabel);
		JButton btCadastrarLivros = new JButton("Cadastrar livros");
		btCadastrarLivros.setBackground(new Color(0, 128, 192));
		btCadastrarLivros.setForeground(new Color(0, 0, 128));
		btCadastrarLivros.setFont(new Font("Courier New", Font.BOLD, 15));
		
		btCadastrarLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btCadastrarLivros.setBounds(77, 185, 179, 73);
		contentPane.add(btCadastrarLivros);
		
		JButton btAcessarLivros = new JButton("Acessar livros");
		btAcessarLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btAcessarLivros.setForeground(new Color(0, 0, 128));
		btAcessarLivros.setFont(new Font("Courier New", Font.BOLD, 15));
		btAcessarLivros.setBackground(new Color(0, 128, 192));
		btAcessarLivros.setBounds(339, 185, 179, 73);
		contentPane.add(btAcessarLivros);

	}
}
