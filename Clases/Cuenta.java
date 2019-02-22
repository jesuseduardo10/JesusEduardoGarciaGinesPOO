import java.util.Scanner;
public class Cuenta{
    //atributos
    private String titular;
    private double cantidad;

    //métodos
    
    public void ingresar(double cantidad){
       this.cantidad = this.cantidad + cantidad;
    }

    public void retirar(double cantidad){
       if(this.cantidad>=0){
            this.cantidad = this.cantidad - cantidad;}
            else{
                System.out.println("Fondos Insuficientes");
            }
    }

    public String toString(){
      return ("Titular " + titular + "\n total "+ cantidad);
      
    }

    public String getTitular(){
        return titular;
    }
    public void getCantidad(){
        if(this.cantidad<=0){
            System.out.println("Fondos Insuficientes, No se puede completar la transaccion");} 
            else{
                System.out.println ("Titular " + titular +"\nSu saldo disponible es "+ cantidad );}
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(double cantidad){
        this.cantidad= cantidad;

    }

    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre :");
        cliente1.titular = scanner.nextLine();

        System.out.println("Ingresa la cantidad ");
        cliente1.ingresar(100.23);

        System.out.println(cliente1.toString());
        System.out.println("Ingresa la cantidad ");
        cliente1.ingresar(500);
        System.out.println("Ingresa la cantidad ");
        cliente1.ingresar(100.23);

        System.out.println (cliente1.toString());

        cliente1.retirar(50);
        cliente1.retirar(50);
        cliente1.retirar(500);

        cliente1.getTitular();
        cliente1.getCantidad();

    }
}