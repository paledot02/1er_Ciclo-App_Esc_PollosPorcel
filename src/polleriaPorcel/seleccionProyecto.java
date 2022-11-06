package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class seleccionProyecto extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seleccionProyecto frame = new seleccionProyecto();
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
	public seleccionProyecto() {
		setTitle("Porcel");
		setIconImage(Toolkit.getDefaultToolkit().getImage(seleccionProyecto.class.getResource("/icono/porcel.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Integrantes");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// INICIO
				integrantes it;
				it = new integrantes();
				it.setVisible(true);
				//FINAL
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(seleccionProyecto.class.getResource("/icono/personas.png")));
		btnNewButton.setBounds(0, 0, 446, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ABIR VENTANA POLLO PRINCIPAL
				
				paginaPrincipal pp;
				pp = new paginaPrincipal();
				pp.setVisible(true);
				
				dispose();
				
				//FIN
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(seleccionProyecto.class.getResource("/icono/pollo.png")));
		btnNewButton_1.setBounds(10, 40, 200, 200);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				///////ABRIR PAGINA PRINCIPAL POSTRES
			MenuPrincipal m;
			m = new MenuPrincipal();
			m.setVisible(true);
			
			dispose();
				/////////////
			}
		});
		button.setIcon(new ImageIcon(seleccionProyecto.class.getResource("/icono/postres.png")));
		button.setBounds(236, 40, 200, 200);
		contentPane.add(button);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 28, 223, 225);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(223, 28, 223, 225);
		contentPane.add(panel_1);
	}
}
