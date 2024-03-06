package lojaVeiculos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLogin frame = new telaLogin();
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
	public telaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnLogin = new JLabel("Login:");
		btnLogin.setBounds(41, 61, 61, 16);
		contentPane.add(btnLogin);
		
		JLabel btnSenha = new JLabel("Senha:");
		btnSenha.setBounds(41, 95, 61, 16);
		contentPane.add(btnSenha);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String login = txtLogin.getText();
				char[] senha = txtSenha.getPassword();
				
				String senhaConvertida = String.valueOf(senha);
				
				if(login.equals("admin") && senhaConvertida.equals("1234")) {
					JOptionPane.showMessageDialog(rootPane, "Bem-vindo(a)");
					
					telaPrincipal novaTela = new telaPrincipal();
					novaTela.setVisible(true);
					
					dispose();
				}
			}
		});
		btnNewButton.setBounds(158, 160, 117, 29);
		contentPane.add(btnNewButton);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(93, 56, 295, 26);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(93, 90, 295, 26);
		contentPane.add(txtSenha);
	}
}
