package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class pedidoBrasa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox cboBrasa;
	private JComboBox cboPiqueo;
	private JComboBox cboBebida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			pedidoBrasa dialog = new pedidoBrasa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public pedidoBrasa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(pedidoBrasa.class.getResource("/icono/pollo 32px.png")));
		setTitle("Pedido");
		setBounds(100, 100, 319, 322);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblBrasa = new JLabel("Brasa : ");
			lblBrasa.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblBrasa.setBounds(33, 81, 61, 22);
			contentPanel.add(lblBrasa);
		}
		{
			cboBrasa = new JComboBox();
			cboBrasa.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cboBrasa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					/////////////////ENTREGA VALOR A PEDIDO BRASA FINAL/////////////////
					int brasa = cboBrasa.getSelectedIndex();
					
					if (brasa==0){ paginaPrincipal.pedidoBrasaFinal = paginaPrincipal.precio0 ;}
					else if (brasa==1){ paginaPrincipal.pedidoBrasaFinal = paginaPrincipal.precio1 ; }
					else if (brasa==2){ paginaPrincipal.pedidoBrasaFinal = paginaPrincipal.precio2 ; }
					else { paginaPrincipal.pedidoBrasaFinal = paginaPrincipal.precio3 ; }
					
					//////////////////////////////////
				}
			});
			cboBrasa.setModel(new DefaultComboBoxModel(new String[] {"Pollo Entero", "Medio Pollo 1", "Medio Pollo 2", "Cuarto de Pollo"}));
			cboBrasa.setBounds(104, 81, 164, 22);
			contentPanel.add(cboBrasa);
		}
		{
			JLabel lblPiqueo = new JLabel("Piqueo :");
			lblPiqueo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblPiqueo.setBounds(33, 124, 61, 22);
			contentPanel.add(lblPiqueo);
		}
		{
			cboPiqueo = new JComboBox();
			cboPiqueo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cboPiqueo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					///////////ENTREGA VALOR A PEDIDO PIQUEO FINAL///////////
					
					int piqueo = cboPiqueo.getSelectedIndex();
					
					if(piqueo==0){ paginaPrincipal.pedidoPiqueoFinal = paginaPrincipal.precio4 ; }
					else if(piqueo==1){ paginaPrincipal.pedidoPiqueoFinal = paginaPrincipal.precio5 ; }
					else if(piqueo==2){ paginaPrincipal.pedidoPiqueoFinal = paginaPrincipal.precio6 ; }
					else if(piqueo==3){ paginaPrincipal.pedidoPiqueoFinal = paginaPrincipal.precio7 ; }
					else { paginaPrincipal.pedidoPiqueoFinal = paginaPrincipal.precio8 ; }
					
					///////////////////////////////
					
				}
			});
			cboPiqueo.setModel(new DefaultComboBoxModel(new String[] {"Yuquita a la Huancaina", "Alitas", "Salchipollo", "Anticuchos", "Ensalada Fresca"}));
			cboPiqueo.setBounds(104, 124, 164, 22);
			contentPanel.add(cboPiqueo);
		}
		{
			JLabel lblBebida = new JLabel("Bebida :");
			lblBebida.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblBebida.setBounds(33, 167, 61, 22);
			contentPanel.add(lblBebida);
		}
		{
			cboBebida = new JComboBox();
			cboBebida.setFont(new Font("Tahoma", Font.PLAIN, 13));
			cboBebida.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					/////////////////ENTREGA VALOR A PEDIDO BEBIDA FINAL/////////////////////
					
					int bebida = cboBebida.getSelectedIndex();
					
					if(bebida==0){ paginaPrincipal.pedidoBebidaFinal = paginaPrincipal.precio9 ; }
					else if (bebida==1){ paginaPrincipal.pedidoBebidaFinal = paginaPrincipal.precio10 ; }
					else { paginaPrincipal.pedidoBebidaFinal = paginaPrincipal.precio11 ; }
					
					///////////////////////////////////
				}
			});
			cboBebida.setModel(new DefaultComboBoxModel(new String[] {"Inka Cola 1.5L", "Coca Cola 1.5L", "Chicha Morada 1L"}));
			cboBebida.setBounds(104, 167, 164, 22);
			contentPanel.add(cboBebida);
		}
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(92, 213, 119, 34);
		contentPanel.add(btnNewButton);
		
		JLabel lblPedido = new JLabel("PEDIDO");
		lblPedido.setIcon(new ImageIcon(pedidoBrasa.class.getResource("/icono/comer.png")));
		lblPedido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPedido.setBounds(105, 11, 92, 44);
		contentPanel.add(lblPedido);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.GRAY));
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(10, 11, 283, 261);
		contentPanel.add(panel);
	}
}
