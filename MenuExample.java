import java.awt.*;
import java.awt.event.*;
class MenuExample extends Frame
{
MenuExample ()
{
Frame f=new Frame("Pathan Aallu");
MenuBar mb=new MenuBar();
f.setMenuBar(mb);
Menu m1=new Menu("File");
Menu m2=new Menu("Edit");
Menu m3=new Menu("View");
Menu submenu=new Menu("more...",true);
MenuItem i1=new MenuItem("New");
MenuItem i2=new MenuItem("Open");
m1.add(i1);
m1.add(i2);
mb.add(m1);
mb.add(m2);
mb.add(m3);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String args[])
{
new MenuExample();
}
}




