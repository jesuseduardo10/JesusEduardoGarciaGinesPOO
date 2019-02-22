import java.util.Scanner;
class Palindromo {

    private String palabra;

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public String getPalabra() {
        return palabra;
    }
    public String cambiarPalabra(){
        String palabraCambiada= "" ;
        int longitud = palabra.length();
        while (longitud > 0){
            palabraCambiada += palabra.charAt(longitud-1);
            longitud--;
        }
        return palabraCambiada;
    }
    public void evaluarPalabras (String palabra2){
        if (palabra.equalsIgnoreCase(palabra2)){
            System.out.println(palabra + "  Es un palindrmo");
        }else System.out.println(palabra + "  No es un palindromo");
    }

    public static void main(String[] args) {
        Palindromo p = new Palindromo();
        Scanner scanner= new Scanner(System.in);
        int op = 0;
        String aux = "";

        while(op != 3 ){
            System.out.println("------ PALINDROMO ----- \n 1) Pedir palabra\n 2) evaluar palabra\n 3) Salir");
        
            op = scanner.nextInt();
            switch(op){
                case 1:
                    System.out.println("Escriba una palabra");
                    aux= scanner.next();
                break;
                case 2:
                    p.setPalabra(aux);
                    String p2 = p.cambiarPalabra();
                    p.evaluarPalabras(p2);

                break;

                default:
                    System.out.println("NUMERO INVALIDO");
                break;
            }
        }
        
    }
}