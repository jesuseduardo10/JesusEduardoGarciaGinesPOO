import java.util.Scanner;
public class Password{

    private String password;
    private String longitud;


    
    public boolean esFuerte(){
        
        if (password.length()<8){
            return true;
        }
            else{
              return false;
            }
        
    }
 
    public void setPassword(String Password){
        this.password=password;
    }
    public String getPassword() {
        return password;
        
    }
    public void setLongitud(String Longitud){
        this.longitud=longitud;
    }
    public String getlongitud() {
        return longitud;}
        


    public static void main(String[] args) {
        Password p1=new Password();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese su contraseña:");
        String n=scanner.next();
        p1.setPassword(n);
        p1.esFuerte();
    }
    }

   

    
    
    


