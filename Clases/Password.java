import java.util.Scanner;

public class Password{

    private int longitud;
    private String pass;

   
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

   
    public String getPass() {
        return pass;
    }

  
    public void setPass(String pass) {
        this.pass = pass;
    }


    public boolean esFuerte() {
        if (pass.length()<8){
            return false;}
            else{
                return true;
            }
        }

    

    public static void main(String[] args) {
         
        Password pa1= new Password();
        Scanner scanner=new Scanner(System.in);
        System.out.println("INGRESA UNA CONTRASEÑA");
        String p=scanner.next();
        pa1.setPass(p);
        if (pa1.esFuerte() == true){
            System.out.println("Es fuerte");
        }else{System.out.println("Es Debil");
        }
    }

    }

