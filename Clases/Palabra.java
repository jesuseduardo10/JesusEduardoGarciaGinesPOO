import java.util.Scanner;
public class Palabra{
 private String word;


    public String getWord() {
        return word;
    }

    
    public void setWord(String word) {
        this.word = word;
    }

    public int contarLetras(){

        return word.length();
    }
 
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        Palabra p1=new Palabra();
        System.out.println("Ingresa una palabra: ");
        String p=scanner.next();
        p1.setWord(p);
        System.out.println("La palabra "+p1.getWord()+" tiene "+p1.contarLetras()+" letras");
    }
}



