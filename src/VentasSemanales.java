import java.util.Arrays;

public class VentasSemanales {

    int numSemanas = 2;
    int[][] seguimiento;

    public VentasSemanales(int numSemanas){
        this.numSemanas = numSemanas;
        this.seguimiento = new int[numSemanas][7];
        inicializaVenta();
    }

    public void guardaVenta(int semana, int dia, int valor) {
        if (semana < 1 && dia >= 0 && dia < 7) {
            seguimiento[semana][dia] = valor;
        } else {
            System.out.println("Esta fuera de rango");
        }
    }

    public void inicializaVenta(){
        for (int i =0; i<numSemanas; i++){
            for (int j=0;j<7;j++){
                seguimiento[i][j] = 0;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder tabla= new StringBuilder("");
        tabla.append(String.format("%10s %9s %10s %12s %10s %10s %8s %10s","Alumno", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo\n"));
        int contador=0;
        for (int i=0; i<numSemanas; i++){
            tabla.append(String.format("%6.25s","S" + ++contador));

            for (int k=0; k<7 ; k++) {
                if (k == 3) {
                    tabla.append(String.format("%14s", seguimiento[i][k]));
                } else {
                    tabla.append(String.format("%10s", seguimiento[i][k]));
                }
            }
            tabla.append("\n");
        }
        return String.valueOf(tabla);
    }
}