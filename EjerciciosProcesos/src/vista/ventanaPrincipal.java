package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ventanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldProceso1;
	private JTextField textFieldProceso2;
	private JTextField textFieldProceso3;
	private JTextField textFieldResultado1;
	private JTextField textFieldResultado2;
	
	
	private JButton btnProceso1;
	private JButton btnProceso2;
	private JButton btnProceso3;
	private JLabel lblProceso1;
	private JLabel lblProceso2;
	private JLabel lblProceso3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal vista = new ventanaPrincipal();
					modelo.Procesos modelo = new modelo.Procesos();
					
					
					new controlador.ControladorProcesos(vista, modelo);
					
					vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPID = new JLabel("PID");
		lblPID.setBounds(10, 125, 46, 14);
		contentPane.add(lblPID);
		
		textFieldProceso1 = new JTextField();
		textFieldProceso1.setBounds(74, 24, 86, 20);
		contentPane.add(textFieldProceso1);
		textFieldProceso1.setColumns(10);
		
		textFieldProceso2 = new JTextField();
		textFieldProceso2.setBounds(232, 24, 86, 20);
		contentPane.add(textFieldProceso2);
		textFieldProceso2.setColumns(10);
		
		textFieldProceso3 = new JTextField();
		textFieldProceso3.setBounds(371, 24, 112, 20);
		contentPane.add(textFieldProceso3);
		textFieldProceso3.setColumns(10);
		
		
		btnProceso1 = new JButton("Start");
		btnProceso1.setBounds(71, 73, 89, 23);
		contentPane.add(btnProceso1);
		
		btnProceso2 = new JButton("Start");
		btnProceso2.setBounds(232, 73, 89, 23);
		contentPane.add(btnProceso2);
		
		btnProceso3 = new JButton("Start");
		btnProceso3.setBounds(379, 73, 89, 23);
		contentPane.add(btnProceso3);
		
		lblProceso1 = new JLabel("");
		lblProceso1.setBounds(73, 125, 87, 14);
		contentPane.add(lblProceso1);
		
		lblProceso2 = new JLabel("");
		lblProceso2.setBounds(232, 125, 86, 14);
		contentPane.add(lblProceso2);
		
		lblProceso3 = new JLabel("");
		lblProceso3.setBounds(372, 125, 189, 14);
		contentPane.add(lblProceso3);
		
		JLabel lblPIDPadre = new JLabel("PID Padre");
		lblPIDPadre.setBounds(10, 164, 57, 14);
		contentPane.add(lblPIDPadre);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(90, 164, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(214, 164, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(343, 160, 218, 23);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 233, 46, 14);
		contentPane.add(lblResultado);
		
		textFieldResultado1 = new JTextField();
		textFieldResultado1.setBounds(103, 201, 162, 249);
		contentPane.add(textFieldResultado1);
		textFieldResultado1.setColumns(10);
		
		textFieldResultado2 = new JTextField();
		textFieldResultado2.setBounds(321, 201, 162, 249);
		contentPane.add(textFieldResultado2);
		textFieldResultado2.setColumns(10);
	}

	public JButton getBtnProceso1() { return btnProceso1; }
	public JButton getBtnProceso2() { return btnProceso2; }
	public JButton getBtnProceso3() { return btnProceso3; }

	public void setPidProceso1(String pid) { lblProceso1.setText(pid); }
	public void setPidProceso2(String pid) { lblProceso2.setText(pid); }
	public void setPidProceso3(String pid) { lblProceso3.setText(pid); }

	public void setPidPadreProceso1(String pidPadre) { lblNewLabel_5.setText(pidPadre); }
	public void setPidPadreProceso2(String pidPadre) { lblNewLabel_6.setText(pidPadre); }
	public void setPidPadreProceso3(String pidPadre) { lblNewLabel_7.setText(pidPadre); }
	
	public void setTextoResultado1(String texto) { textFieldResultado1.setText(texto); }
	public void setTextoResultado2(String texto) { textFieldResultado2.setText(texto); }
	
	// Métodos para escribir el nombre del proceso en los campos de arriba
	public void setNombreProceso1(String nombre) { textFieldProceso1.setText(nombre); }
	public void setNombreProceso2(String nombre) { textFieldProceso2.setText(nombre); }
	public void setNombreProceso3(String nombre) { textFieldProceso3.setText(nombre); }

}
