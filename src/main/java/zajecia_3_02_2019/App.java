package zajecia_3_02_2019;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int liczba = 16;
        boolean zmienna = true;
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) {
                zmienna = false;
                break;
            }
        }
        if (zmienna == true) {
            System.out.println("Liczba: " + liczba +"jest pierwsza");
        } else {
            System.out.println("Liczba: " + liczba +" nie jest pierwsza");
        }
    }
}

