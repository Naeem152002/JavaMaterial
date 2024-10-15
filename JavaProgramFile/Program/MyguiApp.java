import java.awt.*;
class MyguiApp
{

public static void main(String ss[])
{
Frame f=new Frame("Mygui App");
f.setLayout(new FlowLayout());
f.setBackground(Color.yellow);
f.setSize(400,400);

Button b=new Button("Add");
f.add(b);

f.setVisible(true);



}


}