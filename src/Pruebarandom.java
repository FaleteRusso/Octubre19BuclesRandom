import java.util.Random;

public class Pruebarandom {
    public static void main(String[] args) {
        //Variable de instancia
        Random numeroAleatorio = new Random();
        //mostrar un numero aleatorio
        System.out.println(numeroAleatorio.nextInt());
        System.out.println(numeroAleatorio.nextInt(50));
        System.out.println(numeroAleatorio.nextInt(1,6));

    }
}
