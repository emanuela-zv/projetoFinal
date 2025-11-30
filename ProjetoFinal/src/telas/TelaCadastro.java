package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfTitulo;
	private JTextField tfAutor;
	private JTextField tfAnoLanc;
	private TabelaLivros tabelaLivros;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					TabelaLivros tabelaLivros = new TabelaLivros();
					
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo:");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 15));
		lblNewLabel.setBounds(25, 35, 97, 14);
		contentPane.add(lblNewLabel);
		
		tfTitulo = new JTextField();
		tfTitulo.setFont(new Font("Courier New", Font.PLAIN, 15));
		tfTitulo.setBounds(97, 32, 464, 20);
		contentPane.add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JLabel lbAutor = new JLabel("Autor:");
		lbAutor.setFont(new Font("Courier New", Font.BOLD, 15));
		lbAutor.setBounds(25, 70, 62, 14);
		contentPane.add(lbAutor);
		
		tfAutor = new JTextField();
		tfAutor.setFont(new Font("Courier New", Font.PLAIN, 15));
		tfAutor.setColumns(10);
		tfAutor.setBounds(97, 67, 464, 20);
		contentPane.add(tfAutor); 
		
		JComboBox cbIdade = new JComboBox();
		cbIdade.setModel(new DefaultComboBoxModel(new String[] {"Livre", "+ de 12 anos", "+ de 14 anos", "+ de 16 anos", "+ de 18 anos"}));
		cbIdade.setFont(new Font("Courier New", Font.PLAIN, 15));
		cbIdade.setToolTipText("Idade Recomendada");
		cbIdade.setBounds(51, 247, 141, 22);
		contentPane.add(cbIdade);

		
		JLabel lbClassificacaoIndicativa = new JLabel("Classificação");
		lbClassificacaoIndicativa.setFont(new Font("Courier New", Font.BOLD, 15));
		lbClassificacaoIndicativa.setBounds(63, 162, 129, 50);
		contentPane.add(lbClassificacaoIndicativa);
		
		JRadioButton rbLido = new JRadioButton("Lido");
		rbLido.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbLido.setForeground(new Color(0, 0, 0));
		rbLido.setBounds(288, 206, 75, 23);
		contentPane.add(rbLido);
		
		JRadioButton rbLendo = new JRadioButton("Lendo");
		rbLendo.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbLendo.setBounds(288, 247, 75, 23);
		contentPane.add(rbLendo);
		
		JRadioButton rbAbandonado = new JRadioButton("Abandonado");
		rbAbandonado.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbAbandonado.setBounds(419, 247, 129, 23);
		contentPane.add(rbAbandonado);
		
		JRadioButton rbQueroLer = new JRadioButton("Quero ler");
		rbQueroLer.setFont(new Font("Courier New", Font.PLAIN, 15));
		rbQueroLer.setBounds(419, 206, 129, 23);
		contentPane.add(rbQueroLer);
		
		JLabel lblNewLabel_1 = new JLabel("Status da leitura");
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 15));
		lblNewLabel_1.setBounds(327, 162, 167, 14);
		contentPane.add(lblNewLabel_1);
			
		ButtonGroup statusLeitura = new ButtonGroup();
		
		statusLeitura.add(rbQueroLer);
		statusLeitura.add(rbAbandonado);
		statusLeitura.add(rbLendo);
		statusLeitura.add(rbLido);		

		JLabel lblAnoDeLancamento = new JLabel("Ano de lançamento: ");
		lblAnoDeLancamento.setFont(new Font("Courier New", Font.BOLD, 15));
		lblAnoDeLancamento.setBounds(25, 105, 245, 14);
		contentPane.add(lblAnoDeLancamento);
		
		JLabel lblIndicativa = new JLabel("Indicativa");
		lblIndicativa.setFont(new Font("Courier New", Font.BOLD, 15));
		lblIndicativa.setBounds(73, 192, 97, 50);
		contentPane.add(lblIndicativa);
		
		tfAnoLanc = new JTextField();
		tfAnoLanc.setFont(new Font("Courier New", Font.PLAIN, 15));
		tfAnoLanc.setColumns(10);
		tfAnoLanc.setBounds(197, 102, 364, 20);
		contentPane.add(tfAnoLanc);
		
		JButton btVoltar = new JButton("VOLTAR");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela1 tela1 = new Tela1();
				tela1.setVisible(true);
				
			}
		});
		
		btVoltar.setFont(new Font("Courier New", Font.BOLD, 11));
		btVoltar.setBounds(25, 319, 153, 29);
		contentPane.add(btVoltar);
			
		TabelaLivros tabelaLivros = new TabelaLivros();
		
		JButton btCadastrar = new JButton("CADASTRAR");
		btCadastrar.setFont(new Font("Courier New", Font.BOLD, 11));
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String titulo = tfTitulo.getText().trim();
			String autor = tfAutor.getText().trim();
			String anoLanc = tfAnoLanc.getText().trim();
			String status = "";
												
			if (rbLido.isSelected()) {
				status = rbLido.getText();	
				
				
			}
			if (rbLendo.isSelected()) {
				status = rbLendo.getText();
				
			}
			if (rbAbandonado.isSelected()) {
				status = rbAbandonado.getText();
								
			}
			if (rbQueroLer.isSelected()) {
				status = rbQueroLer.getText();
				
			}
			
			if (!titulo.isEmpty() && !autor.isEmpty() && !status.isEmpty()){
			
				
			Object[] infos = {titulo, autor, anoLanc, cbIdade.getSelectedItem(), status};
			
			tabelaLivros.AdicionarLivros(infos);
			
			tfTitulo.setText("");
			tfAutor.setText("");
			tfAnoLanc.setText("");
			tfTitulo.requestFocus();
			
			statusLeitura.clearSelection();
			cbIdade.setSelectedItem("Livre");
			
			}
			else {
				JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}	
			
			}
		});
		
		btCadastrar.setBounds(213, 319, 153, 29);
		contentPane.add(btCadastrar);
		
		JButton btAcessarTab = new JButton("ACESSAR TABELA");
		btAcessarTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabelaLivros.setVisible(true);
				
			}
		});
		
		btAcessarTab.setFont(new Font("Courier New", Font.BOLD, 11));
		btAcessarTab.setBounds(408, 319, 153, 29);
		contentPane.add(btAcessarTab);
		

	}
}
