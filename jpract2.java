import java.awt.*;
import java.awt.event.*;
class jpract2   extends Frame 
{
	List l1;
	Choice ch;
	Label l11,l22;
	jpract2 ()
	{
		FlowLayout f1= new FlowLayout();
		setLayout(f1);
		 l11= new Label("choice ..");
		ch=new Choice();
		ch.add("The hindu");
		ch.add("Indian Express");
		ch.add("Sakal");
	
		l22= new Label("list ur sub");
		l1=new List();
		l1.add("India");
		l1.add("China");
		l1.add("Brazil");
		l1.add("Canada");
		l1.add("UK");
		l1.add("Argentina");
		l1.add("Australia");
		l1.add("Brazil");
		l1.add("Canada");
		l1.add("UK");
		
		add(l11);
		add(ch);
	//	add(l22);
		//add(l1);
		
		
		
		
	} 
 public static void main (String args[])
 {
       jpract2  f1 = new  jpract2 ();
       f1.setVisible(true);
       f1.setSize(600,350);
       f1.setTitle("A@llu"); 
 }
 
}