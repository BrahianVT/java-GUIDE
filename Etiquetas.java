import javax.swing.*;
public class Etiquetas extends JFrame{
	JLabel label1 , label2;
	public Etiquetas(){
		setLayout(null);
		label1 = new JLabel("Sistema de facturacion");
		label1.setBounds(10,0,250,30);
		add(label1);
		label2 = new JLabel("Version 1.0");
		label2.setBounds(10,150,100,30);
		add(label2);
	}
	public static void main(String [] args){
		Etiquetas ventana1 = new Etiquetas();
		ventana1.setBounds(0,0,300,200);
		ventana1.setResizable(false);
		ventana1.setVisible(true);
		ventana1.setTitle("Dos etiquetas");
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}