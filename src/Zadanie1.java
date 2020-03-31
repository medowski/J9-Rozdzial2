import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Zadanie1 {
    private LocalDate data;
    private LocalDate data1;
    private int pierwszyDzienMiesiaca;
    private final int monthLength;

    Zadanie1() {
        data = LocalDate.now();
        monthLength = data.lengthOfMonth();
        LocalDate data1 = LocalDate.of(data.getYear(),data.getMonthValue(),1);

        System.out.println("Data: "+data);
        System.out.println("Pierwszy dzien miesiąca to: "+data1.getDayOfWeek());

        pierwszyDzienMiesiaca = data1.getDayOfWeek().getValue()%7;
    }

    public void displayCalendar() {
        String s0 = " --------------------";
        String s1 = "";

        System.out.println(s0);
        System.out.println(" NI Po Wt Sr Cz Pi So");
        System.out.println(s0);

        for (int i = 0; i < pierwszyDzienMiesiaca; i++) {
            System.out.print("   ");
        }
        for (int i=0;i<monthLength;i++) {
            if (((i+pierwszyDzienMiesiaca)%7==0)&&(i!=0)) System.out.println();
                System.out.printf(" %1$2d",i+1);
        }
        System.out.println("\n"+s0);
    }
}
