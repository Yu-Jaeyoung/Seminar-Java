package ch8;

public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;

    // RemoteControl의 추상 메소드에 대한 실체 메소드
    public void turnOn(){
        System.out.println("Tv On");
    }

    public void turnOff(){
        System.out.println("Tv Off");
    }
    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume< RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Tv volume : " + volume);
    }
    // Searchable의 추상 메소드에 대한 실체 메소드
    public void search(String url){
        System.out.println(url + "searching... ");
    }
}
