public class Main {

    public static void main(String args[]) {
        System.out.println(suma(10,10,10));

        Coche miCoche = new Coche();

        miCoche.aumentarPuertas();

        System.out.println(miCoche.puertas);
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static class Coche {
        public int puertas = 0;

        public void aumentarPuertas() {
            this.puertas++;
        }
    }
}
