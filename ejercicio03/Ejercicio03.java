import java.util.Scanner;
public class CalculadoraMenu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;

        do {
            // Mostrar menú
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();

                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();

                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextDouble();

                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = entrada.nextDouble();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = entrada.nextDouble();

                    // Validar división entre cero
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                    }
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida. Seleccione una opcion del 1 al 5.");
            }

        } while (opcion != 5);
    }
    
}
