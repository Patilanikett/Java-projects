import java.applet.*;  
import java.awt.*;  
public class First extends Applet{ 
Frame F; 
public void init()
{
F=new Frame();
Label l1=new Label("Hello World");
F.add(l1);
l1.setBounds(50,60,80,60);
F.setSize(500,600);

F.setLayout(null);
F.setVisible(true);
//System.out.print("Hello World");

}
 
  
}
//<applet code="First.class" width=500 height=500></applet>