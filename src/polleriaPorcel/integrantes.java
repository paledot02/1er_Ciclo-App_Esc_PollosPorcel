package polleriaPorcel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

public class integrantes extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			integrantes dialog = new integrantes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public integrantes() {
		setBounds(100, 100, 337, 293);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblIntegrantes = new JLabel("Integrantes");
		lblIntegrantes.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		lblIntegrantes.setBounds(105, 20, 103, 26);
		contentPanel.add(lblIntegrantes);
		
		JLabel lblNewLabel = new JLabel("Ramos Ccoyllar Jean                   T1AC");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblNewLabel.setBounds(32, 69, 270, 26);
		contentPanel.add(lblNewLabel);
		
		JLabel lblBasilioVillanuevaKevin = new JLabel("Basilio Villanueva Kevin             T1AN");
		lblBasilioVillanuevaKevin.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblBasilioVillanuevaKevin.setBounds(32, 106, 270, 26);
		contentPanel.add(lblBasilioVillanuevaKevin);
		
		JLabel lblAnicamaMachucaDaniel = new JLabel("Anicama Machuca Daniel           T1AN");
		lblAnicamaMachucaDaniel.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblAnicamaMachucaDaniel.setBounds(32, 143, 270, 26);
		contentPanel.add(lblAnicamaMachucaDaniel);
		
		JLabel lblChiroqueRevolledoStephany = new JLabel("Chiroque Revolledo Stephany   T1AN");
		lblChiroqueRevolledoStephany.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		lblChiroqueRevolledoStephany.setBounds(32, 180, 270, 26);
		contentPanel.add(lblChiroqueRevolledoStephany);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.text, SystemColor.textInactiveText));
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(10, 11, 301, 232);
		contentPanel.add(panel);
	}
}
