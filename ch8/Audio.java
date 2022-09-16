package ch8;

public class Audio implements RemoteControl{
    //필드
    private int volume;

    //turnOn() 추상 메소드의 실제 메소드
    public void turnOn(){
        System.out.println("Audio On");
    }
    //turnOff() 추상 메소드의 실제 메소드
    public void turnOff(){
        System.out.println("Audio Off");
    }
    //setVolume() 추상 메소드의 실제 메소드
    public void setVolume(int Volume){
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume< RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;

        }else{
            this.volume = volume;
        }
        System.out.println("Audio volume : " + volume);
    }
}
