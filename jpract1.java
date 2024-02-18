import java.awt.*;
import java.awt.event.*;
class jpract1   extends Frame 
{
	Label l1,l2,l3;
	Button b1;
	TextField t1;
	Checkbox c1,c2;
	Checkbox c11,c22;
	Choice ca;
	TextArea ta;
	CheckboxGroup cbg=new  CheckboxGroup();
	jpract1 ()
	{
		FlowLayout f1= new FlowLayout();
		setLayout(f1);
		setBackground(Color.cyan);	
		b1 =new Button ("Button ");
		l1 =new Label ("Label");
		l2=new Label("Select lang ");
	    Checkbox c1= new Checkbox("radio",false,cbg);
		Checkbox c2=new Checkbox("Marathi",false,cbg);
		l3=new Label("Select lang ");
		c11= new Checkbox("java");
	    c22=new Checkbox("php");
		t1=new TextField("hi i am textfield..");
		ta=new TextArea("hii write here... ",15,19);
		
		ta=new TextArea(10,10);
		/*	
		b1.setBounds(380,90,120,30);
		l1.setBounds(30,100,150,30);	
		t1.setBounds(190,100,110,30);
		c1.setBounds(30,70,110,30);
		c2.setBounds(30,70,150,90);
        ta.setBounds(150,180,140,90);		*/
		
        			
		
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		add(c1);
		add(c2);
		add(ta);
		add(l3);
		add(c11);
		add(c22);
		
	} 
 public static void main (String args[])
 {
       jpract1  f1 = new  jpract1 ();
       f1.setVisible(true);
       f1.setSize(600,350);
       f1.setTitle("A@llu "); 
 }
 
}