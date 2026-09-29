import java.util.Scanner;
public class ControlEdades {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        int menores = 0;
        int adultos = 0;
        int mayores65 = 0;
        int cantidad = 0;
        int suma = 0;

        System.out.println("Ingrese las edades.");
        System.out.println("Ingrese -1 para finalizar.");

        // Primera edad
        System.out.print("Ingrese una edad: ");
        edad = entrada.nextInt();

        while (edad != -1) {

            // Validar que la edad sea válida
            if (edad >= 0) {

                suma += edad;
                cantidad++;

                // Clasificar las edades
                if (edad < 18) {
                    menores++;
                } else if (edad <= 65) {
                    adultos++;
                } else {
                    mayores65++;
                }

            } else {
                System.out.println("Edad invalida. Ingrese una edad positiva o -1 para terminar.");
            }

            System.out.print("Ingrese una edad: ");
            edad = entrada.nextInt();
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Menores de edad: " + menores);
        System.out.println("Adultos: " + adultos);
        System.out.println("Mayores de 65 anioos: " + mayores65);

        if (cantidad > 0) {
            double promedio = (double) suma / cantidad;
            System.out.println("Promedio de edades: " + promedio);
        } else {
            System.out.println("No se ingresaron edades.");
        }
    
    
}
}
