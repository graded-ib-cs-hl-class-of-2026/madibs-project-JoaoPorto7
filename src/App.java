import java.util.Random;
import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String playAgain;
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        do {   /*rafa helped me with this */
            doMadlib();
            playAgain = restartPlay();
        } while (playAgain.equalsIgnoreCase("yes"));
    }

    /*This code asks the player for their name */
    public String getUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
     /* This code takes the previously scannes name and greets the user */
    public void printGreeting(String userName) {
        System.out.println("Hello, " + userName + "!");
    }
     /* This code prints instructions for the user */
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
        String player1;
        String player2;
        Scanner input = new Scanner(System.in);
        /*This code creates a random number from 1 to 3 and saves it to int madlib */
        /*https://stackoverflow.com/questions/61686432/java-random-nextint-behavior */
        Random random = new Random();
        int madLib = random.nextInt(3) + 1;
        int sport2 = random.nextInt(2) + 1; 

        System.out.println("Choose a category: 'UFC', 'Football', or 'Basketball'");
        String category = input.nextLine().toLowerCase(); 
   
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
        System.out.println("Enter a " + category + " player:");
        player1 = input.nextLine();
        System.out.println("Enter another " + category +" player");
        player2 = input.nextLine();
       
      /*this code uses the string to choose a madlib */
        if (category.equals("ufc")) {
        if (madLib == 1) {
            System.out.println("One day, " + player1 + " decided to " + verb + " with a " + noun + " " + adverb + ". While " + pronoun + " was doing this, " + player2 + " came by and decided to " + verb2 + " over the " + noun2 + " " + adverb2 + ". After this, " + pronoun2 + " cheered for both fighters as they prepared for their next fight.");
        } else if (madLib == 2) {
            System.out.println(player1 + " was known for always being ready to " + verb + " with any " + noun + ". One day, " + pronoun + " woke up and felt the urge to " + verb + " " + adverb + ". Out of nowhere, " + player2 + " appeared and decided to " + verb2 + " around the " + noun2 + " " + adverb2 + ". " + pronoun2 + " watched in awe as both fighters showed off their skills, preparing for an epic battle.");
        } else if (madLib == 3) {
            System.out.println("In a strange turn of events, " + player1 + " found a magical " + noun + " and decided to " + verb + " with it " + adverb + ". Just then, " + player2 + " appeared, ready to " + verb2 + " over a mysterious " + noun2 + ". As they faced off, " + pronoun + " and " + pronoun2 + " realized this was no ordinary day. The crowd cheered as they both prepared for the most unexpected fight of their lives.");
        } else {
            System.out.println("Invalid madLib value.");
        }
    }
    /*https://docs.google.com/document/d/1P2uIsaQG6yH7mb1tZmOn3PCyceUZPnUMKNZLBP4jjPk/edit?usp=sharing */
    else if (category.equals("football")) {
        if (sport2 == 1) {
            System.out.println("During the big game, " + player1 + " ran down the field and decided to " + verb + " with a " + noun + " " + adverb + ". " + player2 + " quickly responded by " + verb2 + " over the " + noun2 + ". The crowd went wild as " + pronoun2 + " watched in disbelief.");
        } else if (sport2 == 2) {
            System.out.println(player1 + " took the ball and started to " + verb + " towards the goal. " + player2 + " tried to stop them, but " + pronoun + " managed to " + verb2 + " past " + player2 + " and scored! " + pronoun2 + " couldn't believe what had just happened.");
        }
    }
    else if (category.equals("basketball")) {
        if (sport2 == 1) {
            System.out.println("With seconds left on the clock, " + player1 + " dribbled the ball and decided to " + verb + " with a " + noun + " " + adverb + ". " + player2 + " jumped in, attempting to " + verb2 + " the ball over the " + noun2 + ". It was a nail-biting finish as " + pronoun2 + " waited for the buzzer.");
        } else if (sport2 == 2) {
            System.out.println("In an intense match, " + player1 + " grabbed the ball and started to " + verb + " towards the basket. " + player2 + " blocked the way, but " + pronoun + " managed to " + verb2 + " past " + player2 + " and scored an incredible dunk! The crowd, including " + pronoun2 + ", erupted with excitement.");
        }
    } else {
        System.out.println("Invalid category. Please choose 'UFC', 'Football', or 'Basketball'.");
    }




    }

    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 
    
     public String restartPlay() { /*method to get users input if he wants to play again */
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play again? (yes/no): ");
        return input.nextLine();
     }
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
