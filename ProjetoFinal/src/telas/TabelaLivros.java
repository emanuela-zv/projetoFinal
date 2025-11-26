package telas;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabelaLivros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tabela;
	private int linhaAlteracao = -1;
	
	private DefaultTableModel modeloTabela;	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaLivros frame = new TabelaLivros();
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
	public TabelaLivros() {
		setFont(new Font("Courier New", Font.PLAIN, 12));
		setTitle("Tabela de livros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 564, 285);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setColumnHeaderView(tabela);		
		
		tabela.setModel(new DefaultTableModel(new Object[][] {}, new String[] 
				{"Nome", "Autor", "Ano", "Idade", "Status de leitura"}));
		tabela.setToolTipText("");
		tabela.setFont(new Font("Courier New", Font.PLAIN, 12));
		scrollPane.setViewportView(tabela);	
		
		modeloTabela = (DefaultTableModel) tabela.getModel();		
		
		JButton btEditar = new JButton("Editar");
		btEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linhaSelecionada = tabela.getSelectedRow();

				if (linhaSelecionada >= 0) {

					linhaAlteracao = linhaSelecionada;

					String nome = modeloTabela.getValueAt(linhaSelecionada, 0).toString();


				} else {
					JOptionPane.showMessageDialog(null, "Caso queira alterar uma linha, selecione ela!");
				}

				
			}
		});
		btEditar.setFont(new Font("Courier New", Font.BOLD, 15));
		btEditar.setBounds(229, 326, 120, 23);
		contentPane.add(btEditar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linhaSelecionada = tabela.getSelectedRow();

				if (linhaSelecionada >= 0) {
										
					modeloTabela.removeRow(linhaSelecionada);
				} else {
					JOptionPane.showMessageDialog(null, "Caso queira excluir uma linha, selecione ela!");
				}
			}
		});
		btExcluir.setFont(new Font("Courier New", Font.BOLD, 15));
		btExcluir.setBounds(399, 326, 120, 23);
		contentPane.add(btExcluir);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCadastro telaCadastro = new TelaCadastro();
				telaCadastro.setVisible(true);
				
			}
		});
		
		btCadastrar.setFont(new Font("Courier New", Font.BOLD, 15));
		btCadastrar.setBounds(67, 326, 120, 23);
		contentPane.add(btCadastrar);
		
		tabela.setDefaultEditor(Object.class, null);		
		
	}
	
	public void AdicionarLivros(Object[] infos) {
		modeloTabela.addRow(infos);
	}
	

}
