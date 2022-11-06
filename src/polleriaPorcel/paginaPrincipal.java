package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.SystemColor;
import java.awt.Insets;

public class paginaPrincipal extends JFrame {

	private JPanel contentPane;

	// INICIO
	
	//BRASA
	
	public static String brasa0 = "Pollo Entero";
	public static Double precio0 = 66.9;
	public static String acompana0 = "1 Guarnici�n";
	
	public static String brasa1 = "Medio Pollo";
	public static Double precio1 = 39.9;
	public static String acompana1 = "2 Guarnici�n";
	
	public static String brasa2 = "Medio Pollo";
	public static Double precio2 = 34.9;
	public static String acompana2 = "1 Guarnici�n";
	
	public static String brasa3 = "Cuarto Pollo";
	public static Double precio3 = 24.9;
	public static String acompana3 = "1 Guarnici�n";
	
	// ENTRADA
	
	public static String entrada0 = "Yuquita a la Huancaina";
	public static Double precio4 = 9.9;
	
	public static String entrada1 = "Alitas";
	public static Double precio5 = 10.9;
	
	public static String entrada2 = "Salchipollo";
	public static Double precio6 = 17.9;
	
	public static String entrada3 = "Anticucho";
	public static Double precio7 = 19.9;
	
	public static String entrada4 = "Ensalada Fresca";
	public static Double precio8 = 16.9;
	
	// BEBIDA
	
	public static String bebida0 = "Inka Cola 1.5L";
	public static Double precio9 = 10.9;
	
	public static String bebida1 = "Coca Cola 1.5L";
	public static Double precio10 = 10.9;
	
	public static String bebida2 = "Chicha Morada 1L";
	public static Double precio11 = 8.9;
	
	// DATOS DEL CLIENTE
	
	public static String nombre;
	public static String apellido;
	public static int    dni;
	public static int    numeroCelular;
	public static String direccion;
	public static int mpago; 
	
	// PEDIDO FINAL
	public static double pedidoBrasaFinal;
	public static double pedidoPiqueoFinal;
	public static double pedidoBebidaFinal;
	
	
	// FIN
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paginaPrincipal frame = new paginaPrincipal();
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
	public paginaPrincipal() {
		setTitle("Polleria Porcel");
		setIconImage(Toolkit.getDefaultToolkit().getImage(paginaPrincipal.class.getResource("/icono/pollo 32px.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 402);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.controlHighlight);
		setJMenuBar(menuBar);
		
		JMenu mnGbfv = new JMenu("Mantenimiento");
		mnGbfv.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnGbfv.setForeground(Color.BLACK);
		mnGbfv.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/mantenimiento 01.png")));
		menuBar.add(mnGbfv);
		
		JMenuItem mntmLista = new JMenuItem("Lista");
		mntmLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ABRIR LA VENTANA LISTA
				lista li;
				li = new lista();
				li.setVisible(true);
				// FIN
				
			}
		});
		mntmLista.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mntmLista.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/lista.png")));
		mnGbfv.add(mntmLista);
		
		JMenuItem mntmCambiarPrecio = new JMenuItem("Cambiar Precio");
		mntmCambiarPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ABRIR VENTANA CAMBIAR PRECIO
				cambiarPrecio cp;
				cp = new cambiarPrecio();
				cp.setVisible(true);
				// FIN
			}
		});
		mntmCambiarPrecio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mntmCambiarPrecio.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/Cambiar precio.png")));
		mnGbfv.add(mntmCambiarPrecio);
		
		JMenu mnSalir = new JMenu("Archivo");
		mnSalir.setForeground(Color.BLACK);
		mnSalir.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnSalir.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/apoyo-tecnico.png")));
		menuBar.add(mnSalir);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setForeground(Color.BLACK);
		mntmSalir.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmSalir.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/salida.png")));
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  // SALIR
			}
		});
		mnSalir.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnErver = new JMenu("erver");
		mnErver.setBounds(91, -23, 39, 30);
		contentPane.add(mnErver);
		
		JMenu mnAscacssca = new JMenu("ascacssca");
		mnErver.add(mnAscacssca);
		
		JButton button = new JButton("");
		button.setBackground(new Color(240, 240, 240));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ABRIR DATOS CLIENTE
				datosCliente dc;
				dc=new datosCliente();
				dc.setVisible(true);
				//FIN
			}
		});
		button.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/dni.png")));
		button.setBounds(6, 6, 215, 260);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ABRIR VENTANA PEDIDOS BRASA
				pedidoBrasa pb;
				pb = new pedidoBrasa();
				pb.setVisible(true);
				// FIN
				
			}
		});
		button_1.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/pedido.png")));
		button_1.setBounds(227, 6, 215, 260);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("Reporte Final del Pedido");
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/icono/Salida Reporte 32px.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// PEDIDO FINAL
				pedido pedi;
				pedi = new pedido ();
				pedi.setVisible(true);
				// FIN
			}
		});
		btnNewButton.setBounds(0, 272, 448, 57);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 170,235));
		panel.setBounds(0, 0, 224, 272);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 170,235));
		panel_1.setBounds(224, 0, 224, 272);
		contentPane.add(panel_1);
	}
}
