// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        KDV Tutarı Hesaplayan Program
            Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
            programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
            Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
            KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        // 1. Aşama Kullanıcıdan değer al. Scanner kütüphanesi ekle.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Para Miktarını yazınız :");
        int para = input.nextInt();

        // 2. Aşama Hesaplama KDV'li fiyat :
        // KDV Oranı : 18%.
        double KDVOran = 0.18;
        double KDVFiyat = para + (para*KDVOran);
        double KDVTutarı = para*KDVOran;

        System.out.println("KDV'siz Fiyat : " + para);
        System.out.println("KDV'li Fiyat : " + KDVFiyat);
        System.out.println("KDV Tutarı : " + KDVTutarı);


        // Ödev Çözüm

        double KDVOranı2 = 0.08;
        KDVFiyat = para>0 && para<=1000 ? (KDVOran*para)+para : (KDVOranı2*para)+para;
        System.out.println("KDV'li Fiyatı : " + KDVFiyat);

        // IF ELSE Kullanarak.

        if (para>0 && para<=100){
            KDVFiyat = para + (KDVOran*para);
            System.out.println("KDV'li Fiyatı : " + KDVFiyat);
        }else if (para > 1000){
            KDVFiyat = para + (KDVOranı2*para);
            System.out.println("KDV'li Fiyatı : " + KDVFiyat);
        }else {
            System.out.println("Lütfen Geçerli Bir Para Birimi Giriniz");
        }

    }
}