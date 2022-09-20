package ch9;

public class Button2 {
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}
