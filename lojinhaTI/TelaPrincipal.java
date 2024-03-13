package lojinhaTI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblProdutos;

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
		setBounds(100, 100, 730, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlLeft = new JPanel();
		pnlLeft.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlLeft.setBounds(23, 6, 340, 458);
		contentPane.add(pnlLeft);
		pnlLeft.setLayout(null);
		
		JPanel pnlTipoComputador = new JPanel();
		pnlTipoComputador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Escolha o tipo de computador", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlTipoComputador.setBounds(6, 6, 328, 59);
		pnlLeft.add(pnlTipoComputador);
		pnlTipoComputador.setLayout(null);
		
		JRadioButton rbopc = new JRadioButton("PC");
		rbopc.setBounds(6, 19, 87, 23);
		pnlTipoComputador.add(rbopc);
		
		JRadioButton rbonotebook = new JRadioButton("Notebook");
		rbonotebook.setBounds(79, 19, 141, 23);
		pnlTipoComputador.add(rbonotebook);
		
		JRadioButton rboservidor = new JRadioButton("Servidor");
		rboservidor.setBounds(181, 19, 141, 23);
		pnlTipoComputador.add(rboservidor);
		
		//Adicionar os botoes de radio a um grupo de botoes
		ButtonGroup bgTipoComputador = new ButtonGroup();
		bgTipoComputador.add(rbopc);
		bgTipoComputador.add(rbonotebook);
		bgTipoComputador.add(rboservidor);
		
		
		JToggleButton tglbtnWindows = new JToggleButton("Windows");
		tglbtnWindows.setBounds(6, 64, 161, 29);
		pnlLeft.add(tglbtnWindows);
		
		JToggleButton tglbtnLinux = new JToggleButton("Linux");
		tglbtnLinux.setBounds(173, 64, 161, 29);
		pnlLeft.add(tglbtnLinux);
		
		JComboBox cboHD = new JComboBox();
		cboHD.setBounds(6, 93, 328, 27);
		pnlLeft.add(cboHD);
		
		JCheckBox chckMochila = new JCheckBox("Mochila");
		chckMochila.setBounds(6, 124, 128, 23);
		pnlLeft.add(chckMochila);
		
		JCheckBox chckbxHeadSet = new JCheckBox("HeadSet");
		chckbxHeadSet.setBounds(97, 124, 128, 23);
		pnlLeft.add(chckbxHeadSet);
		
		JCheckBox chckbxMouseGamer = new JCheckBox("Mouse Gamer");
		chckbxMouseGamer.setBounds(193, 124, 128, 23);
		pnlLeft.add(chckbxMouseGamer);
		
		JList list = new JList();
		list.setBounds(16, 166, 305, 75);
		pnlLeft.add(list);
		
		JButton btnAdicionar = new JButton("Adicionar >>");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TipoComputador = "";
				
				if(rbopc.isSelected()) {
					TipoComputador = rbopc.getText();
				} else if(rbonotebook.isSelected()) {
					TipoComputador = rbonotebook.getText();
				} else if(rboservidor.isSelected()) {
					TipoComputador = rboservidor.getText();
				} else {
					JOptionPane.showMessageDialog(rootPane, "Selecione um computador");
					return;
				}
				
				String sistemaOperacional = "";
				
				if(tglbtnWindows.isSelected()) {
					sistemaOperacional = tglbtnWindows.getText();
				} else if(tglbtnLinux.isSelected()) {
					sistemaOperacional = tglbtnLinux.getText();
				} else {
					JOptionPane.showMessageDialog(rootPane, "Selecione um Sistema Operacional");
				} 
				
				JOptionPane.showMessageDialog(rootPane, TipoComputador + "\n" + sistemaOperacional);
			}
		});
		btnAdicionar.setBounds(39, 253, 264, 47);
		pnlLeft.add(btnAdicionar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(375, 6, 329, 458);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tblProdutos = new JTable();
		tblProdutos.setBounds(6, 35, 317, 381);
		panel.add(tblProdutos);
		
		JButton btnexcluir = new JButton("Excluir");
		btnexcluir.setBounds(206, 6, 117, 29);
		panel.add(btnexcluir);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(29, 417, 117, 29);
		panel.add(btnConfirmar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setBounds(180, 417, 117, 29);
		panel.add(btncancelar);
	}
}
