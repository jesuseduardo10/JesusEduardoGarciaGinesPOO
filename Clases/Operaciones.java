import java.util.Scanner;
public class Operaciones {
    //Atributos
    public double a;
    public double b;


    //Metodos
    public double sumarNumeros(){
        return a+b;
    }
        public double restarNumeros(){
        return a-b;
    }
        public double dividirNumeros(){
        return a/b;
    }
        public double multiplicarNumeros(){
        return a*b;
    }

    public static void main(String[] args){
        Operaciones operaciones1 = new Operaciones();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero 1: " );
        operaciones1.a=scanner.nextDouble();
        System.out.println("Numero 2: " );
        operaciones1.b=scanner.nextDouble();

        double suma = operaciones1.sumarNumeros();
        
         System.out.println("El resultado de suma es: "+suma );




    }
}
