import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    //Regions and pokemon of each corresponding region
    String[] names = { "Kanto", "Sinnoh", "Hoenn" };
    String kantoStarters[] = { "Bulbasaur", "Charmander", "Squirtle" };
    String[] SinnohStarters = { "Turtwig", "Chimchar", "Piplup" };
    String[] HoennStarters = { "Treecko", "Torchic", "Mudkip" };
    try (Scanner keyboard = new Scanner(System.in)) {
        Region myRegion = new Region(names);
        // Kanto myKanto = new Kanto(kantoStarters);
        // Sinnoh mySinnoh = new Sinnoh(SinnohStarters);
        // Hoenn myHoenn = new Hoenn(HoennStarters);
        DisplayImage imageDisplayer = new DisplayImage();
        
        String enterkey = "Welcome to Pokemon\n (press enter to continue if program stops)";
        System.out.println(enterkey);
        enterkey = keyboard.nextLine();
        System.out.print(enterkey);
          //https://stackoverflow.com/questions/18281543/java-using-scanner-enter-
          //key-pressed
      //Choosing region (same process for other regions but with corresponding classes)
      if (enterkey.equals("")) {
      System.out.println("Choose a region to start your journey at!");
      System.out.println(myRegion.printList(names));
      String chooseRegion = keyboard.nextLine();
          if (myRegion.kantoCheck(names, chooseRegion)) {
            System.out.println("you chose Kanto");
            //Choosing starter pokemon (same process for other starter pokemon)
            System.out.println("Now it's time to choose your starter!");
            System.out.println(enterkey);
            enterkey = keyboard.nextLine();
            System.out.print(enterkey);
            System.out.println(myRegion.printList(kantoStarters));
            String KantoResponse = keyboard.nextLine();

            if (myRegion.zerothCheck(kantoStarters, KantoResponse)) {
              System.out.println("Welcome to the team" + " " + KantoResponse + "!");
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\bulb.jpg");
              System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(KantoResponse);
              
              
            }
            if (myRegion.firstCheck(kantoStarters, KantoResponse)) {
              System.out.println("Welcome to the team" + " " + KantoResponse + "!");
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\Charmander.jpg");
              System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(KantoResponse);
              
            }
            if (myRegion.secondCheck(kantoStarters, KantoResponse)) {
              System.out.println("Welcome to the team" + " " + KantoResponse + "!");
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\squirtle.jpg");
              System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(KantoResponse);
            }
          }
            if (myRegion.sinnohCheck(names, chooseRegion)) {

              System.out.println("you chose Sinnoh");
              System.out.println("Now it's time to choose your starter!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              System.out.println(myRegion.printList(SinnohStarters));
              String SinnohResponse = keyboard.nextLine();
              if (myRegion.firstCheck(SinnohStarters, SinnohResponse)) {
                System.out.println("Welcome to the team" + " " + SinnohResponse + "!");
                imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\chim.jpg");
                System.out.println("Now it's time to have a trial battle!");
                System.out.println(enterkey);
                enterkey = keyboard.nextLine();
                System.out.print(enterkey);
                imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
                myRegion.LillipupEnc(SinnohResponse);
                
              }
              if (myRegion.zerothCheck(SinnohStarters, SinnohResponse)) {
                System.out.println("Welcome to the team" + " " + SinnohResponse + "!");
                imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\turt.png");
                
                System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(SinnohResponse);
              }
              if (myRegion.secondCheck(SinnohStarters, SinnohResponse)) {
                System.out.println("Welcome to the team" + " " + SinnohResponse + "!");
                imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\pip.png");
                System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(SinnohResponse);
              }
            }
            if (myRegion.hoennCheck(names, chooseRegion)) {
              System.out.println("you chose Hoenn");
              System.out.println("Now it's time to choose your starter!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              System.out.println(myRegion.printList(HoennStarters));
              String HoennResponse = keyboard.nextLine();   
              if (myRegion.firstCheck(HoennStarters, HoennResponse)){ 
                System.out.println("Welcome to the team" + " " + HoennResponse + "!");
                imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\tor.jpg");
                System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(HoennResponse);
              }
              if (myRegion.zerothCheck(HoennStarters, HoennResponse)) {
                System.out.println("Welcome to the team" + " " + HoennResponse + "!");
                imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\tree.png");
                System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(HoennResponse);
              }
              if (myRegion.secondCheck(HoennStarters, HoennResponse)) {
                System.out.println("Welcome to the team" + " " + HoennResponse + "!");
                imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\mud.jpg");
                System.out.println("Now it's time to have a trial battle!");
              System.out.println(enterkey);
              enterkey = keyboard.nextLine();
              System.out.print(enterkey);
              imageDisplayer.DisplayPokemon("C:\\Sandul\\Coding\\PokemonPlayCSP\\lilli.png");
              myRegion.LillipupEnc(HoennResponse);
              }
            }

          }
          
        }
    }
}
import java.util.Scanner;
public class Region {
  Scanner keyboard = new Scanner(System.in);
  private String[] names;

  public Region(String[] names) {
    this.names = names;
  }

  public String[] getRegions() {
    return names;
  }

  public String getName(int index) {
    return names[index];
  }



  public String printList(String[] list) {
    String regionString = "";
    int index = 0;
if(list.equals(names)){
  System.out.println("Here are the regions: ");
  while (index < list.length) {
    regionString += list[index] + "\n";
    index += 1;
  }
}
else{
  System.out.println("Here are the available starters: ");
    while (index < list.length) {
      regionString += list[index] + "\n";
      index += 1;
    }
  }
  

    return regionString;
  }
  public boolean kantoCheck(String listA[], String regionAnswer1) {
    if (listA[0].equals(regionAnswer1)) {
      return true;
    }
    else{
    return false;
    }
  }
  public boolean sinnohCheck(String listB[], String regionAnswer2) {
    if (listB[1].equals(regionAnswer2)) {
      return true;
    }
    else{
    return false;
    }
  }
  public boolean hoennCheck(String listC[], String regionAnswer3) {
    if (listC[2].equals(regionAnswer3)) {
      return true;
    }
    else{
    return false;
    }
    
  }
  public boolean zerothCheck(String listD[], String starter) {
    if (listD[0].equals(starter)) {
      return true;
    }
    else{
    return false;
    }
  }
  public boolean firstCheck(String listD[], String starter) {
    if (listD[1].equals(starter)) {
      return true;
    }
    else{
    return false;
    }
  }
  public boolean secondCheck(String listD[], String starter) {
    if (listD[2].equals(starter)) {
      return true;
    }
    else{
    return false;
    }
  }
  public void LillipupEnc(String pokemon){
    System.out.println("A wild Lillipup appeared!\n Lillipup HP: 25\n" + pokemon + "HP: 30 \n\nChoose a move to use and defeat the Lillipup!");
    System.out.println("Cut\nTackle");
    String response1 = keyboard.nextLine();
    if (response1.equals("Cut")){
      System.out.println(pokemon + " used cut");
      System.out.println("It was a critical hit!\nLillipup HP: 0");
      System.out.println("Congratulations on winning your first Pokemon battle, continue your journey from here!");
    }
    if(response1.equals("Tackle")){
      System.out.println(pokemon + "used Tackle");
      System.out.println("It was super effective!\nLillipup HP: 0");
      
      System.out.println("Congratulations on winning your first Pokemon battle, continue your journey from here!");
    }
    
  }
}
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class DisplayImage{
    public void DisplayPokemon(String fileName) throws IOException
    {
        BufferedImage img=ImageIO.read(new File(fileName));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(900,900);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    

