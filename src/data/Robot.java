package data;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Aleksandra
 */
public class Robot {
private Point lt;
    private Point lb;
    private Point rt;
    private Point rb;
    private Point center;
    private double angle;

    public Robot(Point lt, Point lb, Point rt, Point rb, Point srodek, double angle) {
        this.lt = lt;
        this.lb = lb;
        this.rt = rt;
        this.rb = rb;
        this.center = srodek;
        this.angle = angle;
    }

    public Point getLt() {
        return lt;
    }

    public void setLt(Point lt) {
        this.lt = lt;
    }

    public Point getLb() {
        return lb;
    }

    public void setLb(Point lb) {
        this.lb = lb;
    }

    public Point getRt() {
        return rt;
    }

    public void setRt(Point rt) {
        this.rt = rt;
    }

    public Point getRb() {
        return rb;
    }

    public void setRb(Point rb) {
        this.rb = rb;
    }

    public Point getSrodek() {
        center.x = lt.getX()+rt.getX() / 2;
        center.y = lt.getY() + lb.getY() / 2;
        return center;
    }

    public void setSrodek(Point srodek) {
        center.x = lt.getX()+rt.getX() / 2;
        center.y = lt.getY() + lb.getY() / 2;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    
    
    public Point liczSrodek(){
        center.x = lt.getX()+rt.getX() / 2;
        center.y = lt.getY() + lb.getY() / 2;
        return center;
    }
    
    public void draw(Graphics gphx){
       gphx.drawLine((int)lt.getX(), (int)lt.getY(), (int)rt.getX(), (int)rt.getY());   //gorna
       gphx.drawLine((int)rt.getX(), (int)rt.getY(), (int)rb.getX(), (int)rb.getY());   //prawa
       gphx.drawLine((int)rb.getX(), (int)rb.getY(), (int)lb.getX(), (int)lb.getY());   //dolna
       gphx.drawLine((int)lb.getX(), (int)lb.getY(), (int)lt.getX(), (int)lt.getY());   //lewa
    }
    
    public void drawSrodek(Graphics gphx){
        gphx.setColor(Color.red);
        gphx.drawOval((int)center.getX(), (int)center.getY(), 1, 1);
    }
    
    public void setSrodekRobota(Point robotCenter) {
        //obliczanie przesunięcia wzgledem nowego srodka
        float pX = robotCenter.getX() - this.center.getX();
        float pY = robotCenter.getY() - this.center.getY();

        lt.setX(lt.getX() + pX);
        lt.setY(lt.getY() + pY);
        
        lb.setX(lb.getX() + pX);
        lb.setY(lb.getY() + pY);
        
        rt.setX(rt.getX() + pX);
        rt.setY(rt.getY() + pY);
        
        rb.setX(rb.getX() + pX);
        rb.setY(rb.getY() + pY);

        this.center = robotCenter;

    }
}
