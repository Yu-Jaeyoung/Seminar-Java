package java_2022.ch7;

public class DmbCellPhone extends CellPhone {
    //필드
    int chanel;

    //생성자
    DmbCellPhone(String model, String color, int chanel) {
        this.model = model;
        this.color = color;
        this.chanel = chanel;
    }

    //메소드
    void turnOnDmb() {
        System.out.println(" Searching " + chanel + " channel......");
    }

    void changeChannelDmb(int chanel) {
        this.chanel = chanel;
        System.out.println("Change channel to " + chanel);
    }

    void turnOffDmb() {
        System.out.println("Stop searching");
    }
}
