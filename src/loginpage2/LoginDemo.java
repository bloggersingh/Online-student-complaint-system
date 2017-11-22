package loginpage2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class Login extends JFrame implements ActionListener
{
 JButton SUBMIT;
 JPanel panel;
 JLabel label1,label2;
 final JTextField  text1,text2;
 
 
  Login()
  {

		 
		
	  
  label1 = new JLabel();
  label1.setText("Username:");
  label1.setBounds(100,100,100,100);
  text1 = new JTextField();
  text1.setBounds(100,100,100,100);

  label2 = new JLabel();
  label2.setText("Password:");
  text2 = new JPasswordField(15);
 
  SUBMIT=new JButton("SUBMIT");
  
String[] sections= {"Academics","Department","Living expenditure","Franchise"};
		JComboBox bc=new JComboBox(sections); 
		bc.setBounds(100,100,100,100);
  
  panel=new JPanel(new GridLayout(3,1));
  panel.add(label1);
  panel.add(text1);
  panel.add(label2);
  panel.add(text2);
  panel.add(SUBMIT);
  panel.add(bc);
  add(panel,BorderLayout.CENTER);
  SUBMIT.addActionListener(this);
  SUBMIT.setActionCommand("a");
  setTitle("LOGIN FORM");
  }
 public void actionPerformed(ActionEvent ae)
  {
 if(ae.getActionCommand()=="a")
 {
	 new TextAreaExample();
 }
 
}
}
 class LoginDemo
{
  public static void main(String arg[])
  {
  try
  {
  Login frame=new Login();
  frame.setSize(500,500);
  frame.setVisible(true);
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}
