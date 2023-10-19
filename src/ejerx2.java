import java.util.Scanner;

public class ejerx2 {
    public static void main(String[] args) {
        //Pedir 10 sueldos, mostrar su suma y cuantos hay mayores a 1000€
        //Indicar variables
        //sueldo (i), sumaSueldos,sueldosMayores1000
        //variable instacia


        //Se declaran dos variables: sumaSueldos para almacenar la suma de los sueldos y
        // sueldosMayoresA1000 para contar cuántos sueldos son mayores a 1000 euros.
        double sueldo, sumaSueldos = 0;
        int sueldosMayores1000 = 0;
        //Se utiliza un bucle for para solicitar 10 sueldos.
        // El bucle se ejecutará 10 veces (i<=10),comenzando desde i = 1 y aumentando en cada iteración (i++).
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            //Se muestra un mensaje pidiendo al usuario que ingrese el sueldo y se almacena en la variable sueldo (+i)
            System.out.println("introduzca su sueldo " + i);
        sueldo = teclado.nextDouble();
        //El sueldo ingresado se suma al valor actual de sumaSueldos.
        sumaSueldos += sueldo;
        //Se verifica si el sueldo ingresado es mayor a 1000 euros.
        // Si lo es, se incrementa el contador sueldosMayoresA1000.
        if (sueldo > 1000) {
            sueldosMayores1000++;
        }
    }
    //Finalmente, se muestra(sout) la suma de los sueldos ingresados y (sout)la cantidad de sueldos mayores a 1000 euros.
            System.out.println("La cantidad de sueldos asciende a: "+sumaSueldos);
            System.out.println("la cantidad de sueldos mayores a 1000€ es: "+sueldosMayores1000);
}
}


