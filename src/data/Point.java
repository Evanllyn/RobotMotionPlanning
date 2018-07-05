package data;

/**
 *
 * @author Aleksandra
 */
public class Point {
    float x;
    float y;
    int id;

    public Point(){
        
    }
    
    public Point(float x, float y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
