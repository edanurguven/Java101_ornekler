import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double toplam,armutT,elmaT,domatesT,muzT,patlicanT, armut = 2.14,
        elma = 3.67 ,
        domates = 1.11 ,
        muz= 0.95 ,
        patlican = 5.00 ;

        Scanner input =new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : " );
        armutT=input.nextDouble();
        System.out.print("Elma Kaç Kilo? : " );
        elmaT=input.nextDouble();
        System.out.print("Domates Kaç Kilo? : " );
        domatesT=input.nextDouble();
        System.out.print("Muz Kaç Kilo? : " );
        muzT=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? : " );
        patlicanT=input.nextDouble();

        toplam=(armut*armutT)+(elma*elmaT)+(domates*domatesT)+(muz*muzT)+(patlican*patlicanT);
        System.out.print("Toplam Tutar : "+toplam+" TL");
    }
}
