//acceso grafico java
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.ImageIcon;
public class AbrirImage extends JFrame implements ActionListener{
	private JLabel label1;
	private JButton boton1;
	private JFileChooser file;
	FileNameExtensionFilter filtro;
	public AbrirImage(){
		setLayout(null);
		label1 = new JLabel();
		label1.setBounds(10,10,300,300);
		add(label1);
		boton1 = new JButton("Abrir imagen");
		boton1.setBounds(230,10,120,30);
		add(boton1);
		boton1.addActionListener(this);
		file = new JFileChooser();
		filtro = new FileNameExtensionFilter("JPG","jpg","PNG","png","gif");
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			file.setFileFilter(filtro);
			
			int seleccion = file.showSaveDialog(file);
			if(seleccion == JFileChooser.APPROVE_OPTION){
				File fichero = file.getSelectedFile();
				ImageIcon icono = new ImageIcon(fichero.getPath());
				label1.setIcon(icono);
			}
		}
	}
	public static void main(String[] args){
		AbrirImage form =new AbrirImage();
		form.setBounds(0,0,500,400);
		form.setTitle("Abrir imagen");
		form.setVisible(true);
		form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
	}
}