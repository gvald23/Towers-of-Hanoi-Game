import java.util.Scanner;
public class UI{
    public static void userInput(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Number of Disks: ");
        int numDisks = myScan.nextInt();
        myScan.close();
        Algorithm.game(numDisks);
    }
}