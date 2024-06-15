import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int FiyatHesapla;
    double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.00, ToplamTutar;

    Scanner input = new Scanner(System.in);

    System.out.print("Armut Kac Kilo? :");
    Armut = input.nextDouble();
    System.out.print("Elma Kac Kilo? :");
    Elma = input.nextDouble();
    System.out.print("Domates Kac Kilo? :");
    Domates = input.nextDouble();
    System.out.print("Muz Kac Kilo? :");
    Muz = input.nextDouble();
    System.out.print("Patlican Kac Kilo? :");
    Patlican = input.nextDouble();
    System.out.print("Toplam Tutar :"+((Armut*2.14)+(Elma*3.67)+(Domates*1.11)+(Muz*0.95)+(Patlican*5))+"TL");

    }
}