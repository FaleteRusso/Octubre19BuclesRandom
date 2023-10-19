import java.util.Scanner;

public class EjercicioWhile3 {
    public static void main(String[] args) {
        //Pedir numero hasta que se introduzca uno negativo y mostrar cuantos numeros se han introducido
        //variable
        int numero = 1;
        while (true) {
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();
            System.out.println("introduzca su dígito, si quiere salir introduzca un negativo:");
            if (numero >= 0) {
                numero++;
                int resultado =numero++;
            }else{
                System.out.println("gracias por su uso");
            //Hay que seguir
            }

        }
    }
}
