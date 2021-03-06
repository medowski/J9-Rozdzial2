class Point5 {
    private float x;
    private float y;

    public Point5(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point5() {
        this.x = 0;
        this.y = 0;
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    Point5 translate(int x1, int y1) {
        return new Point5(this.x+x1,this.y+y1);
    }

    Point5 scale(float współczynnik) {
        return new Point5(this.x*współczynnik,this.y*współczynnik);
    }
    public String toString() {
        return "x="+this.x+" y="+this.y;
    }
}
public class Zadanie5 {
    Zadanie5() {
        System.out.println("ZADANIE 5");

        Point5 p = new Point5(3, 4).translate(1, 3).scale(0.5f);
        System.out.println(p);
        p.scale(2);
        System.out.println(p);
        p.translate(5,5);
        System.out.println(p);
    }
}



