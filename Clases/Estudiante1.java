public class Estudiante1 extends Persona1{

    String matricula;
    String carrera;


    public Estudiante1(){}
    public Estudiante1(String matricula,String carrera){}
    public Estudiante1(String matricula,String carrera, String nombre,int edad){
        super(nombre,edad);
        this.matricula = matricula;
        this.carrera = carrera;
       
    }

    public String toString2(){
        return "Matricula: "+matricula+
                            "\ncarrera: "+carrera;

    }


}