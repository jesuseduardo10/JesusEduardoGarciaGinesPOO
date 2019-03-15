public class Profesor extends Persona1 {

double salario;
double numeroDeGrupos;


public Profesor(){}
public Profesor(double salario,double numeroDeGrupos){}
public Profesor(double salario,double numeroDeGrupos, String nombre,int edad){
    super(nombre,edad);
    this.salario = salario;
    this.numeroDeGrupos = numeroDeGrupos;
   
}
public String toString2(){
    return "Salario: "+salario+
                        "\nNumero De Grupos: "+numeroDeGrupos;

}
}
