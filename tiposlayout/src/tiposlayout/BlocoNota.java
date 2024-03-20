package tiposlayout;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

public class BlocoNota extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlocoNota frame = new BlocoNota();
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
	public BlocoNota() {
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 6, 414, 242);
		getContentPane().add(textArea);

	}
}
