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
        String[] kantoCorrect = {"Slowpoke", "Blastoise", "Gyarados"};
        String[] sinnohCorrect = {"Manaphy", "Honchkrow", "Monferno"};
        
        ArrayList<Score> leaderboard = new ArrayList<Score>();
        
String quit = "Y";
while(quit.equals("Y")){

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
            System.out.println("Before we begin, enter your name!");
            String nameEntered = keyboard.nextLine();
    System.out.println("Choose a region to be quizzed on \n (Kanto or Sinnoh)");
            String response = keyboard.nextLine().toLowerCase();


            if (response.equals("kanto")) {
                System.out.println("Who's that Pokemon?! (1/3)");
                imageDisplayer.DisplayPic("C:\\VSCODE\\PokemonGuessingGame\\slowpoke.png");
                System.out.println(myMaker.printAnswers(kantoQ1));
                String Kchoice1 = keyboard.nextLine();
                if(myMaker.checkAnswer(kantoCorrect, Kchoice1)){
                    System.out.println("Correct! Next Question...");
                    kantoCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }


                System.out.println("Who's that Pokemon?! (2/3)");
                imageDisplayer.DisplayPic("C:\\VSCODE\\PokemonGuessingGame\\blastoise.png");
                System.out.println(myMaker.printAnswers(kantoQ2));
                String Kchoice2 = keyboard.nextLine();
                if(myMaker.checkAnswer(kantoCorrect, Kchoice2)){
                    System.out.println("Correct! Next Question...");
                    kantoCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }
                    System.out.println("Who's that Pokemon?! (3/3)");
                    imageDisplayer.DisplayPic("C:\\VSCODE\\PokemonGuessingGame\\gyarados.png");
                    System.out.println(myMaker.printAnswers(kantoQ3));
                    String Kchoice3 = keyboard.nextLine();
                    if(myMaker.checkAnswer(kantoCorrect, Kchoice3)){
                        kantoCounter++;
                        System.out.println("Correct! You got " + kantoCounter + "/3 Questions Right!");
                    }
                    else{
                        System.out.println("Incorrect! You got " + kantoCounter + "/3 Questions Right!");
                    }
                    Score myScore = new Score(kantoCounter, nameEntered);
                    leaderboard.add(myScore);
                
            } //if statement for starting kanto guesser
     if (response.equals("sinnoh")) {
        System.out.println("Who's that Pokemon?! (1/3)");
                imageDisplayer.DisplayPic("C:\\VSCODE\\PokemonGuessingGame\\manaphy.png");
                System.out.println(myMaker.printAnswers(sinnohQ1));
                String Schoice1 = keyboard.nextLine();
                if(myMaker.checkAnswer(sinnohCorrect, Schoice1)){
                    System.out.println("Correct! Next Question...");
                    sinnohCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }

        System.out.println("Who's that Pokemon?! (2/3)");
                imageDisplayer.DisplayPic("C:\\VSCODE\\PokemonGuessingGame\\honchkrow.png");
                System.out.println(myMaker.printAnswers(sinnohQ2));
                String Schoice2 = keyboard.nextLine();
                if(myMaker.checkAnswer(sinnohCorrect, Schoice2)){
                    System.out.println("Correct! Next Question...");
                    sinnohCounter++;
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Who's that Pokemon?! (3/3)");
                imageDisplayer.DisplayPic("C:\\VSCODE\\PokemonGuessingGame\\monferno.png");
                System.out.println(myMaker.printAnswers(sinnohQ3));
                String Schoice3 = keyboard.nextLine();
                if(myMaker.checkAnswer(sinnohCorrect, Schoice3)){
                    sinnohCounter++;
                    System.out.println("Correct! You got " + sinnohCounter + "/3 Questions Right!");
                }
                else{
                    System.out.println("Incorrect! You got " + sinnohCounter + "/3 Questions Right!");
                }
                Score myScore = new Score(sinnohCounter, nameEntered);
                    leaderboard.add(myScore);
     }// if statement for Sinnoh
      
}
System.out.println("Would you like to to test your friends? (Y/N)");
quit = keyboard.nextLine();

}//while loop match
System.out.println("Leaderboard! \nName: Correct Answers");
Collections.sort(leaderboard, new Comparator<Score> () {
    public int compare(Score s1, Score s2){
        return s2.getPoints() - s1.getPoints();
    } 
    //sorting through list background: https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
});
for(Score score: leaderboard){
    System.out.println(score.getName() + ": " + score.getPoints());
}

        }
        
}
