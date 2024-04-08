import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.print("Introduce un numero -> ");
            opcion = sc.nextInt();
            Validador validador = new Validador();
            validador.Validador(opcion);
        } while (opcion != 0);

    }
}