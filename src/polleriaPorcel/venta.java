package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;

public class venta extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField textPrecio;
	private JTextField textCantidad;
	private JButton btnNewButton;
	private JTextArea textArea;
	private JComboBox cboPostre;
	
	int cantidad, combo;
	double iCompra, importeDscto, importePagar, precio;
	String tamano, adicional, bebida;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			venta dialog = new venta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public venta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(venta.class.getResource("/icono/cake 24px.png")));
		setTitle("Venta");
		setBounds(100, 100, 472, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPostre = new JLabel("Postre:");
			lblPostre.setBounds(52, 28, 105, 16);
			contentPanel.add(lblPostre);
		}
	
		{
			JLabel lblNewLabel = new JLabel("Precio Unidad:");
			lblNewLabel.setBounds(52, 93, 105, 22);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad: ");
			lblCantidad.setBounds(52, 64, 66, 16);
			contentPanel.add(lblCantidad);
		}
		{
			textPrecio = new JTextField();
			textPrecio.setEditable(false);
			textPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
			textPrecio.setBounds(152, 93, 116, 22);
			contentPanel.add(textPrecio);
			textPrecio.setColumns(10);
		}
		{
			textCantidad = new JTextField();
			textCantidad.setBounds(152, 58, 116, 22);
			contentPanel.add(textCantidad);
			textCantidad.setColumns(10);
		}
		
		{
			btnNewButton = new JButton("");
			btnNewButton.addActionListener(this);
			btnNewButton.setIcon(new ImageIcon(venta.class.getResource("/icono/check.png")));
			btnNewButton.setBounds(327, 25, 80, 41);
			contentPanel.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setIcon(new ImageIcon(venta.class.getResource("/icono/nuevo.png")));
			btnNewButton_1.setBounds(327, 79, 80, 36);
			contentPanel.add(btnNewButton_1);
		}
		{
			textArea = new JTextArea();
			textArea.setBounds(52, 128, 355, 98);
			contentPanel.add(textArea);
		}
		{
			cboPostre = new JComboBox();
			cboPostre.setModel(new DefaultComboBoxModel(new String[] {"Chesse Cake", "Torta de Chocolate", "Tres Leches", "Pye"}));
			cboPostre.setBounds(151, 25, 117, 22);
			contentPanel.add(cboPostre);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(arg0);
		}
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		
		leerCantidad();
	
		ingresoDatos();
		
		calcularImporteCompra();
		
		calcularimporteDscto();
		
		calcularImportePagar();
		
		imprimirResultados();
		
		
	}
	

	
	void leerCantidad(){
		cantidad= Integer.parseInt(textCantidad.getText());
		
	}
	
	
	int ingresoDatos(){
		combo=cboPostre.getSelectedIndex();
		return combo;
		
	}
	
	void calcularImporteCompra(){
		

		switch(combo){
		case 0:
			tamano = MenuPrincipal.tamano0;
			precio = MenuPrincipal.precio0;
			adicional = MenuPrincipal.adicional0;			
			iCompra= MenuPrincipal.precio0*cantidad;
		break;
		case 1:
			tamano = MenuPrincipal.tamano1;
			precio = MenuPrincipal.precio1;
			adicional = MenuPrincipal.adicional1;			
			iCompra= MenuPrincipal.precio1*cantidad;
		break;
		case 2:
			tamano = MenuPrincipal.tamano2;
			precio = MenuPrincipal.precio2;
			adicional = MenuPrincipal.adicional2;			
			iCompra= MenuPrincipal.precio2*cantidad;
		break;
		case 3:
			tamano = MenuPrincipal.tamano3;
			precio = MenuPrincipal.precio3;
			adicional = MenuPrincipal.adicional3;;			
			iCompra= MenuPrincipal.precio3*cantidad;
		break;
		
		}
	}
	
	
	void calcularimporteDscto(){
	
		if (cantidad>=6){
			importeDscto = iCompra * 0.20;
		}
		else if (cantidad>=3) {
			importeDscto = iCompra * 0.08;
		}
		
		else {
			importeDscto = 0;
		}
	}
	
	void calcularImportePagar(){
		
		importePagar = iCompra-importeDscto;
	}
	
	void imprimir(String res){
		textArea.append(res + "\n");
	}
	
	void imprimirResultados(){
		
		textPrecio.setText(String.valueOf(precio));
		imprimir("El importe de compra es: " + String.format("%.2f",iCompra));
		imprimir("El descuento es: " + String.format("%.2f",importeDscto));
		imprimir("El importe a pagar es: " + String.format("%.2f",importePagar));
		
	}
	
	
	
	protected void actionPerformedBtnNewButton_1(ActionEvent arg0) {
		
		textCantidad.setText("");
		textArea.setText("");
		textCantidad.requestFocus();
		textPrecio.setText("");
	}
}
