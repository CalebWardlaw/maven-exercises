import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MainMaven {

    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your full name?\n");
        String userString = userInput.nextLine();

        System.out.println("Contains Digits:" + StringUtils.isNumeric(userString));
        System.out.println("Swap Case: " + StringUtils.swapCase(userString));
        System.out.println("Reverse: " + StringUtils.reverse(userString));
    }

}
