package ch15;


/*push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Homework {

    private static int max;
    private static String[] token;
    private static String lineString;

    private static Stack<Integer> stack = new Stack<>();


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        max = Integer.parseInt(br.readLine());

        for (int i = 0; i < max; i++) {
            lineString = br.readLine();
            token = lineString.split(" ",2);
            makeStack();
        }
    }

    private static void makeStack() {
        if (token[0].equals("push")) {
            stack.push(Integer.parseInt(token[1]));
        } else if (token[0].equals("pop")) {
            if (stack.isEmpty()) {
                System.out.println("-1");
                return;
            }
            System.out.println(stack.pop());
        } else if (token[0].equals("size")) {
            System.out.println(stack.size());
        } else if (token[0].equals("empty")) {
            if (stack.empty())
                System.out.println("1");
            else
                System.out.println("0");
        } else if(token[0].equals("top")){
            if (stack.isEmpty()) {
                System.out.println("-1");
                return;
            }
            System.out.println(stack.peek());
        } else {
            return;
        }
    }
}
