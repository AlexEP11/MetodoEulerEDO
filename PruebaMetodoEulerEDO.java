import java.util.Scanner;

public class PruebaMetodoEulerEDO {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        double xInical,h,y;
        int cant;
        
        System.out.print("Ingrese la cantidad de datos de la tabla: ");
        cant = leer.nextInt();
        System.out.print("Ingrese el valor inicial de [x]: ");
        xInical = leer.nextDouble();
        System.out.print("Ingrese el incremento [h]: ");
        h = leer.nextDouble();
        System.out.printf("Ingrese la condicion inicial de y(%.2f) = ",xInical);
        y = leer.nextDouble();
        
        MetodoEulerEDO edo = new MetodoEulerEDO(xInical,y,h,cant);
        edo.llenarTablaX();
        edo.llenarTablaY();
        edo.imprimirTabla();
    }
}