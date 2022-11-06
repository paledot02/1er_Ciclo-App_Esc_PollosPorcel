package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class cambiarPrecio extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtpe;
	private JComboBox cboPollo;
	private JComboBox cboPiqueo;
	private JTextField txtPiqueo;
	private JButton btnModificarPiqueo;
	private JComboBox cboBebida;
	private JTextField txtBebida;
	private JButton btnModificarBebida;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			cambiarPrecio dialog = new cambiarPrecio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public cambiarPrecio() {
		setBounds(100, 100, 528, 397);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(191, 205, 219));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtpe = new JTextField();
		txtpe.setBounds(243, 59, 70, 25);
		contentPanel.add(txtpe);
		txtpe.setColumns(10);
		
		JButton btnNewButton = new JButton("Modificar Pollo");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// MODIFICAR PRECIO
				int pollo;
				Object resumen = "";
				double precioPollo = 0;
				
				pollo = cboPollo.getSelectedIndex();
				
				
				if (pollo == 0) {
					paginaPrincipal.precio0 = Double.parseDouble(txtpe.getText());
					resumen = cboPollo.getSelectedItem();
					precioPollo = paginaPrincipal.precio0;
				}
				else if (pollo == 1){
					paginaPrincipal.precio1 = Double.parseDouble(txtpe.getText());
					resumen = cboPollo.getSelectedItem();
					precioPollo = paginaPrincipal.precio1;
				}
				else if (pollo == 2){
					paginaPrincipal.precio2 = Double.parseDouble(txtpe.getText());
					resumen = cboPollo.getSelectedItem();
					precioPollo = paginaPrincipal.precio2;
				}
				else{
					paginaPrincipal.precio3 = Double.parseDouble(txtpe.getText());
					resumen = cboPollo.getSelectedItem();
					precioPollo = paginaPrincipal.precio3;
				}
				
				
				txtS.setText("  Se ha modificado el precio del " + resumen + " a :  S/ " + precioPollo );
				
				
				//FIN
			}
		});
		btnNewButton.setBounds(337, 59, 130, 25);
		contentPanel.add(btnNewButton);
		
		cboPollo = new JComboBox();
		cboPollo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cboPollo.setModel(new DefaultComboBoxModel(new String[] {"Pollo Entero", "Medio Pollo 1", "Medio Pollo 2", "Cuarto Pollo"}));
		cboPollo.setBounds(40, 59, 170, 25);
		contentPanel.add(cboPollo);
		
		cboPiqueo = new JComboBox();
		cboPiqueo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cboPiqueo.setModel(new DefaultComboBoxModel(new String[] {"Yuquita a la Huancaina", "Alitas", "Salchipollo", "Anticucho", "Ensalada Fresca"}));
		cboPiqueo.setBounds(40, 95, 170, 25);
		contentPanel.add(cboPiqueo);
		
		txtPiqueo = new JTextField();
		txtPiqueo.setBounds(243, 95, 70, 25);
		contentPanel.add(txtPiqueo);
		txtPiqueo.setColumns(10);
		
		btnModificarPiqueo = new JButton("Modificar Piqueo");
		btnModificarPiqueo.setBackground(SystemColor.controlHighlight);
		btnModificarPiqueo.addActionListener(this);
		btnModificarPiqueo.setBounds(337, 95, 130, 25);
		contentPanel.add(btnModificarPiqueo);
		
		cboBebida = new JComboBox();
		cboBebida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cboBebida.setModel(new DefaultComboBoxModel(new String[] {"Inka Cola 1.5L", "Coca Cola 1.5L", "Chicha Morada 1L"}));
		cboBebida.setBounds(40, 131, 170, 25);
		contentPanel.add(cboBebida);
		
		txtBebida = new JTextField();
		txtBebida.setBounds(243, 131, 70, 25);
		contentPanel.add(txtBebida);
		txtBebida.setColumns(10);
		
		btnModificarBebida = new JButton("Modificar Bebida");
		btnModificarBebida.setBackground(SystemColor.controlHighlight);
		btnModificarBebida.addActionListener(this);
		btnModificarBebida.setBounds(337, 131, 130, 25);
		contentPanel.add(btnModificarBebida);
		
		txtS = new JTextArea();
		txtS.setBounds(40, 180, 427, 133);
		contentPanel.add(txtS);
		
		JLabel lblNewLabel = new JLabel("MODIFICAR PEDIDO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(191, 14, 130, 25);
		contentPanel.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.GRAY));
		panel.setBounds(10, 14, 492, 333);
		contentPanel.add(panel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificarBebida) {
			actionPerformedBtnModificarBebida(e);
		}
		if (e.getSource() == btnModificarPiqueo) {
			actionPerformedBtnModificarPiqueo(e);
		}
	}
	
	// BOTON PARA CAMBIAR EL RPECIO DE LOS PIQUEOS
	protected void actionPerformedBtnModificarPiqueo(ActionEvent e) {
		
		int piqueo;
		Object resumen = "";
		double precioPiqueo = 0;
		
		piqueo = cboPiqueo.getSelectedIndex();
		
		
		
		if (piqueo == 0){
			paginaPrincipal.precio4 = Double.parseDouble(txtPiqueo.getText());
			resumen = cboPiqueo.getSelectedItem();
			precioPiqueo = paginaPrincipal.precio4;
		}
		else if (piqueo == 1){
			paginaPrincipal.precio5 = Double.parseDouble(txtPiqueo.getText());
			resumen = cboPiqueo.getSelectedItem();
			precioPiqueo = paginaPrincipal.precio5;
		}
		else if (piqueo == 2){
			paginaPrincipal.precio6 = Double.parseDouble(txtPiqueo.getText());
			resumen = cboPiqueo.getSelectedItem();
			precioPiqueo = paginaPrincipal.precio6;
		}
		else if (piqueo == 3){
			paginaPrincipal.precio7 = Double.parseDouble(txtPiqueo.getText());
			resumen = cboPiqueo.getSelectedItem();
			precioPiqueo = paginaPrincipal.precio7;
		}
		else{
			paginaPrincipal.precio8 = Double.parseDouble(txtPiqueo.getText());
			resumen = cboPiqueo.getSelectedItem();
			precioPiqueo = paginaPrincipal.precio8;
		}
		
		
		txtS.setText(" Se ha modificado el precio de " + resumen + " a :  S/ " + precioPiqueo);
		
	}
	
	// BOTON PARA CAMBIAR EL PRECIO DE LAS BEBIDAS
	protected void actionPerformedBtnModificarBebida(ActionEvent e) {
		
		int bebida;
		Object resumen = "";
		double precioBebida = 0;
		
		bebida = cboPiqueo.getSelectedIndex();
		
		
		
		if (bebida == 0){
			paginaPrincipal.precio9 = Double.parseDouble(txtBebida.getText());
			resumen = cboBebida.getSelectedItem();
			precioBebida = paginaPrincipal.precio9;
		}
		else if (bebida == 1){
			paginaPrincipal.precio10 = Double.parseDouble(txtBebida.getText());
			resumen = cboBebida.getSelectedItem();
			precioBebida = paginaPrincipal.precio10;
		}
		else if (bebida == 2){
			paginaPrincipal.precio11 = Double.parseDouble(txtBebida.getText());
			resumen = cboBebida.getSelectedItem();
			precioBebida = paginaPrincipal.precio11;
		}
		
		
		txtS.setText(" Se ha modificado el precio de " + resumen + " a :  S/ " + precioBebida);
		
	}
}
