package loginpage2;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

 
public class CreateCheckbox implements ActionListener  {
	
	CreateCheckbox(){
	
	JFrame f;
	JTextArea aa = null;
	
		f=new JFrame("Feedback");
		//String[] sections= {"Academics","Department","Living expenditure","Franchise"};
		//JComboBox bc=new JComboBox(sections); 
		//bc.setBounds(100,100,100,100);
		//f.add();
	
	JButton b=new JButton("Done");
	f.add(b);
	f.add(aa);
	b.addActionListener( this);
	//b.setActionCommand("z");
	
	
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	
	 /*b.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 String data = "Section selected" +bc.getItemAt(bc.getSelectedIndex());
		 }
	 });*/
		//b.addActionListener((ActionListener) this); 
	
	             
	
	
	               
	               
	  }
	public static void main(String args[])
	{
		CreateCheckbox bb=new CreateCheckbox();
	}
	public void actionPerformed(ActionEvent e) {
		
		/*if(e.getActionCommand()=="z")
		{
			new TextArea();
		}*/
	}
	}


