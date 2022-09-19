package ch9;

public class CallListener implements Button.OnClickListener{
    @Override
    public void onClick(){
        System.out.println("Calling");
    }
}
