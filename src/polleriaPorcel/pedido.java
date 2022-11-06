package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class pedido extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextArea txtPedido;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			pedido dialog = new pedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public pedido() {
		setBounds(100, 100, 401, 504);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Generar Pedido");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// IMPRIMIR ////////////////////////////////////////////////////////////////
				
				txtPedido.setText("" + "\n" );
				txtPedido.append("         DATOS PERSONALES" + "\n" + "\n");
				txtPedido.append("     Nombre          :  " + paginaPrincipal.nombre + "\n");
				txtPedido.append("     Apellido        :  " + paginaPrincipal.apellido + "\n");
				txtPedido.append("     Dni             :  " + paginaPrincipal.dni + "\n");
				txtPedido.append("     Numero Celular  :  " + paginaPrincipal.numeroCelular + "\n");
				txtPedido.append("     Dirección       :  " + paginaPrincipal.direccion + "\n");
				
				////IMPRIMIR METODO DE PAGO//////////
				
				if (paginaPrincipal.mpago == 0){
					txtPedido.append("     Metodo de Pago  :  Efectivo " + "\n" );
					}
				else {
					txtPedido.append("     Metodo de Pago  :  Tarjeta " + "\n" );
					}
				/////////////////////////////////////
				
				txtPedido.append("" + "\n" );
				txtPedido.append("         PEDIDO" + "\n" + "\n");
				
				//////IMPRIMIR EL PEDIDO DE BRASA //////
				if (paginaPrincipal.pedidoBrasaFinal == paginaPrincipal.precio0 ){
					txtPedido.append("     Pollo Entero :  S/. " + paginaPrincipal.precio0 + "\n" );
					}
				else if (paginaPrincipal.pedidoBrasaFinal == paginaPrincipal.precio1){
					txtPedido.append("     Medio Pollo + 2 guarniciones:  S/. " + paginaPrincipal.precio1 + "\n" );
					}
				else if (paginaPrincipal.pedidoBrasaFinal == paginaPrincipal.precio2){
					txtPedido.append("     Medio Pollo + 1 guarniciones:  S/. " + paginaPrincipal.precio2 + "\n" );
				}
				else {
					txtPedido.append("     Cuarto de Pollo :  S/. " + paginaPrincipal.precio3 + "\n" );
				}
				////////////////////////////////////////////
				
				//////IMPRIMIR EL PEDIDO DE PIQUEO //////
				if (paginaPrincipal.pedidoPiqueoFinal == paginaPrincipal.precio4 ){
					txtPedido.append("     Yuquita :  S/. " + paginaPrincipal.precio4 + "\n" );
					}
				else if (paginaPrincipal.pedidoPiqueoFinal == paginaPrincipal.precio5){
					txtPedido.append("     Alitas :  S/. " + paginaPrincipal.precio5 + "\n" );
					}
				else if (paginaPrincipal.pedidoPiqueoFinal == paginaPrincipal.precio6){
					txtPedido.append("     Salchipollo :  S/. " + paginaPrincipal.precio6 + "\n" );
					}
				else if (paginaPrincipal.pedidoPiqueoFinal == paginaPrincipal.precio7){
					txtPedido.append("     Anticucho :  S/. " + paginaPrincipal.precio7 + "\n" );
					}
				else {
					txtPedido.append("     Ensalada Fresca :  S/. " + paginaPrincipal.precio8 + "\n" );
					}
				////////////////////////////////////////////
				
				//////IMPRIMIR EL PEDIDO DE BEBIDA //////
				
				if (paginaPrincipal.pedidoBebidaFinal == paginaPrincipal.precio9 ){
					txtPedido.append("     Inka Cola 1.5L :  S/. " + paginaPrincipal.precio9 + "\n" );
					}
				else if (paginaPrincipal.pedidoBebidaFinal == paginaPrincipal.precio10){
					txtPedido.append("     Coca Cola 1.5L :  S/. " + paginaPrincipal.precio10 + "\n" );
					}
				else {
					txtPedido.append("     Chicha Morada 1L :  S/. " + paginaPrincipal.precio11 + "\n" );
					}
				
				////////////////////////////////////////////
				
				double monto = paginaPrincipal.pedidoBrasaFinal + paginaPrincipal.pedidoPiqueoFinal + paginaPrincipal.pedidoBebidaFinal ;
					txtPedido.append("" + "\n" + "\n" );
					txtPedido.append("     Monto Total : S/. " + monto );
				
				
				// FIN /////////////////////////////////////////////////////////////////////
			}
		});
		btnNewButton.setBounds(122, 30, 141, 34);
		contentPanel.add(btnNewButton);
		
		txtPedido = new JTextArea();
		txtPedido.setFont(new Font("Courier New", Font.PLAIN, 13));
		txtPedido.setBounds(29, 84, 326, 332);
		contentPanel.add(txtPedido);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.LIGHT_GRAY));
		panel.setBounds(10, 11, 365, 443);
		
		contentPanel.add(panel);
	}
}
