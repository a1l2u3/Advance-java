/*  Write a program using swing to display a 
ScrollPane and JComboBox in an JApplet with 
the items – English, Marathi, Hindi, Sanskrit.*/

import javax.swing.*;
import java.awt.event.*;
class jpract6   extends JFrame 
{
	
	
	jpract6 ()
	{
		
	JChoice c1;
	setLayout(new FlowLayout());
	c1=new JChoice();
	c1.add("marathi");
	c1.add ("English");
	c1.add("Hindi");
	c1.add("Sanskrit");
	
	JButton b1=new JButton("OK");
	JButton b2=new JButton("RESET");
	JButton b3=new JButton("CANCEL");
	
	Label l1=new Label("Welcome to java.......");
	//add(l1);
	//add(c1);
	add(b1);
	add(b2);
	add(b3);
	
	
	} 
 public static void main (String args[])
 {
       jpract6  f1 = new  jpract6 ();
       f1.setVisible(true);
       f1.setSize(600,350);
       f1.setTitle("A@llu"); 
 }
 
}