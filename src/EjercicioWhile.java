import java.util.Scanner;

public class EjercicioWhile {
    public static void main(String[] args) {
        //Leer un numero y mostrar su cuadrado, repetir hasta que se introduzca un numero negativo
        //Declarar variables
        int numero = 0;
        //instancia
        Scanner teclado = new Scanner(System.in);
        while (numero >= 0) {
            //solicitar numero
            System.out.println("Escriba un numero y cuando quiera salir introduzca un numero negativo");
            numero = teclado.nextInt();

            if (numero >= 0) {
                //System.out.println("El cuadrado de " + numero + " es " + (numero*numero));
                System.out.println("El cuadrado de " + numero + " es " + Math.pow(numero, 2));
            } else {
                System.out.println("Gracias por usar el servicio");


            }
        }
    }
}