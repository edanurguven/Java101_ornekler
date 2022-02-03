import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double deger,kdvDeger,kdvTutar;
        Scanner input= new Scanner(System.in);
        System.out.println("KDV'siz fiyatınızı girin : ");
        deger=input.nextDouble();
        if(1000>deger){
            kdvTutar=(deger*18)/100;
            kdvDeger=deger+kdvTutar;
        }
        else{
            kdvTutar=(deger*8)/100;
            kdvDeger=deger+kdvTutar;
        }
        System.out.println("KDV'siz fiyat : "+deger+
                           "\nKDV tutari : "+kdvTutar+"" +
                           "\nKDV'li fiyat : "+kdvDeger);
    }
}
