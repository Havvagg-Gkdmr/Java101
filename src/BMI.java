import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {

        int kilo;
        double boy,bmi;



        Scanner inp =new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : " );
        kilo=inp.nextInt();
        bmi=kilo/(boy*boy);
        System.out.print("Vücut kitle endeksiniz : " +bmi);


    }
}
