import java.util.Date;
public class GeometricObject{

    private String color;
    private boolean filled;
    private Date dateCreated;
    
    
        public String getColor() {
            return color;
        }
        
        public void setColor(String color) {
            this.color = color;
        }
        public boolean getFilled() {
			return filled;
		}

		public void setFilled(boolean filled) {
			this.filled = filled;
		}
        public GeometricObject(){}
        public GeometricObject(String color,boolean filled){
            this.filled = filled;
            this.color = color;
        }
   
        
        public Boolean isFilled() {  
            
            return  false;  
        }
        
        public Date getDateCreated(){
            Date Fecha =new Date();
            return Fecha;
        }
        
        public String toString(){
            return "Color: "+color+
                                "\nFilled: "+filled;

        }

    
       
        public static void main(String[] args) {
            
            Circle1 circ1 = new Circle1();
            Circle1 circ2 = new Circle1(10.2);
            Circle1 circ3 = new Circle1(10.2,"blue",true);
        
            Rectangle1 rec1 = new Rectangle1();
            Rectangle1 rec2 = new Rectangle1(21.3,7.2);
            Rectangle1 rec3 = new Rectangle1(21.3,7.2,"green",true);
        
        }
    }