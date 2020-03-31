public class Zadanie4 {
    int x1=1,x2=2;
    Integer y1=3,y2=4;


    static void zamianaInt(int x,int y) {
        int z = x;
        x = y;
        y = z;
    }
    static void zamianaInteger(Integer x,Integer y) {
        Integer z = x;
        x = y;
        y = z;
    }

    static void zamianaTablica(int[] tab1,int[] tab2) {
        System.out.println("tab1[0]:"+tab1[0]);
        System.out.println("tab2[0]:"+tab2[0]);
        System.out.println("tab2[0] hash:"+tab2.hashCode());

        int []tab = tab1;
        tab1 = tab2;
        tab2 = tab;

//        System.out.println("tab1[0]:"+tab1[0]);
//        System.out.println("tab2[0]:"+tab2[0]);

    }


    Zadanie4() {
        int i1 = 1;
        int i2 = 2;
        System.out.println("i1="+i1+" i2="+i2);
        zamianaInt(i1,i2);
        System.out.println("zamianaInt: i1="+i1+" i2="+i2);

        Integer j1 = 3;
        Integer j2 = 4;
        System.out.println("j1="+j1+" j2="+j2);
        zamianaInteger(j1,j2);
        System.out.println("zamianaInteger: j1="+j1+" j2="+j2);

/*------------------------------------------*/

        System.out.println("x1="+x1+" x2="+x2);
        zamianaInt(x1,x2);
        System.out.println("zamianaInt: x1="+x1+" x2="+x2);

        System.out.println("y1="+y1+" y2="+y2);
        zamianaInteger(y1,y2);
        System.out.println("zamianaInteger: y1="+y1+" y2="+y2);

        int[] t1 = new int[]{1,2,3};
        int[] t2 = new int[]{2,3,4};

        System.out.println("t1: "+t1 + " "+t1[0]);
        System.out.println("t2: "+t2 + " "+t2[0]);


        zamianaTablica(t1,t2);

        System.out.println("t1: "+t1 + " "+t1[0]);
        System.out.println("t2: "+t2 + " "+t2[0]);


    }
}
