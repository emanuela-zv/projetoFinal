package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setTitle("Cadastro do livro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 35, 62, 14);
		contentPane.add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Courier New", Font.PLAIN, 15));
		tfNome.setBounds(85, 32, 476, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbAutor = new JLabel("Autor:");
		lbAutor.setFont(new Font("Courier New", Font.PLAIN, 15));
		lbAutor.setBounds(25, 70, 62, 14);
		contentPane.add(lbAutor);
		
		tfAutor = new JTextField();
		tfAutor.setFont(new Font("Courier New", Font.PLAIN, 15));
		tfAutor.setColumns(10);
		tfAutor.setBounds(85, 67, 476, 20);
		contentPane.add(tfAutor);
		
		JComboBox cbIdade = new JComboBox();
		cbIdade.setModel(new DefaultComboBoxModel(new String[] {"Livre", "+ de 12 anos", "+ de 14 anos", "+ de 16 anos", "+ de 18 anos"}));
		cbIdade.setFont(new Font("Courier New", Font.PLAIN, 15));
		cbIdade.setToolTipText("Idade Recomendada");
		cbIdade.setBounds(43, 165, 159, 22);
		contentPane.add(cbIdade);
		
		JLabel lbClassificacaoIndicativa = new JLabel("<html>Classificação    <br/>   Indicativa<html>"); // usado para conseguir fazer a parte de "Indicativa" ir para a linha de baixo
		lbClassificacaoIndicativa.setFont(new Font("Courier New", Font.PLAIN, 15));
		lbClassificacaoIndicativa.setBounds(42, 109, 129, 50);
		contentPane.add(lbClassificacaoIndicativa);
		
		JRadioButton rbRomance = new JRadioButton("Romance");
		rbRomance.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbRomance.setForeground(new Color(0, 0, 0));
		rbRomance.setBounds(24, 250, 109, 23);
		contentPane.add(rbRomance);
		
		JRadioButton rbConto = new JRadioButton("Conto");
		rbConto.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbConto.setBounds(182, 250, 87, 23);
		contentPane.add(rbConto);
		
		JRadioButton rbPoesia = new JRadioButton("Poesia");
		rbPoesia.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbPoesia.setBounds(329, 250, 87, 23);
		contentPane.add(rbPoesia);
		
		JRadioButton rbCronica = new JRadioButton("Crônica");
		rbCronica.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbCronica.setBounds(475, 250, 92, 23);
		contentPane.add(rbCronica);
		
		JLabel lblNewLabel_1 = new JLabel("Gênero Textual");
		lblNewLabel_1.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(221, 212, 129, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblGnero = new JLabel("Gênero");
		lblGnero.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblGnero.setBounds(362, 113, 68, 43);
		contentPane.add(lblGnero);
		
		JRadioButton rbFiccao = new JRadioButton("Ficção");
		rbFiccao.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbFiccao.setBounds(291, 165, 87, 23);
		contentPane.add(rbFiccao);
		
		JRadioButton rbNaoFiccao = new JRadioButton("Não Ficção");
		rbNaoFiccao.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbNaoFiccao.setBounds(402, 163, 141, 23);
		contentPane.add(rbNaoFiccao);

	}
}
