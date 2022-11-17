package Test;

public class Rectangle {
    public Point p;
    public Point q;

    public Rectangle(Point p, Point q){
        //Check om p er øverst til venstre og q er nederst til højre
        if (p.x > q.x && p.y < q.y){
            throw new IllegalArgumentException();
        } 
        this.p = p;
        this.q = q;
    }


    public String where(int x, int y){
        if (x == p.x || y == p.y || x == q.x || y == q.y) return "Border";
        else if (p.x > x || q.x < x || p.y < y || q.y > y ) return "Outside";
        else return "inside";
    }
}
