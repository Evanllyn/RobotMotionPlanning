package data;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Aleksandra
 */
public class FreeSpace {
    private Point freeLeftTop;
    private Point freeLeftBot;
    private Point freeRightTop;
    private Point freeRightBot;
    private Point freeCenter;

    public FreeSpace(Point freeLeftTop, Point freeLeftBot, Point freeRightTop, Point freeRightBot, Point freeCenter) {
        this.freeLeftTop = freeLeftTop;
        this.freeLeftBot = freeLeftBot;
        this.freeRightTop = freeRightTop;
        this.freeRightBot = freeRightBot;
        this.freeCenter = freeCenter;
    }

    public Point getFreeLeftTop() {
        return freeLeftTop;
    }

    public void setFreeLeftTop(Point freeLeftTop) {
        this.freeLeftTop = freeLeftTop;
    }

    public Point getFreeLeftBot() {
        return freeLeftBot;
    }

    public void setFreeLeftBot(Point freeLeftBot) {
        this.freeLeftBot = freeLeftBot;
    }

    public Point getFreeRightTop() {
        return freeRightTop;
    }

    public void setFreeRightTop(Point freeRighttTop) {
        this.freeRightTop = freeRighttTop;
    }

    public Point getFreeRightBot() {
        return freeRightBot;
    }

    public void setFreeRightBot(Point freeRightBot) {
        this.freeRightBot = freeRightBot;
    }
    public Point getFreeCenter() {
        this.freeCenter.x = (freeLeftTop.getX() + freeRightTop.getX()) / 2;
        this.freeCenter.y = (freeLeftTop.getY() + freeLeftBot.getY()) / 2;
        return freeCenter;
    }

    public void setFreeCenter(Point freeCenter) {
        freeCenter.x = (freeLeftTop.getX() + freeRightTop.getX()) / 2;
        freeCenter.y = (freeLeftTop.getY() + freeRightTop.getY()) / 2;
        this.freeCenter = freeCenter;
    }

    
    public void drawCenter(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval((int)this.freeCenter.getX(), (int)this.freeCenter.getY(), 3, 3);
    }

    public void drawFreeDotLT(Robot r, Point test, Graphics g) {
        Point x = r.getSrodek();
        test.x = freeLeftTop.getX() + x.getX();
        test.y = freeLeftTop.getY() + x.getY();
        
        g.drawOval((int)test.x, (int)test.y, 3, 3);
    }
    public void drawFreeDotLB(Robot r,Point test, Graphics g) {
        Point x = r.getSrodek();
        test.x = freeLeftBot.getX() + x.getX();
        test.y = freeLeftBot.getY() - x.getY();
        
        g.drawOval((int)test.x, (int)test.y, 3, 3);
    }
    public void drawFreeDotRT(Robot r, Point test, Graphics g) {
        Point x = r.getSrodek();
        test.x = freeRightTop.getX() - x.getX();
        test.y = freeRightTop.getY() + x.getY();
        
        g.drawOval((int)test.x, (int)test.y, 3, 3);
    }
    public void drawFreeDotRB(Robot r, Point test, Graphics g) {
        Point x = r.getSrodek();
        test.x = freeRightBot.getX() - x.getX();
        test.y = freeRightBot.getY() - x.getY();
        
        g.drawOval((int)test.x, (int)test.y, 3, 3);
    }
    public Point FreeDotLT(Robot r, Point test) {
        Point x = r.getSrodek();
        test.x = freeLeftTop.getX() + x.getX();
        test.y = freeLeftTop.getY() + x.getY();
        
        return test;
    }
    public Point FreeDotLB(Robot r,Point test) {
        Point x = r.getSrodek();
        test.x = freeLeftBot.getX() + x.getX();
        test.y = freeLeftBot.getY() - x.getY();
        
        return test;
    }
    public Point FreeDotRT(Robot r, Point test) {
        Point x = r.getSrodek();
        test.x = freeRightTop.getX() - x.getX();
        test.y = freeRightTop.getY() + x.getY();
        
        return test;
    }
    public Point FreeDotRB(Robot r, Point test) {
        Point x = r.getSrodek();
        test.x = freeRightBot.getX() - x.getX();
        test.y = freeRightBot.getY() - x.getY();
        
        return test;
    }
    
    public Point CenterTopLeft(Robot r, Point test){
        Point x = r.getSrodek();
        
        return test;
    }
}
