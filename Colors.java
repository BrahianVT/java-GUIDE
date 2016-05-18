//Disponer tres controles de tipo JComboBox con valores entre 0 y 255 (cada uno representa la cantidad de rojo, verde y azul).
// Luego al presionar un botón pintar el
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Colors extends JFrame implements ActionListener{
	private JLabel label1,label2,label3;
	private JButton boton1;
	private JComboBox combo1 ,combo2 , combo3;
	public Colors(){
		setLayout(null);
		label1 = new JLabel("Rojo:");
		label1.setBounds(10,10,110,25);
		add(label1);
		label2 = new JLabel("Verde:");
		label2.setBounds(10,45,110,25);
		add(label2);
		label3 = new JLabel("Azul");
		label3.setBounds(10,75,110,25);
		add(label3);
		
		combo1 = new JComboBox();
		combo1.setBounds(130,10,80,25);
		combo2 = new JComboBox();
		combo2.setBounds(130,45,80,25);
		combo3 = new JComboBox();
		combo3.setBounds(130,75,80,25);
		for(int i = 0; i <= 255; i++){
			combo1.addItem(String.valueOf(i));
			combo2.addItem(String.valueOf(i));
			combo3.addItem(String.valueOf(i));
		}  add(combo1); add(combo2); add(combo3);
		
		boton1 = new JButton("Color");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String cad1 = (String)combo1.getSelectedItem();
			String cad2 = (String)combo2.getSelectedItem();
			String cad3 = (String)combo3.getSelectedItem();
			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);
			Color color_nuevo = new Color(rojo,verde,azul);
			boton1.setBackground(color_nuevo);
		}
	}
	public static void main(String[] args) {
        Colors formulario1=new Colors();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
		formulario1.setTitle("Colores");
		formulario1.setDefaultCloseOperation(formulario1.EXIT_ON_CLOSE);
    }   
}