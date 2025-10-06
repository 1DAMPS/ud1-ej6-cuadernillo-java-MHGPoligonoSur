public class EJ15 {
    public static void main(String[] args) {
        int n = 2147483647;
        int suma = 0;

        suma = n + 1;

        System.out.print(suma);

// Sumar 1 hace que pase al valor más pequeño (-2147483648) porque se pasa del límite que puede guardar un int de 32 bits.


    }

}