import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Mostrar las 10 tablas de multiplicar

        for (int j = 1;j<=10;j++){
            System.out.println("tabla de multiplicar del: " + j);
            for (int i = 1; i <=10; i++){
                int resultado = j * i;
                System.out.println(j + "x" + i +"=" + resultado);
            }
        }
    }
}
