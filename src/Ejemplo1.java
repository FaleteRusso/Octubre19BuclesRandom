import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        //mostrar la tabla de multiplicar del numero leido por la consola
        int tabla;
        Scanner teclado = new Scanner(System.in);
                //solicitarlo por consola
        System.out.println("Escriba el numero de la tabla a mostrar");
        tabla = teclado.nextInt();
        for (int i =1; i <=10;i++){
            int resultado = tabla * i;
            System.out.println(tabla + "x" + i + "=" + resultado);

        }

    }
}
