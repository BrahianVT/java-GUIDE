//Confeccionaremos un menú de opciones que contenga tres opciones 
//que permita cambiar el color de fondo del JFrame a los colores: rojo, verde y azul.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jmenu extends JFrame implements ActionListener{
	private JMenu menu;
	private JMenuBar mb;
	private JMenuItem mi1 ,mi2 ,mi3;
	public Jmenu(){
		setLayout(null);
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		menu = new JMenu("opciones");
		mb.add(menu);
		
		mi1 = new JMenuItem("rojo");
		mi1.addActionListener(this);
		menu.add(mi1);
		mi2 = new JMenuItem("verde");
		mi2.addActionListener(this);
		menu.add(mi2);
		mi3 = new JMenuItem("amarillo");
		mi3.addActionListener(this);
		menu.add(mi3);
	}
	public void actionPerformed(ActionEvent e){
		Container f = this.getContentPane();
		if(e.getSource() == mi1)
			f.setBackground(new Color (255,0,0));
		if(e.getSource() == mi2)
			f.setBackground(new Color(0,255,0));
		if(e.getSource() == mi3)
			f.setBackground(new Color(0,0,255));
	}
	public static void main(String[] args){
		Jmenu prueba = new Jmenu();
		prueba.setBounds(0,0,500,200);
		prueba.setVisible(true);
		prueba.setTitle("Jmenu");
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}