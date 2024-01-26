public class Periódico {
    public static void main(String[] args) {
        VentasSemanales lista = new VentasSemanales(2);
        int numSemanas=1;
        lista.inicializaVenta();
        System.out.println(lista.toString());

    }
}