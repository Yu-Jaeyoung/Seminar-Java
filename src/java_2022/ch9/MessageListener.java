package java_2022.ch9;

public class MessageListener implements Button.OnClickListener{
    @Override
    public void onClick(){
        System.out.println("Send message");
    }
}
