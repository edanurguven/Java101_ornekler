import java.util.Scanner;

public class OrtHesap {
    public static void main(String[] args) {
        double mat,turkce,fizik,kimya,tarih,muzik;
        double ort;
        String msg;
        Scanner input=new Scanner(System.in);
        //mat
        System.out.println("Matematik notunuz : ");
        mat=input.nextInt();
        //turkce
        System.out.println("Turkce notunuz : ");
        turkce=input.nextInt();
        //fizik
        System.out.println("Fizik notunuz : ");
        fizik=input.nextInt();
        //kimya
        System.out.println("Kimya notunuz : ");
        kimya=input.nextInt();
        //tarih
        System.out.println("Tarih notunuz : ");
        tarih=input.nextInt();
        //muzik
        System.out.println("Muzik notunuz : ");
        muzik=input.nextInt();
        ort=(mat+turkce+fizik+kimya+tarih+muzik)/6;
        System.out.println("Ders Ortalaniz : "+ ort);

        msg = (ort>=60) ? "Sinifi gecti" : "Sinifta kaldi";
        System.out.println(msg);

    }
}
