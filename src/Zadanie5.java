class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    Point translate(int x1, int y1) {
//        Point pTranslate = new Point(this.x+x1,this.y+y1);
        return new Point(this.x+x1,this.y+y1);
//        return Point(this.x+x1,this.y+y1);

    }

    Point scale(float współczynnik) {
//            this.x /= współczynnik;
//            this.y /= współczynnik;
        return new Point(this.x*współczynnik,this.y*współczynnik);
    }
    public String toString() {
        return "x="+this.x+" y="+this.y;
    }
}
public class Zadanie5 {
    Zadanie5() {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5f);
        System.out.println(p);
        p.scale(2);
        System.out.println(p);
        p.translate(5,5);
        System.out.println(p);
    }
}



