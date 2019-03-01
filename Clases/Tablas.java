import java.util.Scanner;
class Tablas{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int aux=0;

        do {
            System.out.println("Menu \n Selecciona la tabla que deseas imprimir que sea del 1 -10 : \n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11.- Salir");
            aux=scanner.nextInt();
            int cont=1;
            if (aux<11){
            do{
                int mul=(cont*aux);
                System.out.println(aux+" x "+cont+" = "+mul);
                cont++;


            }while (cont<11);
        }

        } while (aux!=11);
    }

}