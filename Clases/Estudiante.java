import java.util.Scanner;
public class Estudiante {

    //Atributos
     public Double anioN;
     public String nombre;
     public Short annioNacimiento;

     public double obtenerEdad(){
        return 2019-anioN;
    }

    //Metodos
    public static void main(String[] args){
        

        Scanner scanner=new Scanner(System.in);
       
		System.out.println("Introduce tu nombre ");
        String nombre = scanner.next();

       

        Estudiante edad1 = new Estudiante();
        System.out.println("Ingresa tu Annio de Nacimiento: " );
         edad1.anioN =scanner.nextDouble();
         System.out.println("Ingresalo de nuevo: " );
         Short annioNacimiento;
       
        annioNacimiento=scanner.nextShort();
       
        
        
        double edad = edad1.obtenerEdad();
        
        System.out.println("Alumno: "+nombre);
         System.out.println("Tu Annio de Nacimiento es: "+annioNacimiento );
         System.out.println("Tu edad es: "+edad+" annios" );
        }
    }
