import java.util.Arrays;

public class VentasSemanales {

    private int numSemanas = 2;
    private int[][] seguimiento;

    /**
     *
     * @param numSemanas Contructor con la variable numSemanas
     */
    public VentasSemanales(int numSemanas) {
        this.numSemanas = numSemanas;
        this.seguimiento = new int[numSemanas][7];
        inicializaVenta();
    }

    /**
     *
     * @param semana
     * @param dia
     * @param valor
     * Método para guardar las ventas
     */
    public void guardaVenta(int semana, int dia, int valor) {
            if (semana >=0 && dia >= 0 && dia < 7) {
                seguimiento[semana][dia] = valor;
            } else {
                System.out.println("Esta fuera de rango");
            }
    }

    public void inicializaVenta() {
        for (int i = 0; i < numSemanas; i++) {
            for (int j = 0; j < 7; j++) {
                seguimiento[i][j] = 0;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder tabla = new StringBuilder();
        tabla.append(String.format("%10s %9s %10s %12s %10s %10s %8s %10s", "Semana", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo\n"));
        int contador = 0;
        for (int i = 0; i < numSemanas; i++) {
            tabla.append(String.format("%6.25s", "S" + ++contador));

            for (int k = 0; k < 7; k++) {
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

    public String totalUnaSemana(int semana) {
        StringBuilder unaSemana = new StringBuilder();
        unaSemana.append(String.format("%10s %9s %10s %12s %10s %10s %8s %10s", "Semana", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo\n"));
        unaSemana.append(String.format("%6.25s", "S" + semana));
        for (int k = 0; k < 7; k++) {
            if (k == 3) {
                unaSemana.append(String.format("%14s", seguimiento[semana][k]));
            } else {
                unaSemana.append(String.format("%10s", seguimiento[semana][k]));
            }
        }
        return unaSemana.toString();
    }

    public int totalDiaSemana(int dia) {
        int sumaPeriodicos = 0;
        for (int i = 0; i < numSemanas; i++) {
            sumaPeriodicos += seguimiento[i][dia];
        }
        return sumaPeriodicos;
    }

    public int mediaDiaSemana(int dia) {
        int media = totalDiaSemana(dia);
        return media / numSemanas;
    }

    public String totalSemana() {
        StringBuilder sumaDiasSemana = new StringBuilder();
        sumaDiasSemana.append(String.format("%9s %10s %12s %10s %10s %8s %10s", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo\n"));
        int sumaDias = 0;
        for (int i = 0; i < 7; i++) {
            sumaDias = totalDiaSemana(i);
            if (i == 3) {
                sumaDiasSemana.append(String.format("%14s", sumaDias));
            } else {
                sumaDiasSemana.append(String.format("%10s", sumaDias));
            }
        }
        return sumaDiasSemana.toString();
    }

    public String mediaSemana() {
        StringBuilder mediaSemana = new StringBuilder();
        mediaSemana.append(String.format("%9s %10s %12s %10s %10s %8s %10s", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo\n"));
        int sumaDias = 0;
        for (int i = 0; i < 7; i++) {
            sumaDias = totalDiaSemana(i);
            if (i == 3) {
                mediaSemana.append(String.format("%14s", sumaDias/numSemanas));
            } else {
                mediaSemana.append(String.format("%10s", sumaDias/numSemanas));
            }
        }
        return mediaSemana.toString();
    }
}