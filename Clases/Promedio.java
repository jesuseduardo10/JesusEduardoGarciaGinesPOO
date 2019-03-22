import java.util.*;
public class Promedio{


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de calificaciones a promediar:");
        int cal = scanner.nextInt();

        double[]c;
        c = new double[cal];
        double contador = 0;

		for (int i = 0; i < c.length; i++) {
            System.out.print("Ingrese la calificacion " + (i+1) + " :");
            c[i] = scanner.nextInt();   
        }

        for (int i = 0; i<cal; i++){
            contador = contador + c[i]; 
        }
        System.out.println("Tu promedio es: "+contador/cal);
        
    }
}