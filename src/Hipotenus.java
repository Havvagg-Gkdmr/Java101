import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a,b ;
        double d;
        double s;
        double c ;
        Scanner inp =new Scanner(System.in);
        System.out.print("A kenarının uzunluğunu giriniz : " );
        a=inp.nextInt();
        System.out.print("B kenarının uzunluğunu giriniz : ");
        b=inp.nextInt();
        d=Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " +d);

        s=((a * b) /2.0);
        System.out.println("Üçgenin alanı :" +s);

        c=a+b+d;
        System.out.print("Üçgenin çevresi : " +c);

    }
}
