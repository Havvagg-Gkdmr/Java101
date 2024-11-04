import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        //Kullanıcıdan alınan para değerinin KDV'li fiyatını ve Kdv Tutarını hesaplayıp ekrana bastır.

        double fiyat,kdvlifiyat,kdv =0.18;
        Scanner inp =new Scanner(System.in);
        System.out.print("Ürünün Fiyatını Giriniz :");
        fiyat=inp.nextDouble();
        System.out.println("Kdv Hariç Tutar :" +fiyat);
        System.out.println("Kdv Oranı :" +kdv);
        double kdvtutari= fiyat*kdv;
        System.out.println("Kdv Tutarı : "+kdvtutari);
        kdvlifiyat=fiyat+kdvtutari;
        System.out.println("KDV Dahil Fiyat :"+kdvlifiyat);


    }
}
