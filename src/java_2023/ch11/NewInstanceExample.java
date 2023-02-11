package java_2023.ch11;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            //Class clazz = Class.forName("java_2023.ch11.SendAction");
            Class clazz = Class.forName("java_2023.ch11.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
