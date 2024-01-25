import java.util.Arrays;

public class VentasSemanales {

    int numSemanas;
    int[][] seguimiento;

    public VentasSemanales(int numSemanas){
        this.numSemanas = numSemanas;
        this.seguimiento = new int[numSemanas][7];
        Arrays.fill(seguimiento, 0);
    }

    public void guardaVenta(int semana, int dia, int valor) {
        if (semana < 1 && dia >= 0 && dia < 7) {
            seguimiento[semana][dia] = valor;
        } else {
            System.out.println("Esta fuera de rango");
        }
    }
    public void inicializaVenta(){
        Arrays.fill(seguimiento, 0);
    }

    @Override
    public String toString() {
        StringBuilder tabla= new StringBuilder("Semana");
        tabla.append(String.format("%-10.25s %-10.25s %-10.25s %-10.25s %-10.25s %-10.25s %-10.25s %-10.25s","Alumno", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo\n"));

        for (int i=0; i<numSemanas; i++){
            tabla.append(String.format("%10s"));
        }
        return tabla.toString();
    }
}

