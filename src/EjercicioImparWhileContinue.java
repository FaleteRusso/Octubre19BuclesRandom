public class EjercicioImparWhileContinue {
    public static void main(String[] args) {
        //mostrar solo numeros pares con continue
        int i=0;

        while (i<=10){
            i++;
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
