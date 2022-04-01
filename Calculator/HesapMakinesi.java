package Calculator;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1,n2,sonuc;
        int islem;
        boolean x1 = true;
        while(x1){
        System.out.println("Yapmak istediğiniz islemi secin :\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Ussunu Alma\n0-Cikis");
        islem = input.nextInt();
        if(islem == 0){
            x1 = false;
            break;       
        }
        System.out.println("2 adet sayi giriniz : ");
        n1 = input.nextFloat();
        n2 = input.nextFloat();


        if(islem == 1){
            sonuc = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + sonuc);
        }else if(islem ==2){
            sonuc = n1 - n2;
            System.out.println(n1 + " + " + n2 + " = " + sonuc);
        }else if(islem == 3){
            sonuc = n1*n2;
            System.out.println(n1 + " x " + n2 + " = " + sonuc);
        }else if(islem == 4){
            sonuc = n1/n2;
            System.out.println(n1 + " / " + n2 + " = " + sonuc);
        }else if(islem == 5){
            sonuc = Math.pow(n1, n2);
            System.out.println(n1 + " ^ " + n2 + " = " + sonuc);
        }
        
        
    }
        input.close();
        
    }
}
