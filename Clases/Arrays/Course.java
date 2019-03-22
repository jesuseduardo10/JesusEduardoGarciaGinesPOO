import java.util.Scanner;

public class Course{


    private String courseName;
    private String[] students= new String [100];
    private int numbersOfStudents;

    Course( String courseName ){
        this.courseName=courseName;
    }

        public void addStudents(String student){
            students[numbersOfStudents]=student;
        numbersOfStudents++;
        }

        public String[] getStudents(){

            return students;
        }
        public int getNumberOfStudents(){

            return numbersOfStudents;
        }
        public void removeStudents(String e){

           int n;
           for(n=0;n<students.length;n++){
               if(e.equalsIgnoreCase (students[n])){
                students[n]=null;
                numbersOfStudents= numbersOfStudents--;
                System.out.println("dato eliminado");
               }else{
               }
            }}

        public static void main(String[] args) {
            Course c1=new Course("POO");
            String aux = "";
            Scanner scanner = new Scanner(System.in);
            int opc;
            do{         
            System.out.println("1: Nombre del curso:  \n2:Agregar estudiante: \n3:Mostrar estudiantes: \n4:Total de estudiantes: \n5: Eliminar\n6:Salir " );
            System.out.println("Selecciona una opcion: " );
            opc=scanner.nextInt();
            
            
            switch (opc) {
                case 1:
                System.out.println("Nombre del curso: "+c1.courseName );
                
                break;
                case 2: System.out.println("Ingresa el nombre del estudiante: " );
                aux=scanner.next();
                c1.addStudents(aux);
                break;
                case 3:
                for  (int x=0; x<c1.getNumberOfStudents(); x++)
                System.out.println(c1.getStudents()[x]);
               
                break;
                case 4:
                System.out.println("Total de estudiantes: "+c1.getNumberOfStudents());
                break;
                case 5:
                System.out.println("Ingrese un nombre de la persona que desea eliminar: ");
                String e= scanner.next();
                c1.removeStudents(e);

                
         
                break;

                default:
                System.out.println("Bye");
                break;
            }
        } while (opc!=6);
        
        }}