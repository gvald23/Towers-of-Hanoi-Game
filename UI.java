import java.util.Scanner;
public class UI{
    public static int userInput(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Number of Disks: ");
        int numDisks = myScan.nextInt();
        myScan.close();
        return numDisks;
    }
}