import java.util.Scanner;
class Calificaciones{

    private double promedio;
    private int numCalificaciones;
    public double getPromedio() {
        return promedio;
    }

  
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    
    public int getNumCalificaciones() {
        return numCalificaciones;
    }
    
    public void setNumCalificaciones(int numCalificaciones) {
        this.numCalificaciones = numCalificaciones;
    }
    
    public void calcularPromedio(double sumatoria){
        promedio = sumatoria/numCalificaciones;
    }
    public static void main(String[] args) {
        
        Calificaciones c = new Calificaciones();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Cuantas calificaciones vas a promediar: ");
        int n =scanner.nextInt();
        c.setNumCalificaciones(n);
        
        double sumatoria=0;
        for(int i=0;i<c.getNumCalificaciones();i++){
            System.out.println("Ingresa Calificacion "+(i+1));
            double aux= scanner.nextDouble();
            sumatoria= sumatoria +aux;
        }

        c.calcularPromedio(sumatoria);
        System.out.println("El promedio es: "+c.getPromedio());
    }

}