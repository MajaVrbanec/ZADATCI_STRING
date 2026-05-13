import java.util.Scanner;

public class zadatakString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Unesite tekst: ");
        String tekst = sc.nextLine();
        tekst = tekst.trim();

        String[] rijeci = tekst.split(" ");

        for (int i = rijeci.length - 1; i >= 0; i--) {
            System.out.print(rijeci[i] + " ");

        }

    }

}
