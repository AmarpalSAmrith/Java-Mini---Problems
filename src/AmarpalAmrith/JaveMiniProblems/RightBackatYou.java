package AmarpalAmrith.JaveMiniProblems;

import java.util.ArrayList;
import java.util.List;

public class RightBackatYou {
    public static void main(String[] args) {
        System.out.println("Hi, welcome to Right back at you!");
        List <Integer> myintList = new ArrayList<>();
        for (int i = 1; ;i++){
            Utilities.msgPrompt("Please enter number " + i);
            int userInput = Utilities.condNo(1);
            if (userInput != -1) {
                myintList.add(userInput);
            } else {
                break;
            }
        }
        System.out.println("The numbers are:");

        for (int i = myintList.size() - 1; i >= 0 ; i--) {
            System.out.println(myintList.get(i));
        }

    }
}
