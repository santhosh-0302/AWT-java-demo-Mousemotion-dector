

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code =mouse java width=500 height=500>
 </applet > */
public class mouse extends Applet implements MouseMotionListener,MouseListener
{
    String m;
    public void init()
    {
        addMouseMotionListener(this);
        addMouseMotionListener(this);
        m=" ";

    }
    public void paint(Graphics g)
    {
        g.drawString(m,100,100);
    }
    public void mouseDragged(MouseEvent me)
    {
        m="MouseDragged";
        repaint();
    }
    public void mouseMoved(MouseEvent me)
    {
        Point p=me.getPoint();
        showStatus("Mouse : "+p.toString());
    }
    public void mouseEntered(MouseEvent me)
    {
        m="MouseEntered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        m="MouseExited";
        repaint();
    }
    public void mouseClicked(MouseEvent me)
    {
        m="MouseClicked";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    {
        m="MousePressed";
        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        m="Mousereleased";
        repaint();
    }
}