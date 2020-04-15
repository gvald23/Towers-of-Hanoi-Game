import java.util.ArrayList;
public class Algorithm{
    private static ArrayList<Integer> col1 = new ArrayList<Integer>();
    private static ArrayList<Integer> col2 = new ArrayList<Integer>();
    private static ArrayList<Integer> col3 = new ArrayList<Integer>();
    
    public static void initCol1(int numDisks){
        for (int i = numDisks; i > 0; i--){ //initializing the first "column"
            col1.add(i);
        }


    }
}