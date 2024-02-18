import java.awt.*;
import java.awt.event.*;
class jpract3  extends Frame 
{
	
	jpract3()
	{
		BorderLayout f1= new BorderLayout();
		setLayout(f1);
		Button b1= new Button("EAST region");
		Button b2= new Button("WEST region");
		Button b3= new Button("NORTH region");
		Button b4= new Button("SOUTH region");
		Button b5= new Button("CENTER region");
		
	     add(b1 ,BorderLayout.NORTH);
		 add(b2 ,BorderLayout.EAST);
		 add(b3 ,BorderLayout.WEST);
		 add(b4 ,BorderLayout.SOUTH);
		 add(b5 ,BorderLayout.CENTER);
	} 
 public static void main (String args[])
 {
       jpract3 f1 = new  jpract3();
       f1.setVisible(true);
       f1.setSize(600,350);
       f1.setTitle("A@llu"); 
 }
 
}