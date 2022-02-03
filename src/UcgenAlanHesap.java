import java.util.Scanner;

public class UcgenAlanHesap {
    public static void main(String[] args) {
        double a,b,c,u,sonuc,alan;
        Scanner input=new Scanner(System.in);
        System.out.println("Ucgenin 1. kenarinin uzunlugunu giriniz : ");
        a=input.nextDouble();
        System.out.println("Ucgenin 2. kenarinin uzunlugunu giriniz : ");
        b=input.nextDouble();
        System.out.println("Ucgenin 3. kenarinin uzunlugunu giriniz : ");
        c=input.nextDouble();

        //Alan Hesabi

        u= (a+b+c)/2;
        sonuc=(u*(u-a)*(u-b)*(u-c));
        alan= Math.pow(sonuc,0.5);
        System.out.println("Ucgen alani : " +alan );
    }
}
