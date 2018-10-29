import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        JackOLantern userJOL = new JackOLantern(new String[8][8]);

        userJOL.fill("O");


        System.out.println(userJOL.toString());
    }
}
