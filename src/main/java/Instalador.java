import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Instalador {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instalador window = new Instalador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Instalador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplicacion instalada");
		lblNewLabel.setBounds(170, 51, 131, 13);
		frame.getContentPane().add(lblNewLabel);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("No");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(170, 162, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Si");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(170, 139, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("¿Aprobado?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            if (rdbtnNewRadioButton_1.isSelected()) {
	                JOptionPane.showMessageDialog(frame, "Has seleccionado la opcion correcta");
	            } else if (rdbtnNewRadioButton.isSelected()) {
	                JOptionPane.showMessageDialog(frame, "Error fatal.");
	            } else {
	                JOptionPane.showMessageDialog(frame, "Por favor, selecciona una opción.");
	            }
			}
		});
		btnNewButton.setBounds(170, 202, 103, 21);
		frame.getContentPane().add(btnNewButton);
		
	}
}
