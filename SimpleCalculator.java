import java .awt.*;
import java.applet.*;
/*<applet code="SimpleCalculator" width="500" height="500">
</applet>*/
public class SimpleCalculator extends Applet
{
public void init()
{
GridLayout gl=new GridLayout(4,3);
setLayout(gl);
for(int i=1;i<=9;i++)
{
add(new Button(""+i));
}
Button bt1=new Button("*");
Button bt2=new Button("0");
Button bt3=new Button("#");
add(bt1);
add(bt2);
add(bt3);
}
public static void main(String args[])
{
new SimpleCalculator();
}
}
