package AmarpalAmrith.JaveMiniProblems;

public class HowManyRabbits {
    public static void main(String[] args) {

        System.out.println("Hi, Welcome to How many Rabbits!");
        Utilities.msgPrompt("How many Fibonnacci numbers would you like to get?");
        int userInput = Utilities.condNo(1);
        long t1 = 0, t2 = 1;

        for (int i = 0; i <= userInput; i++) {

            if (userInput == 0) {
                System.out.print(t1);
            } else if (userInput == 1) {
                System.out.print(t1 + " + " + t2 + " + ");
            } else {
                if (i != userInput){
                    System.out.print(t1 + " + ");
                } else {
                    System.out.println(t1);
                }
                long sum =  t1 + t2;
                t1 = t2;
                t2 = sum;

            }
        }
    }
}
