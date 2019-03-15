import org.w3c.dom.css.Rect;

class Rectangulo{

//atribut
double largo;
double ancho;

 


//constructores

Rectangulo(double ancho,double largo){
    this.ancho=ancho;
    this.largo=largo;
}
Rectangulo (){}

Rectangulo(double ancho){

}
Rectangulo(int largo){

}

//metodos

    public double getLargo() {
        return largo;
    }

  
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

   
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea(){

        return largo*ancho;

    }

public static void main(String[] args) {
    Rectangulo rec1=new Rectangulo(10,20);
    //rec1.setAncho(10);
   // rec1.setLargo(20);

    System.out.println("El area es: "+rec1.calcularArea());
}



}