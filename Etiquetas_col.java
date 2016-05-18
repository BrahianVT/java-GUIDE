import javax.swing.*;
public class Etiquetas_col extends JFrame{
	private JLabel label1 , label2 , label3;
	public Etiquetas_col(){
		setLayout(null);
		label1 = new JLabel("Etiqueta uno");
		label1.setBounds(10,0,100,30);
		add(label1);
		label2 = new JLabel("Etiqueta dos");
		label2.setBounds(10,40,100,30);
		add(label2);
		label3 = new JLabel("Etiqueta tres");
		label3.setBounds(10,80,100,30);
		add(label3);
 }
 
	public static void main(String[] args){
		Etiquetas_col form1 = new Etiquetas_col();
		form1.setBounds(0,0,300,330);
		form1.setVisible(true);
		form1.setTitle("Etiquetas de colores");
		form1.setDefaultCloseOperation(form1.EXIT_ON_CLOSE);
	}
}