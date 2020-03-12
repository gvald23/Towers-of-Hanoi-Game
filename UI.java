import java.util.Scanner;
public class UI{
    public static void UserInput(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Number of Disks: ");
        int numDisks = myScan.nextInt();
        myScan.close();
        //call Algorithm class; pass in numDisks
    }
}