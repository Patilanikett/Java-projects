import java.awt.*;
class demo extends frame 
{
demo()
{
Label L1=new Label("login");
Label L2=new Label("name");
Label L3=new Label("contact no");
add(L1);
add(L2);
add(L3);
Textfield T1=new Textfield();
add(T1);
Textfield T2=new Textfield();
add(T2);
Button B1=new Button("login");
add(B1);
Button B2=new Button("reset");
add(B2);
l1.setbounds(100,30,70,30);
l2.setbounds(20,70,50,20);
l3.setbounds(20,100,50,20);
T1.setbounds(80,70,50,20);
T2.setbounds(80,100,50,20);
B1.setbounds(20,130,50,20);
B2.setbounds(80,130,50,20);
setLayout(null);
setTitle("java");
setSize(600,600);
setVisible(True);
}
public static void main(strin args[]) 
{
demo d1=new demo();
}
}