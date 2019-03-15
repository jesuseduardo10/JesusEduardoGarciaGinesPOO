public class Persona1{

    String nombre;
    int edad;


        public Persona1(){}
        public Persona1(String nombre,int edad){
            this.edad = edad;
            this.nombre = nombre;
        }

        public String toString(){
            return "Nombre: "+nombre+
                                "\nedad: "+edad;

        }
public static void main(String[] args) {
    
    Estudiante1 est1 = new Estudiante1();
    Estudiante1 est2 = new Estudiante1("1425421","TICS");
    Estudiante1 est3 = new Estudiante1("1425421","TICS","Jesus",23);
    System.out.println("---------Estudiante----------\n"+est3.toString());
    System.out.println(est3.toString2());
    
    Profesor prof1 = new Profesor();
    Profesor prof2 = new Profesor(21456,4);
    Profesor prof3 = new Profesor(21456,4,"Pedro",45);
    System.out.println("---------Profesor----------\n"+prof3.toString());
    System.out.println(prof3.toString2());
    

}
}