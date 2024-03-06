package lojaVeiculos;

import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class telaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastro frame = new telaCadastro();
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
	public telaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painelCadastro = new JPanel();
		painelCadastro.setBorder(new LineBorder(new Color(110, 23, 252)));
		painelCadastro.setBounds(6, 6, 438, 260);
		contentPane.add(painelCadastro);
		painelCadastro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(6, 28, 80, 20);
		painelCadastro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(6, 60, 80, 23);
		painelCadastro.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Placa:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(6, 95, 80, 20);
		painelCadastro.add(lblNewLabel_2);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 16));
		btnConfirmar.setIcon(new ImageIcon(telaCadastro.class.getResource("/lojaVeiculos/resources/check.png")));
		btnConfirmar.setBounds(89, 141, 256, 78);
		painelCadastro.add(btnConfirmar);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(89, 25, 307, 26);
		painelCadastro.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(89, 58, 307, 26);
		painelCadastro.add(txtModelo);
		txtModelo.setColumns(10);
		
		JFormattedTextField txtPlaca = new JFormattedTextField();
		txtPlaca.setBounds(89, 92, 241, 26);
		
		try {
			MaskFormatter mascara = new MaskFormatter("UUU-#U##");
			mascara.install(txtPlaca);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		painelCadastro.add(txtPlaca);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBounds(0, 0, 161, 27);
		contentPane.add(popupMenu);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
