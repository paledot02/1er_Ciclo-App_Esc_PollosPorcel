package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class MenuPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnInicio;
	private JMenu mnConsultar;
	private JMenu mnMantenimiento;
	private JMenu mnReporte;
	private JMenu mnVenta;
	private JMenu mnObsequios;
	private JMenuItem mntmProductos;
	private JMenuItem mntmMantenimiento;
	private JMenuItem mntmReporte;
	
	public static String nombrePostre0 = "Chesse Cake";
	public static String tamano0 = "1 tajada";
	public static double precio0 = 13.00;
	public static String adicional0 = "Caja de presentación";
	

	public static String nombrePostre1 = "Torta de Chocolate";
    public static String tamano1 = "1 tajada";
	public static double precio1 = 11.00;
	public static String adicional1 = "Caja de presentación";
	

	public static String nombrePostre2 = "Tres Leches";
    public static String tamano2 = "1 tajada";
	public static double precio2 = 10.00;
	public static String adicional2 = "Caja de presentación";
	

	public static String nombrePostre3 = "Pye";
    public static String tamano3 = "1 tajada";
	public static double precio3 = 8.00;
	public static String adicional3 = "Caja de presentación";
	
	private JMenu mnSalir;
	private JMenuItem mntmReporteDeVentas;
	private JMenuItem mntmVenta;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/icono/cake 24px.png")));
		setTitle("Postres Porcel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 368);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnInicio = new JMenu("Inicio");
		mnInicio.setSelectedIcon(null);
		mnInicio.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/home1.png")));
		menuBar.add(mnInicio);
		
		mnConsultar = new JMenu("Archivo");
		mnConsultar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/archivo.png")));
		menuBar.add(mnConsultar);
		
		mntmProductos = new JMenuItem("Productos");
		mntmProductos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_7, InputEvent.CTRL_MASK));
		mntmProductos.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/cake 24px.png")));
		mntmProductos.addActionListener(this);
		mnConsultar.add(mntmProductos);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/mantenimiento 01.png")));
		menuBar.add(mnMantenimiento);
		
		mntmMantenimiento = new JMenuItem("Modificar");
		mntmMantenimiento.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_8, InputEvent.ALT_MASK));
		mntmMantenimiento.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/editar_.png")));
		mntmMantenimiento.addActionListener(this);
		mnMantenimiento.add(mntmMantenimiento);
		
		mnReporte = new JMenu("Reporte");
		mnReporte.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/lista.png")));
		menuBar.add(mnReporte);
		
		mntmReporte = new JMenuItem("Reporte");
		mntmReporte.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, InputEvent.SHIFT_MASK));
		mntmReporte.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/lista1.png")));
		mntmReporte.addActionListener(this);
		mnReporte.add(mntmReporte);
		
		mnVenta = new JMenu("Venta");
		mnVenta.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/venta.png")));
		menuBar.add(mnVenta);
		
		mntmVenta = new JMenuItem("Venta");
		mntmVenta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.ALT_MASK));
		mntmVenta.addActionListener(this);
		mntmVenta.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/apoyo-tecnico.png")));
		mnVenta.add(mntmVenta);
		
		mntmReporteDeVentas = new JMenuItem("Reporte de ventas");
		mntmReporteDeVentas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmReporteDeVentas.addActionListener(this);
		mntmReporteDeVentas.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/reporte.png")));
		mnVenta.add(mntmReporteDeVentas);
		
		mnObsequios = new JMenu("Configuración");
		mnObsequios.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/mante.png")));
		menuBar.add(mnObsequios);
		
		mnSalir = new JMenu("Ayuda");
		mnSalir.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icono/ayuda.png")));
		menuBar.add(mnSalir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == mntmVenta) {
			actionPerformedMntmVenta(arg0);
		}
		if (arg0.getSource() == mntmReporte) {
			actionPerformedMntmReporte(arg0);
		}
		if (arg0.getSource() == mntmMantenimiento) {
			actionPerformedMntmMantenimiento(arg0);
		}
		if (arg0.getSource() == mntmProductos) {
			actionPerformedMntmProductos(arg0);
		}
	}
	protected void actionPerformedMntmProductos(ActionEvent arg0) {
		
		consultar cons;
		cons=new consultar();
		cons.setVisible(true);
		
	}
	protected void actionPerformedMntmMantenimiento(ActionEvent arg0) {
		
		modificar mod;
		
		mod= new modificar();
		mod.setVisible(true);
		
	}
	protected void actionPerformedMntmReporte(ActionEvent arg0) {
		
		
		reporte rep;
		
		rep= new reporte();
		
		rep.setVisible(true);
	}
	protected void actionPerformedMntmVenta(ActionEvent arg0) {
		
		venta ven;
		
		ven = new venta();
		
		ven.setVisible(true);
	}
	
}
