package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;

public class consultar extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipoPostre;
	private JComboBox cboPostre;
	private JLabel lblPrecio;
	private JLabel lblTamao;
	private JLabel lblAdicional;
	private JTextField textPrecio;
	private JTextField textTamano;
	private JTextField textAdicional;
	private JButton button;
	private JButton btnNuevo;
	
    //	VARIABLES GLOBALES
	int postre;
	String tamano="", adicional="", adic="";
	double precio=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			consultar dialog = new consultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public consultar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(consultar.class.getResource("/icono/cake 24px.png")));
		setTitle("Consultar");
		setBounds(100, 100, 447, 295);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTipoPostre = new JLabel("Postre:");
		lblTipoPostre.setBounds(39, 38, 89, 16);
		contentPanel.add(lblTipoPostre);
		
		cboPostre = new JComboBox();
		cboPostre.setModel(new DefaultComboBoxModel(new String[] {"Chesse Cake", "Torta de Chocolate", "Tres Leches", "Pye"}));
		cboPostre.setBounds(148, 35, 139, 22);
		contentPanel.add(cboPostre);
		
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(39, 98, 56, 16);
		contentPanel.add(lblPrecio);
		
		lblTamao = new JLabel("Tama\u00F1o: ");
		lblTamao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTamao.setBounds(39, 147, 67, 16);
		contentPanel.add(lblTamao);
		
		lblAdicional = new JLabel("Adicional: ");
		lblAdicional.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAdicional.setBounds(39, 198, 83, 16);
		contentPanel.add(lblAdicional);
		
		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		textPrecio.setBounds(122, 95, 151, 22);
		contentPanel.add(textPrecio);
		textPrecio.setColumns(10);
		
		textTamano = new JTextField();
		textTamano.setEditable(false);
		textTamano.setBounds(122, 144, 151, 22);
		contentPanel.add(textTamano);
		textTamano.setColumns(10);
		
		textAdicional = new JTextField();
		textAdicional.setEditable(false);
		textAdicional.setBounds(122, 195, 151, 22);
		contentPanel.add(textAdicional);
		textAdicional.setColumns(10);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(consultar.class.getResource("/icono/lista.png")));
		button.addActionListener(this);
		button.setBounds(299, 98, 106, 45);
		contentPanel.add(button);
		
		btnNuevo = new JButton("");
		btnNuevo.setIcon(new ImageIcon(consultar.class.getResource("/icono/nuevo.png")));
		btnNuevo.addActionListener(this);
		btnNuevo.setBounds(299, 154, 106, 45);
		contentPanel.add(btnNuevo);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNuevo) {
			actionPerformedBtnNuevo(arg0);
		}
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		
		ingresoDatos();
		calcularCombo();
		mostrarResultados();	
		
	}
	
	void ingresoDatos(){
		postre=cboPostre.getSelectedIndex();
		
	}
	void calcularCombo(){
		
		switch(postre){
		case 0:
			tamano = MenuPrincipal.tamano0;
			precio = MenuPrincipal.precio0;
			adicional = MenuPrincipal.adicional0;
			
		break;
		case 1:
			tamano = MenuPrincipal.tamano1;
			precio = MenuPrincipal.precio1;
			adicional = MenuPrincipal.adicional1;
			
		break;
		case 2:
			tamano = MenuPrincipal.tamano2;
			precio = MenuPrincipal.precio2;
			adicional = MenuPrincipal.adicional2;
			
		break;
		case 3:
			tamano = MenuPrincipal.tamano3;
			precio = MenuPrincipal.precio3;
			adicional = MenuPrincipal.adicional3;;
			
			break;
			
		}

	}
		
	void imprimir(String res){
		textPrecio.setText(res +"\n");
		textTamano.setText(res +"\n");
		textAdicional.setText(res +"\n");
		
	}
	
	void mostrarResultados(){
		textPrecio.setText(""+precio);
		textTamano.setText(""+ tamano);
		textAdicional.setText(""+adicional);
		
	}
		
	protected void actionPerformedBtnNuevo(ActionEvent arg0) {
		textPrecio.setText("");
		textTamano.setText("");
		textAdicional.setText("");		
		textPrecio.requestFocus();
	}
}
