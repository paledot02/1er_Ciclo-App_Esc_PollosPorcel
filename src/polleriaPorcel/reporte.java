package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class reporte extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextArea textArea;
	private JButton button;
	private JButton button_1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			reporte dialog = new reporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public reporte() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(reporte.class.getResource("/icono/cake 24px.png")));
		setTitle("Reporte");
		setBounds(100, 100, 445, 390);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(1, 1, 401, 218);
		contentPanel.add(textArea);
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(24, 25, 379, 220);
		contentPanel.add(scrollPane);
		
		button = new JButton("");
		button.setBounds(247, 267, 86, 41);
		button.addActionListener(this);
		button.setIcon(new ImageIcon(reporte.class.getResource("/icono/eliminar.png")));
		contentPanel.add(button);
		
		button_1 = new JButton("");
		button_1.setBounds(106, 267, 86, 41);
		button_1.addActionListener(this);
		button_1.setIcon(new ImageIcon(reporte.class.getResource("/icono/check.png")));
		contentPanel.add(button_1);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
		if (arg0.getSource() == button_1) {
			actionPerformedButton_1(arg0);
		}
	}
	protected void actionPerformedButton_1(ActionEvent arg0) {
		
		mostrarReporte();
		
		
	}
	
	
	void mostrar( String res){
		
		textArea.append(res +  "\n");
				
	}
	
	
	void mostrarReporte(){
		
		mostrar ("Postres: " + "\n");
		
		mostrar (MenuPrincipal.nombrePostre0);
		mostrar ("Tamaño: "+ MenuPrincipal.tamano0);
		mostrar ("Precio: "+ String.valueOf(MenuPrincipal.precio0));
		mostrar ("Adicional: "+ MenuPrincipal.adicional0 + "\n");
		
		
		mostrar( MenuPrincipal.nombrePostre1);
		mostrar ("Tamaño: "+ MenuPrincipal.tamano1);
		mostrar ("Precio: "+ String.valueOf(MenuPrincipal.precio1));
		mostrar ("Adicional: "+ MenuPrincipal.adicional1+ "\n");
		
		
		mostrar(MenuPrincipal.nombrePostre2);
		mostrar ("Tamaño: "+ MenuPrincipal.tamano2);
		mostrar ("Precio: "+ String.valueOf(MenuPrincipal.precio2));
		mostrar ("Adicional: "+ MenuPrincipal.adicional2+ "\n");
		
		
		mostrar(MenuPrincipal.nombrePostre3);
		mostrar ("Tamaño: "+ MenuPrincipal.tamano3);
		mostrar ("Precio: "+ String.valueOf(MenuPrincipal.precio3));
		mostrar ("Adicional: "+ MenuPrincipal.adicional3+ "\n");
		
		
		
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		
		textArea.setText("");
	}
}
