public class App {
    public static void main(String[] args) throws Exception {

        // int myInt = 1000;
        // System.out.println(myInt);

        // if (myInt == 100) {
        //     System.out.println("Hello, World!");

        // }else{
        //     System.out.println("Hello, Java");
        // }

        // // This is the use of if statements
        // int a = 20;
        // int b = 30;

        // boolean result = b>a;

        // int sum = a+b;

        // if (result) {
        //     System.out.println("this is another possibility in java and the answer is :" + sum);
        // }else{
        //     System.out.println("Still works but not what i expected and the answer is :" + sum);
        // }

        // // this is the use of while statements

        // int i = 0;
        // while (i < 10) {
        //     System.out.println("count:" + i);
        //     i++;
        // }

        int num1 = 1;
        int num2 = 2;
        String sign = "*"; // Use String instead of char

        if (sign.equals("+")) {
            int answer = num1 + num2;
            System.out.println(answer);
        } else if (sign.equals("-")) {
            int answer = num1 - num2;
            System.out.println(answer);
        } else if (sign.equals("*")) {
            int answer = num1 * num2;
            System.out.println(answer);
        } else if (sign.equals("/")) {
            int answer = num1 / num2;
            System.out.println(answer);
        } else {
            System.out.println("No such input");
        }
        // assignment: code a calculator that add sub mul div 
    }
}
