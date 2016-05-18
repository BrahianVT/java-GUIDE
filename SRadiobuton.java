//Permitir el ingreso de dos números en controles de tipo JTextField y mediante dos controles de tipo JRadioButton permitir seleccionar
// si queremos sumarlos o restarlos. Al presionar un botón mostrar en el título del JFrame el resultado de la operación.
import javax.swing.*;
import java.awt.event.*;
public class SRadiobuton extends JFrame implements  ActionListener{
	private JTextField num1 , num2;
	private JButton boton1;
	private JRadioButton rboton1, rboton2;
	private ButtonGroup bg;
	public SRadiobuton(){
		setLayout(null);
		num1 = new JTextField();
		num1.setBounds(10,10,140,25);
		add(num1);
		num2 = new JTextField();
		num2.setBounds(10,45,140,25);
		add(num2);
		
		bg = new ButtonGroup();
		rboton1 = new JRadioButton("Sumar");
		rboton1.setBounds(160,10,140,25);
		add(rboton1);
		bg.add(rboton1);
		rboton2 = new JRadioButton("Restar");
		rboton2.setBounds(160,45,140,25);
		add(rboton2);
		bg.add(rboton2);
		
		boton1 = new JButton("Realizar");
		boton1.setBounds(10,80,140,25);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			if(num1.getText().length() ==0 || num2.getText().length() ==0)
				setTitle("Ingrese numeros por favor");
			else{
				int val1 = Integer.parseInt(num1.getText());
				int val2 = Integer.parseInt(num2.getText());
				int tol = 0;
				if(rboton1.isSelected()){
					tol = val1 + val2;
				}
				if(rboton2.isSelected()){
					tol = val1 - val2;
				}
			String stol = String.valueOf(tol);
			setTitle(stol);
			}
		}
	}
		
	public static void main(String[] args){
		SRadiobuton prueba = new SRadiobuton();
		prueba.setBounds(0,0,400,300);
		prueba.setTitle("Radio button");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
} 