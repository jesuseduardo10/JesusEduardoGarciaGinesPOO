import java.util.Scanner;
public class Estudiante {

    //Atributos
     public double anioN;
     public String nombre;
     public short ANNIO=2019; 
     
     public double obtenerEdad(){
        return ANNIO-anioN;
    }
    public String toString(){
        return "Nombre "+nombre+"\nTu edad es: "+obtenerEdad()+" annios "+"\nAnnio de nacimiento: "+anioN;
    }
    //Metodos
    public static void main(String[] args){
        
        Scanner scanner=new Scanner(System.in);

        Estudiante edad1 = new Estudiante();
        System.out.println("Introduce tu nombre ");
        edad1.nombre= scanner.next();
        System.out.println("Ingresa tu Annio de Nacimiento: " );
         edad1.anioN =scanner.nextDouble();
       
      
        System.out.println(edad1.toString()); 
        }
    }
