import java.util.Arrays;

public class VentasSemanales {

    int numSemanas;
    int[][] seguimiento;

    public VentasSemanales(int numSemanas){
        this.numSemanas = numSemanas;
        this.seguimiento = new int[numSemanas][7];
        Arrays.fill(seguimiento, 0);
    }

    public void guardaVenta(int semana, int dia, int valor){
        seguimiento[semana][dia] = valor;
    }

}
