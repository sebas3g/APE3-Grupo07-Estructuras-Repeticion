import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        // Solicitar y validar el número
        System.out.print("Ingrese un numero entre 1 y 12: ");
        numero = entrada.nextInt();

        while (numero < 1 || numero > 12) {
            System.out.println("Numero invalido.");
            System.out.print("Ingrese un numero entre 1 y 12: ");
            numero = entrada.nextInt();
        }

        // Generar la tabla de multiplicar
        System.out.println("\n--- TABLA DEL " + numero + " ---");

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}
