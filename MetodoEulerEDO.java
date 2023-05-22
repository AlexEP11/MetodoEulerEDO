public class MetodoEulerEDO {
    private double xInicial;
    private double x;
    private double y;
    private double h;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    private double[] filaX;
    private double[] filaY;

    public MetodoEulerEDO(double xInical, double y, double h, int cant) {
        this.xInicial = xInical;
        this.x = xInical;
        this.y = y;
        this.h = h;
        filaX = new double[cant];
        filaY = new double[cant];
    }

    public void llenarTablaX() {
        filaX[0] = xInicial;
        for (int i = 1; i < filaX.length; i++) { 
            filaX[i] = xInicial+=h;
        }
    }

    public double polinomio() {
        return (2*(Math.pow(x,1.7)) + (3*(Math.cos(2*x))) +4);
    }

    public double resultadoYi(double fPrima) {
        return y + fPrima*h;
    }

    public void llenarTablaY() {
        filaY[0] = y;
        for (int i = 1; i < filaY.length; i++) {
            x = filaX[i-1];
            filaY[i] = (resultadoYi(polinomio()));
            y = filaY[i];
        }
    }

    public void imprimirTabla() {
        System.out.println();
        System.out.printf("+-----------------------------------+%n");
        System.out.printf("|          " + ANSI_GREEN + "TABLA REGISTRADA" + ANSI_RESET +  "         |%n");
        System.out.printf("+-----------------------------------+%n");
        System.out.printf("|     " + ANSI_YELLOW + "I"+ ANSI_RESET + "     |     " + ANSI_YELLOW + "X" + ANSI_RESET + "     |     " + ANSI_YELLOW + "Y" + ANSI_RESET + "     |%n");
        System.out.printf("+-----------+-----------+-----------+%n");
        for (int i = 0; i < filaX.length; i++) {
            System.out.printf("|     %-4d  | %-9.2f | %-9.4f |%n", i+1, filaX[i], filaY[i]);
        }
        System.out.printf("+-----------+-----------+-----------+%n");
    }

}
