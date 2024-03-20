package tiposlayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtQtd;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 430, 311);
		contentPane.add(tabbedPane);
		
		JPanel pnlProduto = new JPanel();
		tabbedPane.addTab("Produto", null, pnlProduto, null);
		pnlProduto.setLayout(null);
		
		JLabel LbCodigo = new JLabel("Código:");
		LbCodigo.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		LbCodigo.setForeground(new Color(0, 0, 0));
		LbCodigo.setBounds(84, 36, 107, 39);
		pnlProduto.add(LbCodigo);
		
		JLabel LbNome = new JLabel("Nome:");
		LbNome.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		LbNome.setBounds(94, 88, 61, 16);
		pnlProduto.add(LbNome);
		
		JLabel LbQtd = new JLabel("Quantidade:");
		LbQtd.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		LbQtd.setBounds(48, 126, 107, 16);
		pnlProduto.add(LbQtd);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(157, 46, 194, 21);
		pnlProduto.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(157, 85, 194, 26);
		pnlProduto.add(txtNome);
		txtNome.setColumns(10);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(157, 123, 193, 26);
		pnlProduto.add(txtQtd);
		txtQtd.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//validar o campo codigo
				if(txtCodigo.getText().strip().equals("")) {
					JOptionPane.showMessageDialog(rootPane, "Digite o código!");
				return; // impede de avancar para baixo
			}
			
			try { 
				int codigo = Integer.parseInt(txtCodigo.getText());
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(rootPane, "Digite somente números no código");
				return;
			}
			
			// validar o campo nome
			if(txtNome.getText().strip().equals("")) {
				JOptionPane.showMessageDialog(rootPane, "Digite o nome!");
				return; // impede de avancar para baixo
			}
			
			
			//validar o campo qtd
			try {
				if(txtQtd.getText().strip().equals("")) {
					throw new Exception("Preencha o código");
				}
				
				int qtd = Integer.parseInt(txtQtd.getText());
				
			} catch(NumberFormatException ex) {
				
				JOptionPane.showMessageDialog(rootPane, ex.getMessage());
				return;
				
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(rootPane, ex.getMessage());
				return;
			}
			};
		});
		
			
		btnConfirmar.setBounds(74, 177, 117, 29);
		pnlProduto.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(220, 177, 117, 29);
		pnlProduto.add(btnCancelar);
		
		JButton btnProximo = new JButton("Próximo >>");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnProximo.setBounds(274, 218, 117, 29);
		pnlProduto.add(btnProximo);
		
		JPanel pnlCliente = new JPanel();
		tabbedPane.addTab("Cliente", null, pnlCliente, null);
		pnlCliente.setLayout(null);
		
		JButton btnNewButton = new JButton("<< Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton.setBounds(6, 230, 117, 29);
		pnlCliente.add(btnNewButton);
			

	}
}
	

