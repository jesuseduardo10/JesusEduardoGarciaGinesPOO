public class Annio{

    private int dia;
    private int mes;
    private int annnnio;


    public int getDia() {
        return dia;
    }

   
    public void setDia(int dia) {
        this.dia = dia;
    }

  
    public int getMes() {
        return mes;
    }

   
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnnnnio() {
        return annnnio;
    }

   
    public void setAnnnnio(int annnnio) {
        this.annnnio = annnnio;
    }

    public String toString(){
        return dia+"/"+mes+"/"+annnnio;
    }

    public static void main(String[] args) {
        Annio f=new Annio();
        f.setDia(27);
        f.setMes(01);
        f.setAnnnnio(1990);
        System.out.println(f.toString());
    
        if (f.getAnnnnio()>=2000)
        System.out.println("Milenial");
        else
        System.out.println("Chavoruco");
    }
        


}