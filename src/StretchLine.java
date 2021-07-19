import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class StretchLine extends JPanel {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private boolean mousePressed =  false;

    public StretchLine(){
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                x1 = e.getX();
                y1 = e.getY();
                repaint();
            }
        });

        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                x1 = e.getX();
                x2 =x1;
                y1 = e.getY();
                y2 = y1;
                repaint();
            }
        }
        );

    }



    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(x1,y1,x2,y2);

    }
}