import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args){

        int r ,aci;
        double pi =3.14;
        double alan,cevre,dAlan;

        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r=inp.nextInt();

        alan=pi*r*r;
        System.out.println("Dairenin alanı : "+alan);
        cevre=2*pi*r;
        System.out.println("Dairenin çevresi : "+cevre);
        System.out.print("Merkez açının ölçüsünü giriniz : ");
        aci=inp.nextInt();
        dAlan=(pi*(r*r)*aci)/360;
        System.out.println("Daire diliminin alanı : "+dAlan);



    }
}
