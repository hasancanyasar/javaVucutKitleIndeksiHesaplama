import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        double kilo, boy;
        double indeks;

        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = inp.nextDouble();

        System.out.println("Kilonuzu Giriniz : ");
        kilo = inp.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("Vücüt Kitle İndeksiniz : " + indeks);


    }
}