import java.util.Scanner;

public class Ejerx1 {
    public static void main(String[] args) {
        //pedir 10 numeros, Mostrar la media de los numeros positivos y
        // los numeros negativos y cantidad de ceros.
        //Delcaracion variables
        int numero, numerosPositivos=0, numerosNegativos=0,sumaPositivos=0, sumaNegativos=0, cantidaCeros=0;
        //Variable instacia
        Scanner teclado = new Scanner(System.in);

        for (int i= 1;i <=10;i++){
            //Leer Nuemero
            System.out.println("Escriba el numero "+ i);
            numero= teclado.nextInt();
            if (numero>=0) {
                numerosPositivos++;
                //sumaPositivos=sumaPositivos+numero;
                sumaPositivos += numero;
                if (numero == 0) {
                    cantidaCeros++;
                }
            }else{
                //Si entra aqui es negativo
                numerosNegativos++;
                sumaNegativos+=numero;

            }
        }
        System.out.println("Media de positivos "+ sumaPositivos/numerosPositivos);
        System.out.println("Media de negativos "+ sumaNegativos/numerosNegativos);
        System.out.println("cantidad de ceros "+ cantidaCeros);
    }
}
