package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField jpassClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/icono/porcel.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 379);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/icono/logo 150px.png")));
		lblNewLabel.setBounds(70, 31, 150, 150);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setForeground(Color.BLACK);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setIcon(new ImageIcon(login.class.getResource("/icono/user 24px.png")));
		lblUsuario.setBounds(26, 204, 110, 25);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setForeground(Color.BLACK);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContrasea.setIcon(new ImageIcon(login.class.getResource("/icono/unlock 24px.png")));
		lblContrasea.setBounds(26, 233, 110, 25);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtUsuario.setBounds(162, 205, 100, 22);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jpassClave.setBounds(162, 234, 100, 22);
		contentPane.add(jpassClave);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// INICIO  VALIDA CONTRASEÑA + ABRE VENTANA "SELECCION PROYECTO" + SE CIERRA
				char[] clave = jpassClave.getPassword();
				String claveFinal = new String(clave);
				
				if (txtUsuario.getText().equals("admin") && claveFinal.equals("123")){
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido","Ingresaste", JOptionPane.INFORMATION_MESSAGE);
					seleccionProyecto sp = new seleccionProyecto();
					sp.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				//FINAL
				
			}
		});
		btnAcceder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAcceder.setBounds(95, 276, 100, 30);
		contentPane.add(btnAcceder);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.GRAY));
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(10, 11, 270, 318);
		contentPane.add(panel);
	}
}
