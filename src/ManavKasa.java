import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double kg,tutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        kg=inp.nextDouble();
        armut*=kg;
        System.out.print("Elma kaç kilo ? :");
        kg=inp.nextDouble();
        elma*=kg;
        System.out.print("Domates kaç kilo ? :");
        kg=inp.nextDouble();
        domates*=kg;
        System.out.print("Muz kaç kilo ? :");
        kg=inp.nextDouble();
        muz*=kg;
        System.out.print("Patlıcan kaç kilo ? :");
        kg=inp.nextDouble();
        patlican*=kg;

        tutar=armut+elma+domates+muz+patlican;

        System.out.println("Toplam tutar? :" +tutar);
    }

}
