public class Rectangle{
    //Atributos
    
    double area,length,perimeter,width;
    
    //Metodos
   
    public void calcArea () {
        area = (length * width);
    }
    public void calcPerimeter(){
        perimeter = ((length + width)*(2)); 
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setLength(double length) {    
    }
    public void setWidth(double width) {  }
    public static void main(String[] args) {
        
    Rectangle rectangle1= new Rectangle();
    Rectangle rectangle2= new Rectangle();
    Rectangle rectangle3= new Rectangle();
    rectangle1.width=4.1d;
    rectangle2.width=9d;
    rectangle3.width=12d;
    rectangle1.length=6.2d;
    rectangle2.length=53d;
    rectangle3.length=23d;

        rectangle1.calcArea();
        rectangle2.calcArea();
        rectangle3.calcArea();
        System.out.println("El area de  rectangle1 es: "+ rectangle1.getArea());
        System.out.println("El area de  rectangle2 es: "+ rectangle2.getArea());
        System.out.println("El area de  rectangle3 es: "+ rectangle3.getArea());
        rectangle1.calcPerimeter();
        rectangle2.calcPerimeter();
        rectangle3.calcPerimeter();

        System.out.println("El perimetro de  rectangle1 es: "+ rectangle1.getPerimeter());
        System.out.println("El perimetro de  rectangle2 es: "+ rectangle2.getPerimeter());
        System.out.println("El perimetro de  rectangle3 es: "+ rectangle3.getPerimeter());
    }
     
        
    
}