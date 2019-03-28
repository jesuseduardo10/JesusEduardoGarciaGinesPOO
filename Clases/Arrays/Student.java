import java.util.Scanner;
public class Student {
    private  String courseName;
    private int numNombre;
    private int numAPaterno;
    private int numAMaterno;
    private int numAnnioNacimiento;
    private int numEmail;
    private String[] nombre = new String [100];
    private String[] a_paterno = new String [100];
    private String[] a_materno = new String [100];
    private String[] anio_nacimiento = new String [100];
    private String[] correo = new String [100];


    Student( String courseName ){
        this.courseName=courseName;
    }
    
    public void addNombre(String nombres){
        nombre[numNombre] = nombres;
        numNombre++;
    }

    public void removeNombre(String nombres){
    nombre[numNombre] = nombres;
        numNombre--;
        
    }


    public String[] getNombre() {
        return nombre;
    }
    public int getnumNombre() {
        return numNombre;
    }

    public void addApaterno(String Apaternos){
        a_paterno[numAPaterno] = Apaternos;
        numAPaterno++;
    }

    public void removeApaterno(String Apaternos){
        a_paterno[numAPaterno] = Apaternos;
        numAPaterno--;
    }

    public String[] getApaterno() {
        return a_paterno;
    }
    public int getNumberOfApaternoStudents() {
        return numAPaterno;
    }
    public void addAmaterno(String Amaternos){
        a_materno[numAMaterno] = Amaternos;
        numAMaterno++;
    }

    public void removeAmaterno(String Amaterno){
        a_materno[numAMaterno] = Amaterno;
        numAMaterno--;
    }

    public String[] getAmaterno() {
        return a_materno;
    }
    public int getNumberOfAmaternoStudents() {
        return numAMaterno;
    }
    
    public void addAnio_nacimiento(String anio_nacimientos){
        anio_nacimiento[numAnnioNacimiento] = anio_nacimientos;
        numAnnioNacimiento++;
    }

    public void removeAnio_nacimiento(String anio_nacimientos){
        anio_nacimiento[numAnnioNacimiento] = anio_nacimientos;
        numAnnioNacimiento--;
    }

    public String[] getAnio_nacimiento() {
        return anio_nacimiento;
    }
    public int getnumAnnioNacimiento() {
        return numAnnioNacimiento;
    }
    
    
    public void addCorreo(String correos){
        correo[numEmail] = correos;
        numEmail++;
    }

    public void removeCorreos(String correos){
        correo[numEmail] = correos;
        numEmail--;
    }

    public String[] getcorreo() {
        return correo;
    }
    public int getnumEmail() {
        return numEmail;
    }
    
    public static void main(String[] args) {
        Student c1= new Student("POO");
        Scanner scanner = new Scanner(System.in);

        int opc=0;
        while (opc!=6){
            System.out.println("1: Nombre del curso:  \n2:Agregar estudiante: \n3:Mostrar estudiantes: \n4:Total de estudiantes: \n5: Eliminar\n6:Salir " );
            System.out.println("Selecciona una opcion: " );
            opc=scanner.nextInt();
        
            switch (opc){
                case 1:
                    System.out.println("Nombre del Curso : "+(c1.courseName));
                    
                break;
                case 2:
                    System.out.println("Nombre: ");
                    String n = scanner.next();
                    c1.addNombre(n);
                    System.out.println("Apellido paterno: ");
                    String aP = scanner.next();
                    c1.addApaterno(aP);
                    System.out.println("Apellido materno: ");
                    String aM = scanner.next();
                    c1.addAmaterno(aM);
                    System.out.println("Anio de nacimiento: ");
                    String aN = scanner.next();
                    c1.addAnio_nacimiento(aN);
                    System.out.println("E-mail: ");
                    String e = scanner.next();
                    c1.addCorreo(e);
                break;
                case 3:
                    
                    for(int i=0; i < c1.getnumNombre(); i++){
                    
                    System.out.println("Nombre: "+c1.nombre[i]);
                    System.out.println("Apellido Paterno:  "+c1.a_paterno[i]);
                    System.out.println("Apellido Materno:  "+c1.a_materno[i]);
                    System.out.println("Anio de Nacimiento:  "+c1.anio_nacimiento[i]);
                    System.out.println("Email:  "+c1.correo[i]);
                    }

                break;
                case 4:
                    System.out.println("Total de estudiantes: "+c1.getnumNombre());

                break;
                case 5:    
                    System.out.println("Ingrese un nombre de la persona que desea eliminar: ");
                    String del = scanner.next();
                    
                    for (int no=0;no<c1.numNombre;no++){
                        if(c1.nombre[no].equals(del)){
                    System.out.println("¿Esta seguro? Oprima el numero de opcion deseada\n1.-si\n2.-no");
                    int yn = scanner.nextInt();
                    if (yn==1){
                        c1.removeNombre(del);
                        c1.removeApaterno(del);
                        c1.removeAmaterno(del);
                        c1.removeAnio_nacimiento(del);
                        c1.removeCorreos(del);
                        System.out.println("Dato eliminado");
                    }else{
                        System.out.println("No elimino nada");
                    }
                }else{
                    System.out.println("Alumno no registrado");

                }
            }

                
                break;
                    
                default: System.out.println("Bye");
                break;
            }
    }
    }
}