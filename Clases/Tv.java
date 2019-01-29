
public class Tv{

private int channel;
private int volumeLevel;
private boolean on;

public int getChannel() {
    return channel;    
}
public int getVolumeLevel() {
    return volumeLevel;
    
}
public boolean getOn() {
    return on;
    
}



public void turnOn(){
    on = true;
}
public void turnOff(){
    on = false;
}
public void setChannel(int newChannel){
    if (on && newChannel>=1 && newChannel<=120)
    {channel=newChannel;}
    else{
        System.out.println("Canal Incorrecto");
    }
}
public void setVolume(int newVolumeLevel){
    if (on && newVolumeLevel>=1 && volumeLevel<=7){
        volumeLevel= newVolumeLevel;}
    else {System.out.println("Volumen Excedido");}
}
public void volumeUp(){
    //volumeLevel=volumeLevel+1;
    if(on && volumeLevel<7)
    volumeLevel++;
}
public void volumeDown(){
    if(on && volumeLevel>1)
    //volumeLevel=volumeLevel-1;
    volumeLevel--;

}
public void channelUp(){
    if(on && channel<120)
    //channel=channel+1;
    channel++;
}
public void channelDown(){
    if(on && channel>1)
    //channel=channel-1;
    channel--;

}

public static void main(String[] args) {
    Tv sony = new Tv();
  
  sony.turnOn();
  sony.setChannel(70);  
  sony.setVolume(7);
    
    System.out.println("the tv is "+sony.getOn()+
                        " the channel is "+sony.getChannel()+
                        " the volume is "+sony.getVolumeLevel() );

                        
    sony.volumeDown();
    System.out.println (sony.getVolumeLevel());
    sony.volumeDown();
    System.out.println (sony.getVolumeLevel());
    sony.volumeDown();
    System.out.println (sony.getVolumeLevel());
    sony.volumeDown();
    System.out.println (sony.getVolumeLevel());
    sony.volumeDown();
    System.out.println (sony.getVolumeLevel());
    sony.volumeDown();
    System.out.println (sony.getVolumeLevel());
    sony.volumeDown();
    System.out.println (sony.getVolumeLevel());
sony.turnOff();
}



}