public class Zadanie8 {
    int i,j,z;
//    Integer i,j,z;
    Zadanie8(int i) {
        this.i = i;
    }
    Zadanie8(int i, int j) {
        this.i = i;
        this.j = j;
    }
    Zadanie8(int i, int j, int z) {
        this.i = i;
        this.j = j;
        this.z = z;
    }
    static void display(Zadanie8 z) {
        System.out.println("Wynik: "+z.i+" "+z.j+" "+z.z);
    }

    public static void main(String[] args) {
        Zadanie8 z1 = new Zadanie8(1);
        Zadanie8 z2 = new Zadanie8(1,2);
        Zadanie8 z3 = new Zadanie8(1,2,3);

///        z1.display();
        Zadanie8.display(z1);
        Zadanie8.display(z2);
        Zadanie8.display(z3);
//        display(z2);
    }

}
