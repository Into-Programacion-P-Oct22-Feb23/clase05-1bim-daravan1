/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue: Estudiante aprobado con un promedio: 8.1
 */
package ejemplo1;

import java.util.Locale; // Se importa para poder poner . en java
import java.util.Scanner; // Se importa la clase Scanner
/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        // Condicionales simples
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double promedio; //Se asigna el valor
        System.out.println("ingrese la nota necesaria:"); //Se inmprime la pregunta
        promedio = entrada.nextDouble(); // Se ingresa por teclado el valor

        if (promedio >= 7.5) { // Condicional simple 
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
            
        } //Si Falso no ejecuta nada
    }

}
