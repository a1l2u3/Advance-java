import java.util.*;
import java.awt.*;
import java.awt.event.*;
class jpract4  extends Frame //implements ActionListener
{
	int i;
	jpract4()
	{
		
		
		GridLayout g1=new GridLayout();
		setLayout(g1);
		setFont(new Font("Arial",Font.BOLD,18));
		int i=1;
while(i<=9)
{
add(new Button(""+i));
i++;
}
add(new Button("*"));
add(new Button("0"));
add(new Button("/"));
add(new Button("+"));
add(new Button("-"));
add(new Button("."));

TextArea ta=new TextArea("Result",100,10);
ta.setBounds(0,0,500,50);
ta.setBounds(0,100,500,300);
add(ta);
add(ta);

	}
    public static void main (String args[])
      {
       jpract4 f1 = new  jpract4();
       f1.setVisible(true);
       f1.setSize(600,350);
       f1.setTitle("A@llu"); 
       }
 
}