import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String[][] faceFeatures = new String[6][14];
        JackOLantern userJOL = new JackOLantern(faceFeatures);

        userJOL.fill("O");
        userJOL.edit(" ",0,0);
        userJOL.edit(" ",0,1);
        userJOL.edit(" ",1,0);
        userJOL.edit(" ", 5,13);
        System.out.println(userJOL.toString());
    }
}
