package gui;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class vista extends JFrame{

	JFrame frame;
	private JTextField masa;
	private JTextField height;
	private JTextField bmiRes;
	private JTextField bmi;
	private JTextField categoria;
	private JTextField ancho;
	private JTextField resultado;
	private JButton CalcBMI;
	private JButton CalcCategoria;
	private JButton CalcObAbd;
	private JRadioButton hombre;
	private JRadioButton Mujer;
	private ButtonGroup bg=new ButtonGroup();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista window = new vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*^/

	/**
	 * Create the application.
	 */
	public vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 51));
		frame.getContentPane().setForeground(new Color(128, 128, 255));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Calculadora BMI");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 102));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Mass(kg):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_1, BorderLayout.WEST);
		
		masa = new JTextField();
		panel_2.add(masa, BorderLayout.CENTER);
		masa.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("     Height(m):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		 CalcBMI = new JButton("Calcular bmi");
		
		CalcBMI.setBackground(new Color(255, 255, 255));
		CalcBMI.setForeground(new Color(0, 0, 0));
		CalcBMI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(CalcBMI, BorderLayout.CENTER);
		
		
		
		height = new JTextField();
		panel_3.add(height, BorderLayout.WEST);
		height.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("        El BMI es:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(lblNewLabel_3, BorderLayout.EAST);
		
		bmiRes = new JTextField();
		panel_1.add(bmiRes, BorderLayout.EAST);
		bmiRes.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("BMI:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_5.add(lblNewLabel_4, BorderLayout.WEST);
		
		bmi = new JTextField();
		panel_5.add(bmi, BorderLayout.CENTER);
		bmi.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.EAST);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		 CalcCategoria = new JButton("Calcular categoria");
		CalcCategoria.setBackground(new Color(255, 255, 255));
		CalcCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_6.add(CalcCategoria, BorderLayout.WEST);
		
		JLabel lblNewLabel_5 = new JLabel("        La categoria es: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_6.add(lblNewLabel_5, BorderLayout.CENTER);
		
		categoria = new JTextField();
		panel_6.add(categoria, BorderLayout.EAST);
		categoria.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		ancho = new JTextField();
		panel_8.add(ancho, BorderLayout.CENTER);
		ancho.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Ancho de cintura(m):  ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_8.add(lblNewLabel_6, BorderLayout.WEST);
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9, BorderLayout.EAST);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		 hombre = new JRadioButton("Hombre");
		 hombre.setSelected(true);
		hombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_9.add(hombre, BorderLayout.NORTH);
		
		 Mujer = new JRadioButton("Mujer");
		Mujer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_9.add(Mujer, BorderLayout.SOUTH);
		bg.add(hombre);
		bg.add(Mujer);
		
		JPanel panel_10 = new JPanel();
		panel_7.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("El resultado es: ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_10.add(lblNewLabel_7, BorderLayout.WEST);
		
		resultado = new JTextField();
		panel_10.add(resultado, BorderLayout.CENTER);
		resultado.setColumns(10);
		
		 CalcObAbd = new JButton("Calcular obesidad abdominal");
		CalcObAbd.setBackground(new Color(255, 255, 255));
		panel_10.add(CalcObAbd, BorderLayout.EAST);
		
		JSeparator separator = new JSeparator();
		panel_10.add(separator, BorderLayout.NORTH);
		frame.setBounds(100, 100, 780, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
		
	}
	
	public double getMass() {
		try {
			return Double.parseDouble(masa.getText());
		}catch(Exception e) {
			bmiRes.setText("Introduce un valor válido");
			return -1;
		}
	}
	public double getHeigh() {
		try {
			return Double.parseDouble(height.getText());
		}catch(Exception e) {
			bmiRes.setText("Introduce un valor válido");
			return -1;
		}
	}
	public double getbmi() {
		try {
			return Double.parseDouble(bmi.getText());
		}catch(Exception e) {
			bmiRes.setText("Introduce un valor válido");
			return -1;
		}
	}
	public double getAncho() {
		try {
			return Double.parseDouble(ancho.getText());
		}catch(Exception e) {
			bmiRes.setText("Introduce un valor válido");
			return -1;
		}
	}
	public char getSexo() {
			if(hombre.isSelected()) {
				return 'M';
			}else {
				return 'F';
			}
	}
	public void registrarControlador(ActionListener ctrl) {
		CalcBMI.setActionCommand("CalcularBMI");
		CalcBMI.addActionListener(ctrl);
	}
	public void registrarControlador2(ActionListener ctrl) {
		CalcCategoria.setActionCommand("CalcularCategoria");
		CalcCategoria.addActionListener(ctrl);
	}
	public void registrarControlador3(ActionListener ctrl) {
		CalcObAbd.setActionCommand("CalcularObesidadAbdominal");
		CalcObAbd.addActionListener(ctrl);
	}
	
	public void setBMI(double a) {
		bmiRes.setText(""+a);
	}
	public void setCategoria(String a) {
		categoria.setText(a);
	}
	public void setObesidad(boolean a) {
		if(a==true) {
			resultado.setText("Tiene obesidad");
		}else {
			resultado.setText("No tiene obesidad");
		}
	}
	public void errorBMI(String msg) {
		bmiRes.setText(msg);
	}
	public void errorCategoria(String msg) {
		categoria.setText(msg);
	}
	public void errorOB(String msg) {
		resultado.setText(msg);
	}

	
	
	
	

}
