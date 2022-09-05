package ch7;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        //DmbCellPhone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("java-phone", "black", 10);

        //CellPhone으로 부터 상속받은 필드
        System.out.println("Model : " + dmbCellPhone.model);
        System.out.println("Color : " + dmbCellPhone.color);

        //DmbCellPhone의 필드
        System.out.println("Channel : " + dmbCellPhone.chanel);

        //CellPhone으로부터 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hello??");
        dmbCellPhone.receiveVoice("Hello, this is java speaking");
        dmbCellPhone.sendVoice("Nice to meet you");
        dmbCellPhone.hangUp();

        //DmbCellPhone의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

    }

}
