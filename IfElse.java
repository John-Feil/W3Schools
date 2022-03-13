public class IfElse {
    public static void main(String[] args) {
        if (17 > 16){
            System.out.println("20 is greater than 18");
        }
        int x = 17;
        int y = 16;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        int time = 20;
        if (time < 18) {
            System.out.println("Good Day.");
        }
        else {
            System.out.println("Good evening");
        }
        if (time < 10) {
            System.out.println("Good morning.");
        }
        else if (time < 20){
            System.out.println("Good day.");
        }
        else {
            System.out.println("Good evening");
        }
    }
}
