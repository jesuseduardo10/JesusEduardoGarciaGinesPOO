import java.util.Scanner;
public class Operaciones2 {
    //Atributos
    private double a;
    private double b;


    //Metodos

    
    public double sumar(){
        return a+b;
    }
        public double restar(){
        return a-b;
    }
        public double dividir(){
        return a/b;
    }
        public double multiplicar(){
        return a*b;
    }
  
    public void setA(double a) {
        this.a = a;
    }
   
    public double getA() {
        return a;
    }
   
     public void setB(double b) {
        this.b = b;
    }
    public double getB() {
        return b;
    }


   
    public static void main(String[] args){
        Operaciones2 operaciones1 = new Operaciones2();
        Scanner scanner = new Scanner(System.in);
        int opc=0;
        
        while (opc!=6){
            
            System.out.println("1: Leer numeros \n2:Sumar\n3:Restar\n4:Multiplicar\n5:Dividir\n6:Salir " );
            System.out.println("Selecciona una opcion: " );
            opc=scanner.nextInt();
            
            switch (opc) {
                case 1:
                System.out.println("Numero 1: " );
                Double a1=scanner.nextDouble();
                operaciones1.setA(a1);
                System.out.println("Numero 2: " );
                Double b2=scanner.nextDouble();
                operaciones1.setB(b2);
                break;
                case 2:
                System.out.println("Resultado de Suma: "+operaciones1.sumar());
                break;
                case 3:
                System.out.println("Resultado de Resta: "+operaciones1.restar());
                break;
                case 4:
                System.out.println("Resultado de Multiplicar: "+operaciones1.multiplicar());
                break;
                case 5:
                System.out.println("Resultado de Dividir: "+operaciones1.dividir());
                break;
                default:
                System.out.println("Numero Invalido");
                break;
            }
        

        }


    }
 

 
}
