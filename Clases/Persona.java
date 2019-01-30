import java.util.Scanner;

public class Persona{

    //Atributos
    private String nombre,rfc;
    private double peso,altura;
    private char sexo;
    private int edad;

    //Metodos
     public int calcularImc(){
        int res=0; 
        double imc = peso/(Math.pow(altura,2));
         if (imc<20){
            res=-1;
            System.out.println("SU IMC ES: "+imc+" \nUsted tiene Peso Bajo");
    
         }else if(imc>=20 && imc <=25){
             res= 0;
             System.out.println("SU IMC ES: "+imc+" \nUsted tiene peso Ideal");
         }else{
                 res=1;
                 System.out.println("SU IMC ES: "+imc+" \nUsted tiene Sobrepeso");
             }

                  return res;
     }
    
    public boolean esMayorDeEdad(){
        boolean mayor=false;
        String may= String.valueOf(mayor);
        if (edad>=18)
            mayor =true;
           
        return mayor;
     }
     public String toString(){
        return ("Nombre: "+nombre+
                              "\nSexo: "+sexo+
                              "\nRFC: "+rfc+
                              "\nPeso: "+peso+
                              "\nAltura: "+altura+
                              "\nEdad: "+edad);
                          }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
     return nombre;

    }                
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad() {
        return edad;
        
    }
    public void setRfc(String rfc){
        this.rfc=rfc;
    }
    public String getRfc() {
        return rfc;
        
    }
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    public char getSexo() {
        return sexo;
        
        
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getpeso() {
        return peso;
        
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
  
    public double getAltura() {
        return altura;
        
    }
    
public static void main(String[] args) {
     Persona persona1=new Persona();
    Scanner scanner=new Scanner(System.in);

     System.out.println("Ingrese su nombre:");
     String n=scanner.next();
     persona1.setNombre(n);
     System.out.println("Ingrese su edad:");
     int e = scanner.nextInt();
     persona1.setEdad(e);
     System.out.println("Ingrese su RFC:");
     String r=scanner.next();
     persona1.setRfc(r);
     System.out.println("Ingrese su sexo:");
    String s=scanner.next();
     persona1.setSexo(s.charAt(0));
     System.out.println("Ingrese su peso:");
     double p=scanner.nextDouble();
     persona1.setPeso(p);
     System.out.println("Ingrese su altura:");
    double a=scanner.nextDouble();
     persona1.setAltura(a);


     System.out.println(persona1.toString());
     System.out.println("Usted es mayor de edad: "+persona1.esMayorDeEdad());
     persona1.calcularImc();
    
    }

    





}