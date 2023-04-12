import java.io.IOException;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        String[] kantoQ1 = {"Vulpix","Slowpoke","Geodude","Gengar"};
        String[] kantoQ2 = {"Metapod", "Ditto", "Dragonite", "Blastoise"};
        String[] kantoQ3 = {"Gyarados", "Zapdos", "Articuno", "Mewtwo"};
        String[] sinnohQ1 = {"Manaphy", "Uxie", "Mesprit", "Azelf"};
        String [] sinnohQ2 = {"Mothim", "Beautifly", "Crowbat", "Honchkrow"};
        String[] sinnohQ3 = {"Monferno", "Golduck", "Chimchar", "Abra"};
        int kantoCounter = 0;
        int sinnohCounter = 0;
        Scanner keyboard = new Scanner(System.in);
        quizMaker myMaker = new quizMaker();
        DisplayImage imageDisplayer = new DisplayImage();
        String enterkey = "Welcome to the pokemon quiz game, where we test if you are a true pokemon fan or not! \n (press enter to continue)";
        System.out.println(enterkey);
        enterkey = keyboard.nextLine();
        System.out.print(enterkey);
        if (enterkey.equals("")) {
    System.out.println("To start off, choose a region to be quizzed on \n (Kanto or Sinnoh)");
            String response = keyboard.nextLine().toLowerCase();


            if (response.equals("kanto")) {
                System.out.println("Who's that Pokemon?! (1/3)");
                imageDisplayer.DisplayPic("C:\\Sandul\\Coding\\PokemonGuessingGame\\slowpoke.png");
                System.out.println(myMaker.printAnswers(kantoQ1));
                String Kchoice1 = keyboard.nextLine();
                if(myMaker.checkAnswer(kantoQ1, Kchoice1, "slowpoke")){
                    System.out.println("Correct! Next Question...");
                    kantoCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }


                System.out.println("Who's that Pokemon?! (2/3)");
                imageDisplayer.DisplayPic("C:\\Sandul\\Coding\\PokemonGuessingGame\\blastoise.png");
                System.out.println(myMaker.printAnswers(kantoQ2));
                String Kchoice2 = keyboard.nextLine();
                if(myMaker.checkAnswer(kantoQ2, Kchoice2, "blastoise")){
                    System.out.println("Correct! Next Question...");
                    kantoCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }
                    System.out.println("Who's that Pokemon?! (3/3)");
                    imageDisplayer.DisplayPic("C:\\Sandul\\Coding\\PokemonGuessingGame\\gyarados.png");
                    System.out.println(myMaker.printAnswers(kantoQ3));
                    String Kchoice3 = keyboard.nextLine();
                    if(myMaker.checkAnswer(kantoQ3, Kchoice3, "gyarados")){
                        kantoCounter++;
                        System.out.println("Correct! You got " + kantoCounter + "/3 Questions Right!");
                    }
                    else{
                        System.out.println("Incorrect! You got " + kantoCounter + "/3 Questions Right!");
                    }
            } //if statement for starting kanto guesser
     if (response.equals("sinnoh")) {
        System.out.println("Who's that Pokemon?! (1/3)");
                imageDisplayer.DisplayPic("C:\\Sandul\\Coding\\PokemonGuessingGame\\manaphy.png");
                System.out.println(myMaker.printAnswers(sinnohQ1));
                String Schoice1 = keyboard.nextLine();
                if(myMaker.checkAnswer(sinnohQ1, Schoice1, "manaphy")){
                    System.out.println("Correct! Next Question...");
                    sinnohCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }

        System.out.println("Who's that Pokemon?! (2/3)");
                imageDisplayer.DisplayPic("C:\\Sandul\\Coding\\PokemonGuessingGame\\honchkrow.png");
                System.out.println(myMaker.printAnswers(sinnohQ2));
                String Schoice2 = keyboard.nextLine();
                if(myMaker.checkAnswer(sinnohQ2, Schoice2, "honchkrow")){
                    System.out.println("Correct! Next Question...");
                    sinnohCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Who's that Pokemon?! (3/3)");
                imageDisplayer.DisplayPic("C:\\Sandul\\Coding\\PokemonGuessingGame\\monferno.png");
                System.out.println(myMaker.printAnswers(sinnohQ3));
                String Schoice3 = keyboard.nextLine();
                if(myMaker.checkAnswer(sinnohQ3, Schoice3, "monferno")){
                    sinnohCounter++;
                    System.out.println("Correct! You got " + sinnohCounter + "/3 Questions Right!");
                }
                else{
                    System.out.println("Incorrect! You got " + sinnohCounter + "/3 Questions Right!");
                }
     }
     else{
        System.out.println("Invalid response, please restart the game and try again");
     } // if statement for Sinnoh
}
        }
}
