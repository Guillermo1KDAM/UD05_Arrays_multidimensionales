public class Periódico {
    public static void main(String[] args) {
        VentasSemanales lista = new VentasSemanales(2);
        lista.guardaVenta(1,0,3);
        int numSemanas=1;
        System.out.println(String.format("%-10.25s %-10.25s %-10.25s %-10.25s %-10.25s %-10.25s %-10.25s", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));

    }
}