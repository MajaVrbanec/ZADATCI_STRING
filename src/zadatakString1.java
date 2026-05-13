import java.util.Scanner;

public class zadatakString1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite niz znakova: ");
        String tekst = input.nextLine();

        int broj = 0;
        int slovo = 0;
        int znak = 0;

        for (int i = 0; i < tekst.length(); i++) {
            char trenutniZnak = tekst.charAt(i);
            if (Character.isLetter(trenutniZnak)) {
                slovo++;
            } else if (Character.isDigit(trenutniZnak)) {
                broj++;
            } else {
                znak++;
            }

        }
        System.out.println("Slova: " + slovo);
        System.out.println("Broj: " + broj);
        System.out.println("Ostali znakovi: " + znak);

    }
}
