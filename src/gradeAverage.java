import java.util.Scanner;
public class gradeAverage {
    public static void main(String[] args) {
        //Java ile Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
        //ortalamalarını hesaplayıp ekrana bastıran program
        //Aynı program içerisinde koşullu ifadeler kullanılarak,eğer kullanıcının ortalaması 60'dan büyük ise ekrana
        // "Sınıfı Geçti" , küçük ise " Sınıfta kaldı." yazsın.

        // Değişken tanımlama

        int mat,fizik,kimya,turkce,tarih,muzik ;

        // kullanıcıdan veri alma methodunu ekle import java.util.Scanner;

        //Scanner sınıfını tanımla
        Scanner inp =new Scanner(System.in);

        // Kullanıcıdan değerleri girmesini iste.
        System.out.print("Matematik Notunuzu Giriniz :");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz :");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz :");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz :");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz :");
        muzik= inp.nextInt();

        // Sonuç hesaplama

        double toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam/6;

        System.out.println("Not Ortalamanız : "+ortalama);

        //kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        // küçük ise " Sınıfta kaldı." yazsın.



        boolean gecti = ortalama>=60;
        boolean kaldi = ortalama< 60;
        boolean ort = gecti||kaldi;

        String str =ort ? "Sınıfı Geçti" : "Sınıfta Kaldı.";

        System.out.println("Geçme Durumu :"+str);

    }
}
