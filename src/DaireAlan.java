import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args){

        int r ;
        double pi =3.14;
        double a,c;

        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r=inp.nextInt();

        a=pi*r*r;
        System.out.println("Dairenin alanı : "+a);
        c=2*pi*r;
        System.out.println("Dairenin çevresi : "+c);



    }
}
