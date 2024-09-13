import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }

    public String getUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public void printGreeting(String userName) {
        System.out.println("Hello, " + userName + "!");
    }

    public void printInstructions() {
        System.out.println("In order to play this game you need to enter the required words into the console ");
    }
  
    public void doMadlib(){


        String verb;
        String noun;
        String adverb;
        String pronoun;
        String verb2;
        String noun2;
        String adverb2;
        String pronoun2;
        String ufcFighter;
        String ufcFighter2;
        Scanner input = new Scanner(System.in);
   
        System.out.println("Enter a verb");
        verb = input.nextLine();
        System.out.println("Enter a noun:");
        noun = input.nextLine();
        System.out.println("Enter a adverb:");
        adverb = input.nextLine();
        System.out.println("Enter a pronoun:");
        pronoun = input.nextLine();

        System.out.println("Enter a verb");
        verb2 = input.nextLine();
        System.out.println("Enter a noun:");
        noun2 = input.nextLine();
        System.out.println("Enter a adverb:");
        adverb2 = input.nextLine();
        System.out.println("Enter a pronoun:");
        pronoun2 = input.nextLine();
        System.out.println("Enter a UFC Fighter:");
        ufcFighter = input.nextLine();
        System.out.println("Enter another UFC Fighter:");
        ufcFighter2 = input.nextLine();

        System.out.println("One day, " + ufcFighter + " decided to " + verb + " with a " + noun + " " + adverb + ". While " + pronoun + " was doing this, " + ufcFighter2 + " came by and decided to " + verb2 + " over the " + noun2 + " " + adverb2 + ". After this, " + pronoun2 + " cheered for both fighters as they prepared for their next fight.");
   
    }
    
    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 
    
    
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
