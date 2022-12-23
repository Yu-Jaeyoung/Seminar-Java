package java_2022.ch9;

public class Button {
    OnClickListener listener;

    void setOnclickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }

    interface OnClickListener{
        void onClick();
    }
}
