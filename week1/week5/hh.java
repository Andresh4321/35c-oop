package week1.week5;
import java.awt.*;
public class hh{
    hh(){
      
        Frame f=new Frame();
        Choice c=new Choice();
        c.setBounds(40, 40, 40, 40);
        c.add("item1");
        c.add("item2");
        c.add("item3");
        c.add("item4");
        c.setSize(40,40);

        f.setSize(400,400);
        f.add(c);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new hh();
    }
    
}
