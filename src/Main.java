import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a) {
            case "USD":
                System.out.println("84,5");
                break;
            case "EUR":
                System.out.println("102,58");
                break;
            case "RUB":
                System.out.println("1,15");
                break;
            case "KZT":
                System.out.println("123,31");
                break;
        }

    }
}