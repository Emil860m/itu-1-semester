package Test;

public class Demo {
    public static void main(String[] args) {
        Point p = new Point(-2, 3);
        Point q = new Point(4, -2);
        Rectangle r = new Rectangle(p,q);
        System.out.println(r.where(1, 3));
    }
}
