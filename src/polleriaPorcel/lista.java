package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class lista extends JDialog {

	private final JPanel contentPanel = new JPanel();

	 private JComboBox cboBebidas;
	 private JComboBox cboPiqueos;
	 private JComboBox cboBrasa;
	 
	 private JTextArea txt1;
	 private JTextArea txt2;
	 private JTextArea txt3;
		 
	// DECLARAR LAS VARIABLES GLOBALES (SOLO SE USARAN EN ESTA PAGINA)
		 int brasa;
		 int piqueo;
		 int bebida;
	//
	//
	// FIN
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			lista dialog = new lista();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// INICIO 		
	// IMPRIMIR PRECIO DE LOS POLLOS
	public void imprimirprecios(){
		brasa = cboBrasa.getSelectedIndex();
		switch (brasa){
			case 0:{ 
				txt1.setText("  Precio :         S/.  " + paginaPrincipal.precio0 + "\n");
				txt1.append("  Compa�ia :  " + paginaPrincipal.acompana0 + "\n");
				break;
				}
			case 1:{
				txt1.setText("  Precio :         S/.  " + paginaPrincipal.precio1 + "\n");
				txt1.append("  Compa�ia :  " + paginaPrincipal.acompana1 + "\n");
				break;
				}
			case 2:{
				txt1.setText("  Precio :        S/.  " + paginaPrincipal.precio2 + "\n");
				txt1.append("  Compa�ia :  " + paginaPrincipal.acompana2 + "\n");
				break;
				}
			default:{
				txt1.setText("  Precio :         S/.  " + paginaPrincipal.precio3 + "\n");
				txt1.append("  Compa�ia :  " + paginaPrincipal.acompana3 + "\n");
				break;
				}
			
		}
		
		
	}
	
	// IMPRIMIR PRECIO DE LAS ENTRADAS (PIQUEOS)
	public void imprimirPreciosPiqueos(){
		piqueo = cboPiqueos.getSelectedIndex();
		switch (piqueo){
			case 0:{ 
				txt2.setText("  Precio :    S/.  " + paginaPrincipal.precio4 + "\n");				
				break;
				}
			case 1:{
				txt2.setText("  Precio :    S/.  " + paginaPrincipal.precio5 + "\n");
				break;
				}
			case 2:{
				txt2.setText("  Precio :    S/.  " + paginaPrincipal.precio6 + "\n");
				break;
				}
			case 3:{
				txt2.setText("  Precio :    S/.  " + paginaPrincipal.precio7 + "\n");
				break;
				}
			default:{
				txt2.setText("  Precio :    S/.  " + paginaPrincipal.precio8 + "\n");
				break;
				}
			
		}	
	}
	
	// IMPRIMIR PRECIO DE LAS BEBIDAS
	
	public void imprimirPreciosBebidas(){
		bebida = cboBebidas.getSelectedIndex();
		switch (bebida){
			case 0:{ 
				txt3.setText("  Precio :    S/.  " + paginaPrincipal.precio9 + "\n");				
				break;
				}
			case 1:{
				txt3.setText("  Precio :    S/.  " + paginaPrincipal.precio10 + "\n");
				break;				
				}
			default:{
				txt3.setText("  Precio :    S/.  " + paginaPrincipal.precio11 + "\n");
				break;
				}
			
		}	
	}
	
	//
	// FIN
	
	/**
	 * Create the dialog.
	 */
	public lista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(lista.class.getResource("/icono/pollo 32px.png")));
		setTitle("Lista Platos");
		setBounds(100, 100, 337, 517);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblLista = new JLabel("Carta");
			lblLista.setIcon(new ImageIcon(lista.class.getResource("/icono/platos 32px.png")));
			lblLista.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblLista.setBounds(115, 29, 91, 39);
			contentPanel.add(lblLista);
		}
		{
			JLabel lblNewLabel = new JLabel("Brasa :");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(30, 89, 84, 26);
			contentPanel.add(lblNewLabel);
		}
		{
			cboBrasa = new JComboBox();
			cboBrasa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// ACCIONES
					imprimirprecios();
					
					// FIN
				}
			});
			cboBrasa.setModel(new DefaultComboBoxModel(new String[] {"Pollo Entero", "Medio Pollo 1", "Medio Pollo 2", "Cuarto de Pollo"}));
			cboBrasa.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cboBrasa.setBounds(120, 89, 160, 26);
			contentPanel.add(cboBrasa);
		}
		{
			JLabel lblPiqueos = new JLabel("Piqueos :");
			lblPiqueos.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPiqueos.setBounds(30, 195, 84, 26);
			contentPanel.add(lblPiqueos);
		}
		{
			cboPiqueos = new JComboBox();
			cboPiqueos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// ACCIONES
					imprimirPreciosPiqueos();
					
					//FIN
				}
			});
			cboPiqueos.setModel(new DefaultComboBoxModel(new String[] {"Yuquita a la Huancaina", "Alitas", "Salchipollo", "Anticuchos", "Ensalada Fresca"}));
			cboPiqueos.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cboPiqueos.setBounds(120, 195, 160, 26);
			contentPanel.add(cboPiqueos);
		}
		{
			JLabel lblBebidas = new JLabel("Bebidas :");
			lblBebidas.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblBebidas.setBounds(30, 301, 84, 26);
			contentPanel.add(lblBebidas);
		}
		{
			cboBebidas = new JComboBox();
			cboBebidas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//ACCIONES
					imprimirPreciosBebidas();
					
					//FIN
				}
			});
			cboBebidas.setModel(new DefaultComboBoxModel(new String[] {"Inka Cola 1.5L", "Coca Cola 1.5L", "Chicha Morada 1L"}));
			cboBebidas.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cboBebidas.setBounds(120, 301, 160, 26);
			contentPanel.add(cboBebidas);
		}
		
		txt1 = new JTextArea();
		txt1.setEditable(false);
		txt1.setFont(new Font("Cambria Math", Font.PLAIN, 13));
		txt1.setBounds(120, 126, 164, 48);
		contentPanel.add(txt1);
		
		txt2 = new JTextArea();
		txt2.setEditable(false);
		txt2.setFont(new Font("Cambria Math", Font.PLAIN, 13));
		txt2.setBounds(120, 232, 164, 48);
		contentPanel.add(txt2);
		
		txt3 = new JTextArea();
		txt3.setFont(new Font("Cambria Math", Font.PLAIN, 13));
		txt3.setEditable(false);
		txt3.setBounds(120, 338, 164, 48);
		contentPanel.add(txt3);
	}
}
