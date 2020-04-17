public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Towers of Hanoi.");
        int numDisks = UI.userInput();
        Algorithm.initCol1(numDisks);
        //Algorithm.loopAlgorithm(numDisks);
    }
}