package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class datosCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField txtDireccion;
	private JTextField txtCelular;
	private JComboBox cboPago;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			datosCliente dialog = new datosCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public datosCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(datosCliente.class.getResource("/icono/pollo 32px.png")));
		setTitle("Datos del Cliente");
		setBounds(100, 100, 355, 391);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre : ");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(27, 77, 109, 22);
			contentPanel.add(lblNewLabel);
		}
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombre.setBounds(162, 78, 151, 20);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido : ");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellido.setBounds(27, 110, 109, 22);
		contentPanel.add(lblApellido);
		
		JLabel lblDatosDelCliente = new JLabel("Datos del Cliente");
		lblDatosDelCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatosDelCliente.setBounds(112, 31, 115, 17);
		contentPanel.add(lblDatosDelCliente);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtApellido.setColumns(10);
		txtApellido.setBounds(162, 111, 151, 20);
		contentPanel.add(txtApellido);
		
		JLabel lblDni = new JLabel("Dni : ");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(27, 143, 109, 22);
		contentPanel.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDni.setColumns(10);
		txtDni.setBounds(162, 141, 151, 20);
		contentPanel.add(txtDni);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n : ");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDireccin.setBounds(27, 176, 109, 22);
		contentPanel.add(lblDireccin);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(162, 177, 151, 20);
		contentPanel.add(txtDireccion);
		
		JLabel lblMetodoDePago = new JLabel("Numero Celular : ");
		lblMetodoDePago.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMetodoDePago.setBounds(27, 209, 109, 22);
		contentPanel.add(lblMetodoDePago);
		
		JLabel label = new JLabel("Metodo de pago : ");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(27, 242, 109, 22);
		contentPanel.add(label);
		
		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCelular.setColumns(10);
		txtCelular.setBounds(162, 208, 151, 20);
		contentPanel.add(txtCelular);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// INICIO
				
				// GUARDAMOS LOS VALORES /////////////////////
				
				paginaPrincipal.nombre = txtNombre.getText();  //JtextField
				paginaPrincipal.apellido = txtApellido.getText();
				paginaPrincipal.dni = Integer.parseInt(txtDni.getText());
				paginaPrincipal.numeroCelular = Integer.parseInt(txtCelular.getText());
				paginaPrincipal.direccion = txtDireccion.getText();
				paginaPrincipal.mpago = cboPago.getSelectedIndex();   //JComboBox
				
				dispose();
				
				// FIN ////////////////////////////
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(110, 289, 118, 33);
		contentPanel.add(btnNewButton);
		
		cboPago = new JComboBox();
		cboPago.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta"}));
		cboPago.setBounds(162, 244, 151, 20);
		contentPanel.add(cboPago);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), Color.GRAY));
		panel.setBounds(10, 11, 319, 330);
		contentPanel.add(panel);
	}
}
