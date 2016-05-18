//Cargar en un JComboBox los nombres de varios colores. Al seleccionar alguno 
//mostrar en la barra de título del JFrame el String seleccionado.
import javax.swing.*;
import java.awt.event.*;
public class Combobox extends JFrame implements ItemListener{
	private JComboBox combobox1;
	public Combobox(){
		setLayout(null);
		combobox1 = new JComboBox();
		combobox1.setBounds(10,10,80,20);
		add(combobox1);
		combobox1.addItem("rojo");
		combobox1.addItem("verde");
		combobox1.addItem("azul");
		combobox1.addItem("amarillo");
		combobox1.addItem("negro");
		combobox1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource() == combobox1){
			String color = (String)combobox1.getSelectedItem();
			setTitle(color);
		}
	}
	public static void main(String[] args){
		Combobox prueba = new Combobox();
		prueba.setBounds(0,0,200,100);
		prueba.setTitle("Combo box");
		prueba.setVisible(true);
		prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
	}
}