package tiposlayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1160, 669);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(231, 253, 218));
		menuBar.setForeground(new Color(227, 255, 230));
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(230, 254, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JMenu mnuArquivo = new JMenu(); 
		mnuArquivo.setText("Arquivo");
		menuBar.add(mnuArquivo);
		
		JMenuItem mnuCadastros = new JMenuItem();
		mnuCadastros.setText("Cadastros");
		
		mnuArquivo.add(mnuCadastros);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(6, 6, 1148, 540);
		contentPane.add(desktopPane);
		
		JButton btnNotas = new JButton("Notas");
		btnNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlocoNota novaNota = new BlocoNota();
				novaNota.setVisible(true);
				
				desktopPane.add(novaNota);
			}
		});
		btnNotas.setBounds(6, 558, 131, 42);
		contentPane.add(btnNotas);
	}
}
