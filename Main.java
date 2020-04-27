public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Towers of Hanoi.");
        int numDisks = UI.userInput();
        Algorithm.initCol1(numDisks);
        System.out.println("\n\n\n\n");

        //Algorithm.loopAlgorithm(numDisks);

        Algorithm.recurAlgorithm(numDisks);
        Algorithm.printRecurAlgorithm();
    }
}