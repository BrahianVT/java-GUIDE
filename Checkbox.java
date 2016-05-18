//Confeccionar un programa que muestre 3 objetos de la clase JCheckBox con etiquetas de tres idiomas. Cuando se lo selecciona 
//mostrar en el título del JFrame todos los JCheckBox seleccionados hasta el momento.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jmenu3 extends JFrame implements ActionListener{
	private JLabel label1 ,label2;
	private JTextField text1 , text2;
	private JMenuBar mb;
	private JMenu menu1 ;
	private  JMenuItem mi1,mi2;
	public Jmenu3(){
		setLayout(null);
		label1 = new JLabel("Largo");
		label1.setBounds(10,10,150,25);
		add(label1);
		label2 = new JLabel("Ancho");
		label2.setBounds(10,45,150,25);
		add(label2);
		
		text1 = new JTextField();
		text1.setBounds(170,10,130,25);
		add(text1);
		text2 = new JTextField();
		text2.setBounds(170,45,130,25);
		add(text2);
		
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		
		mi1 = new JMenuItem("Redimensionar");
		mi1.addActionListener(this);
		menu1.add(mi1);
		mi2 = new JMenuItem("Salir");
		mi2.addActionListener(this);
		menu1.add(mi2);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == mi1){
				if(text1.getText().length() == 0 || text2.getText().length() == 0 ){
				setTitle("Ingrese correctamente cordenadas");
				}
			else{
			int ancho = Integer.parseInt(text1.getText());
			int largo = Integer.parseInt(text2.getText());
			setSize(ancho,largo);
			}
		}
		if(e.getSource() == mi2)
		System.exit(0);
	}
	public static void main(String[] args){
		Jmenu3 prueba = new Jmenu3();
		prueba.setBounds(0,0,400,600);
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}
