//Confeccionaremos un menú de opciones que contenga además del JMenu de la barra otros dos objetos de la clase JMenu que dependan del primero.
//Uno debe mostrar dos JMenuItem que permitan modificar el tamaño del JFrame y el segundo también debe mostrar dos JMenuItem que permitan cambiar el color de fondo.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jmenu2 extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menu, menu2,menu3;
	private JMenuItem mi1 ,mi2 ,mi3,mi4,mi5;
	public Jmenu2(){
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		menu = new JMenu("Opciones");
		mb.add(menu);
		menu2 = new JMenu("Cambiar resolucion");
		menu.add(menu2);
		menu3 = new JMenu("Cambiar color"); 
		menu.add(menu3);
		
		
		mi1 = new JMenuItem("600*800");
		mi1.addActionListener(this);
		menu2.add(mi1);
		mi2 = new JMenuItem("1024*1200");
		mi2.addActionListener(this);
		menu2.add(mi2);
		mi3 = new JMenuItem("rojo");
		mi3.addActionListener(this);
		menu3.add(mi3);
		mi4 = new JMenuItem("verde");
		mi4.addActionListener(this);
		menu3.add(mi4);
		mi5 = new JMenuItem("azul");
		mi5.addActionListener(this);
		menu3.add(mi5);
	}
	public void actionPerformed(ActionEvent e){
		Container f = this.getContentPane();
		if(e.getSource() == mi1)
			setSize(600,800);
		if(e.getSource() == mi2)
			setSize(1024,1200);
		if(e.getSource() == mi3)
			f.setBackground(new Color (255,0,0));
		if(e.getSource() == mi4)
			f.setBackground(new Color(0,255,0));
		if(e.getSource() == mi5)
			f.setBackground(new Color(0,0,255));
	}
	public static void main(String[] args){
		Jmenu2 prueba = new Jmenu2();
		prueba.setBounds(0,0,500,200);
		prueba.setVisible(true);
		prueba.setTitle("Jmenu2");
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}