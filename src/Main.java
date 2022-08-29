import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
        int total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Bir sayı giriniz: ");
            n = inp.nextInt();
            if (n%2==0) {
                System.out.println(n);
                total += n;
                System.out.println("Toplam değer: " + total);
            }
        }while (n>0);
    }


}
