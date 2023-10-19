import java.util.Scanner;

public class EjercicioWhile2 {
    public static void main(String[] args) {
        //Leer numeros hasta que se introduzca un 0. para cada uno indicar si es par o impar
        int numero =1;
        Scanner teclado = new Scanner(System.in);
        //solicitar numero

        while (true){
            System.out.println("Escriba un numero, para salir marque Cero ´0´");
            numero = teclado.nextInt();
            if (numero %2==0){
                System.out.println("el numero es par ->" + numero);
            }if (numero %2!=0){
                System.out.println("El numero es impar ->" + numero);
            } else if (numero == 0) {
                System.out.println("Gracias por usar el servicio");
                break;
            }

            }



            }

    }

