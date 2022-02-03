import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double r,a,alan, pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz : ");
        r= input.nextDouble();
        System.out.println("Daire diliminin acisini giriniz : ");
        a=input.nextDouble();
        alan=(pi*a*(r*r))/360;
        System.out.println("Daire diliminin alani : "+alan);
    }
}
