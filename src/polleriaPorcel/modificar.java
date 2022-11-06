package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;

public class modificar extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipoDePostre;
	private JComboBox cboCombo;
	private JLabel lblPrecio;
	private JLabel lblTamao;
	private JLabel lblAdicional;
	private JTextField textPrecio;
	private JTextField textTamano;
	private JTextField textAdicional;
	private JButton button;
	private JButton btnNuevo;

	int combo;
	String tamano="", adicional="", adic="";
	double precio=0;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			modificar dialog = new modificar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public modificar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(modificar.class.getResource("/icono/cake 24px.png")));
		setTitle("Modificar");
		setBounds(100, 100, 447, 298);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTipoDePostre = new JLabel("Postre:");
		lblTipoDePostre.setBounds(39, 38, 83, 16);
		contentPanel.add(lblTipoDePostre);
		
		cboCombo = new JComboBox();
		cboCombo.setModel(new DefaultComboBoxModel(new String[] {"Chesse Cake", "Torta de Chocolate ", "Tres Leches ", "Pye"}));
		cboCombo.setBounds(122, 35, 139, 22);
		contentPanel.add(cboCombo);
		
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(39, 98, 56, 16);
		contentPanel.add(lblPrecio);
		
		lblTamao = new JLabel("Tama\u00F1o: ");
		lblTamao.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTamao.setBounds(39, 143, 67, 16);
		contentPanel.add(lblTamao);
		
		lblAdicional = new JLabel("Adicional: ");
		lblAdicional.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAdicional.setBounds(39, 190, 83, 16);
		contentPanel.add(lblAdicional);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(122, 95, 139, 22);
		contentPanel.add(textPrecio);
		textPrecio.setColumns(10);
		
		textTamano = new JTextField();
		textTamano.setBounds(122, 140, 139, 22);
		contentPanel.add(textTamano);
		textTamano.setColumns(10);
		
		textAdicional = new JTextField();
		textAdicional.setBounds(122, 187, 139, 22);
		contentPanel.add(textAdicional);
		textAdicional.setColumns(10);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(modificar.class.getResource("/icono/calcular.png")));
		button.addActionListener(this);
		button.setBounds(285, 69, 106, 45);
		contentPanel.add(button);
		
		btnNuevo = new JButton("");
		btnNuevo.setIcon(new ImageIcon(modificar.class.getResource("/icono/nuevo.png")));
		btnNuevo.addActionListener(this);
		btnNuevo.setBounds(285, 183, 106, 45);
		contentPanel.add(btnNuevo);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(this);
		btnNewButton.setIcon(new ImageIcon(modificar.class.getResource("/icono/editar_.png")));
		btnNewButton.setBounds(285, 127, 106, 41);
		contentPanel.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
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
		combo=cboCombo.getSelectedIndex();
		
	}
	void calcularCombo(){
		
		switch(combo){
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
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		
		
	
		
		
		guardarCombo();
		
		JOptionPane.showMessageDialog(null, 
                "Los datos han sido modificados", 
                "MENSAJE", 
                JOptionPane.WARNING_MESSAGE);
		
		
			
	}
	
void guardarCombo(){
		
		switch(combo){
		case 0:
			MenuPrincipal.tamano0= textTamano.getText();
			MenuPrincipal.precio0= Double.parseDouble(textPrecio.getText());
			MenuPrincipal.adicional0= textAdicional.getText();
			
		break;
		case 1:
			MenuPrincipal.tamano1 = textTamano.getText();
			MenuPrincipal.precio1 = Double.parseDouble(textPrecio.getText());
			MenuPrincipal.adicional1= textAdicional.getText();
			
		break;
		case 2:
			MenuPrincipal.tamano2=textTamano.getText();
			MenuPrincipal.precio2 = Double.parseDouble(textPrecio.getText());
			MenuPrincipal.adicional2 = textAdicional.getText();
			
		break;
		case 3:
			MenuPrincipal.tamano3 = textTamano.getText();
			MenuPrincipal.precio3 = Double.parseDouble(textPrecio.getText());
			MenuPrincipal.adicional3 = textAdicional.getText();
			
			break;
		}
	
}	
}
