//programa que permita ingresar el nombre de usuario y cuando se presione un botón mostrar el valor ingresado en la barra de títulos del JFrame
// programa que permita ingresar dos números en controles de tipo JTextField, luego sumar los dos valores ingresados y mostrar la suma
import javax.swing.*;
import java.awt.event.*;
public class Suma extends JFrame implements ActionListener{
	private JLabel label1,label2;
	private JButton boton1;
	private JTextField textfield1,textfield2;
	public Suma(){
		setLayout(null);
		label1 = new JLabel("Ingrese un numero");
		label1.setBounds(10,10,150,30);
		add(label1);
		label2 = new JLabel("Ingrese un numero");
		label2.setBounds(10,50,150,30);
		add(label2);
		
		textfield1 = new JTextField();
		textfield1.setBounds(160,10,150,30);
		add(textfield1);
		
		textfield2 = new JTextField();
		textfield2.setBounds(160,50,150,30);
		add(textfield2);
		
		boton1 = new JButton("Sumar");
		boton1.setBounds(10,85,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String s_num1 = textfield1.getText();
			String s_num2 = textfield2.getText();
			int num1 = Integer.parseInt(s_num1);
			int num2 = Integer.parseInt(s_num2);
			int res = num1 + num2;
			String s_res = String.valueOf(res);
				setTitle(s_res);
		}
	}
	public static void main (String[] args){
		Suma app = new Suma();
		app.setBounds(0,0,350,400);
		app.setVisible(true);
		app.setTitle("textfield");
		app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);
	}
}