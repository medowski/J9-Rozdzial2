class Point6 {
    private float x;
    private float y;

    public Point6(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point6() {
        this.x = 0;
        this.y = 0;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    void translate(int x1, int y1) {
        this.x += x1;
        this.y += y1;
    }

    void scale(float współczynnik) {
        this.x *= współczynnik;
        this.y *= współczynnik;
    }
    public String toString() {
        return "x="+this.x+" y="+this.y;
    }
}
public class Zadanie6 {
    Zadanie6() {
        System.out.println("ZADANIE 6");
        Point6 p = new Point6(3, 4);
        p.translate(1, 3);
        p.scale(0.5f);

        System.out.println(p);
        p.scale(2);
        System.out.println(p);
        p.translate(5,5);
        System.out.println(p);
    }
}



