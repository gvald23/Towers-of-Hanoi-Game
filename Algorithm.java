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

    //always move in this order(either way):
    //col1-col2, col1-col3, col2-col3 FOR EVEN DISKS
    //col1-col3, col1-col2, col2-col3 FOR ODD DISKS
    public static void loopAlgorithm(int numDisks){
        if (numDisks%2 == 0){ //even number of disks
            while (!col1.isEmpty() || !col2.isEmpty()){
                //col1-col2
                if (col2.isEmpty()){ //col1 to col2
                    col2.add(col1.get(col1.size()-1));
                    col1.remove(col1.size()-1);
                }
                else if (col1.isEmpty()){ //col2 to col1
                    col1.add(col2.get(col2.size()-1));
                    col2.remove(col2.size()-1);
                }
                else{
                    if (col1.get(col1.size()-1) < col2.get(col2.size()-1)){
                        col2.add(col1.get(col1.size()-1));
                        col1.remove(col1.size()-1);
                    }
                    else if (col1.get(col1.size()-1) > col2.get(col2.size()-1)){
                        col1.add(col2.get(col2.size()-1));
                        col2.remove(col2.size()-1);
                    }
                }
                
                
                //col1-col3
                if (col3.isEmpty()){ //col1 to col3
                    col3.add(col1.get(col1.size()-1));
                    col1.remove(col1.size()-1);
                }
                else if (col1.isEmpty()){ //col3 to col1
                    col1.add(col3.get(col3.size()-1));
                    col3.remove(col3.size()-1);
                }
                else{
                    if (col1.get(col1.size()-1) < col3.get(col3.size()-1)){
                        col3.add(col1.get(col1.size()-1));
                        col1.remove(col1.size()-1); 
                    }
                    else if (col1.get(col1.size()-1) > col3.get(col3.size()-1)){
                        col1.add(col3.get(col3.size()-1));
                        col3.remove(col3.size()-1);
                    }
                }

               
                //col2-col3
                if (col3.isEmpty()){ //col2 to col3
                    col3.add(col2.get(col2.size()-1));
                    col2.remove(col2.size()-1);
                }
                else if (col2.isEmpty()){ //col3 to col2
                    col2.add(col3.get(col3.size()-1));
                    col3.remove(col3.size()-1);
                }
                else{
                    if (col2.get(col2.size()-1) < col3.get(col3.size()-1)){
                        col3.add(col2.get(col2.size()-1));
                        col2.remove(col2.size()-1);
                    }
                    else if (col2.get(col2.size()-1) > col3.get(col3.size()-1)){
                        col2.add(col3.get(col3.size()-1));
                        col3.remove(col3.size()-1);
                    }
                }
            }
        }

        else{ //odd number of disks
            while (!col1.isEmpty() || !col2.isEmpty()){
                //col1-col3
                if (col3.isEmpty()){ //col1 to col3
                    col3.add(col1.get(col1.size()-1));
                    col1.remove(col1.size()-1);
                }
                else if (col1.isEmpty()){ //col3 to col1
                    col1.add(col3.get(col3.size()-1));
                    col3.remove(col3.size()-1);
                }
                else{
                    if (col1.get(col1.size()-1) < col3.get(col3.size()-1)){
                        col3.add(col1.get(col1.size()-1));
                        col1.remove(col1.size()-1); 
                    }
                    else if (col1.get(col1.size()-1) > col3.get(col3.size()-1)){
                        col1.add(col3.get(col3.size()-1));
                        col3.remove(col3.size()-1);
                    }
                }

                //in an odd number of disks, the last move is always a col1-col3, so the col1-col2
                //if statement would produce an IndexOutOfBoundsException. This prevents that.
                if (col1.isEmpty() && col2.isEmpty()){
                    break;
                }

                //col1-col2
                if (col2.isEmpty()){ //col1 to col2
                    col2.add(col1.get(col1.size()-1));
                    col1.remove(col1.size()-1);
                }
                else if (col1.isEmpty()){ //col2 to col1
                    col1.add(col2.get(col2.size()-1));
                    col2.remove(col2.size()-1);
                }
                else{
                    if (col1.get(col1.size()-1) < col2.get(col2.size()-1)){
                        col2.add(col1.get(col1.size()-1));
                        col1.remove(col1.size()-1);
                    }
                    else if (col1.get(col1.size()-1) > col2.get(col2.size()-1)){
                        col1.add(col2.get(col2.size()-1));
                        col2.remove(col2.size()-1);
                    }
                }

                //col2-col3
                if (col3.isEmpty()){ //col2 to col3
                    col3.add(col2.get(col2.size()-1));
                    col2.remove(col2.size()-1);
                }
                else if (col2.isEmpty()){ //col3 to col2
                    col2.add(col3.get(col3.size()-1));
                    col3.remove(col3.size()-1);
                }
                else{
                    if (col2.get(col2.size()-1) < col3.get(col3.size()-1)){
                        col3.add(col2.get(col2.size()-1));
                        col2.remove(col2.size()-1);
                    }
                    else if (col2.get(col2.size()-1) > col3.get(col3.size()-1)){
                        col2.add(col3.get(col3.size()-1));
                        col3.remove(col3.size()-1);
                    }
                }
            }
        }


        //printing final columns
        for (int i = col3.size()-1; i >= 0; i--){
            System.out.println("\t\t" + " " + col3.get(i));
        }
        System.out.println("---\t---\t---");
    }
}