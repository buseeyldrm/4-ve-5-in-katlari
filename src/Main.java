import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayi Girin: ");
        int sayi = klavye.nextInt();


        System.out.println("4'ÜN KATLARI: ");
        System.out.println();
        for (int i = 1; i <=sayi ; i*=4) {
            System.out.println("4'un katları: " +i+ " ");

        }
        System.out.println();

        System.out.println("5'İN KATLARI: ");
        System.out.println();
        for (int i = 1; i <=sayi ; i*=5) {
            System.out.println("5'in katları: " +i+ " ");

        }
    }}