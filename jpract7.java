
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.*;
class jpract7   extends JFrame 
{
	
	
	jpract7 ()
	{
	DefaultMutableTreeNode style =new DefaultMutableTreeNode("style");
	DefaultMutableTreeNode color =new DefaultMutableTreeNode("color");
	DefaultMutableTreeNode font =new DefaultMutableTreeNode("style");
	
	style.add(color);
	style.add(font);
	
	DefaultMutableTreeNode red =new DefaultMutableTreeNode("style");
	DefaultMutableTreeNode blue =new DefaultMutableTreeNode("color");
	DefaultMutableTreeNode green =new DefaultMutableTreeNode("style");
	color.add(red);
	color.add(blue);
	color.add(green);
	DefaultMutableTreeNode r=new DefaultMutableTreeNode("style");
	DefaultMutableTreeNode b =new DefaultMutableTreeNode("color");
	DefaultMutableTreeNode g=new DefaultMutableTreeNode("style");
	red.add(r);
	red.add(b);
	red.add(g);
	
	JTree jt=new JTree(style);
	add(jt);
	} 
 public static void main (String args[])
 {
       jpract7  f1 = new  jpract7 ();
       f1.setVisible(true);
       f1.setSize(600,350);
       f1.setTitle("A@llu"); 
 }
 
}