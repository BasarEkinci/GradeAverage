 import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
       


        //Variables
        double tutar , kdvOran = 0.18 , kdvTutar , kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün ücretini giriniz : ");
        tutar = input.nextDouble();
        
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz fiyat :" + tutar);
        System.out.println("KDV Tutari    :" + kdvTutar + " ( %" + kdvOran*100 + " )"); 
        // "*100" yüzdelik oran olarak göstermek için
        System.out.println("KDV'li Tutari :" + kdvliTutar);

        input.close();
    

    }
}
