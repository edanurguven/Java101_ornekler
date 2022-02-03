import java.util.Scanner;

public class IndeksHesap {
    public static void main(String[] args) {
        double boy,kilo,sonuc;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=input.nextDouble();
        sonuc=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz : "+sonuc);
    }
}
