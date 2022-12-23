package java_2022.ch9;

public class Window {
    Button2 button1 = new Button2();
    Button2 button2 = new Button2();

    //필드 초기값으로 대입
    Button2.OnClickListener listener = new Button2.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("Calling");
        }
    };

    Window(){
        button1.setOnClickListener(listener);
        button2.setOnClickListener(new Button2.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Send message");
            }
        });
    }
}
