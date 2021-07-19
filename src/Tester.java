import javax.swing.*;

public class Tester{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        StretchLine lineP = new StretchLine();
        frame.add(lineP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


