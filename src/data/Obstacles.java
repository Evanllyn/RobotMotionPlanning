package data;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Aleksandra
 */
public class Obstacles {
    private Point Top;
    private Point Bottom;

    public Obstacles(Point Top, Point Bottom) {
        this.Top = Top;
        this.Bottom = Bottom;
    }

    public Point getTop() {
        return Top;
    }

    public void setTop(Point Top) {
        this.Top = Top;
    }

    public Point getBottom() {
        return Bottom;
    }

    public void setBottom(Point Bottom) {
        this.Bottom = Bottom;
    }
    
    public void draw (Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine((int)Bottom.getX(), (int)Bottom.getY(), (int)Top.getX(), (int)Top.getY());
    }
}
