public class EJ13 {
    public static void main(String[] args) {
    final double IRPF = 0.14;
    double sueldo = 2000;
    double sueldoNeto = 0;

        sueldoNeto = sueldo - (sueldo * IRPF);

    System.out.println("El sueldo neto es: " + sueldoNeto);

    }
}
