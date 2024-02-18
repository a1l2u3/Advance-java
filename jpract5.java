import java.awt.*;
import java.awt.event.*;
class jpract5  extends Frame  
{
	MenuItem m12,m13;
	jpract5()
	{
		MenuBar mbr = new MenuBar();
		
		Menu m1= new Menu("file");
		MenuItem m11= new MenuItem("New");
		MenuItem m12= new MenuItem("Open");
		MenuItem m13= new MenuItem("Save");
		MenuItem m14= new MenuItem("Save as");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		
		Menu m2= new Menu("Edit");
		MenuItem m21= new MenuItem("Cut");
		MenuItem m22= new MenuItem("Copy");
		MenuItem m23= new MenuItem("Past");
		MenuItem m24= new MenuItem("Undo");
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		
		Menu m3= new Menu("Format");
		MenuItem m31= new MenuItem("Word wrap");
		MenuItem m32= new MenuItem("Font");
		m3.add(m31);
		m3.add(m32);
		
		Menu m4= new Menu("View");
		CheckboxMenuItem m41= new CheckboxMenuItem("Zoom");
		CheckboxMenuItem m42= new CheckboxMenuItem("Startbar");
		m4.add(m41);
		m4.add(m42);
		
		Menu m5= new Menu("Help");
		MenuItem m51= new MenuItem("help bar");
		m5.add(m51);

		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		mbr.add(m4);
		mbr.add(m5);
		
		setMenuBar(mbr);
		
	} 
	
 public static void main (String args[])
 {
       jpract5 f1 = new  jpract5();
       f1.setVisible(true);
       f1.setSize(600,350);
       f1.setTitle("A@llu"); 
 }
 
}