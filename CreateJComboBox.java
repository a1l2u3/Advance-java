/*  Write a program using swing to display a 
ScrollPane and JComboBox in an JApplet with 
the items – English, Marathi, Hindi, Sanskrit.*/

import java.awt.*;
import java.applet.*;
import javax.swing.*;
/*<applet code ="CreateJCombobox" width=500 height=500>
</applet>*/
public class CreateJCombobox extends Applet{
	public void init(){
		Choice ch=new Choice();
		ch.add("Marathi");
		ch.add("english");
		ch.add("hindi");
		ch.add("sanskrit");
		add(ch);
		ch.setVisible(true);
	}
}
