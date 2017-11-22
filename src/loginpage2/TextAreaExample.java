package loginpage2;
import javax.swing.*;  
import java.awt.event.*;  
public class TextAreaExample implements ActionListener{  
	JLabel l,l1,l2;  
	JTextArea area;  
	JButton b;
	JFrame f= new JFrame();
	TextAreaExample() {  
	     
	    l=new JLabel("FEEDBACK BOX");
	    l.setBounds(50,-10,120,120);
	    l1=new JLabel();  
	    l1.setBounds(50,25,100,30);  
	    l2=new JLabel();  
	    l2.setBounds(160,25,100,30);  
	    area=new JTextArea();  
	    area.setBounds(20,75,250,200);  
	    b=new JButton("Submit");  
	    b.setBounds(100,300,120,30);  
	    b.addActionListener(this);  
	    f.add(l1);f.add(l2);f.add(area);f.add(b); f.add(l);
	    f.setSize(450,450);  
	    f.setLayout(null);  
	     f.setVisible(true);
	     
	}  
	public void actionPerformed(ActionEvent e){  
	    if(e.getSource()==b)
	    {
	    	JOptionPane.showMessageDialog(f, "Feedback Has been stored" );
	    }
	      
	    
	}  
	public static void main(String[] args) {  
	    new TextAreaExample();  
	}  
	}


