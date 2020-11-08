import java.util.Scanner;

public class mainMenu {

    Scanner myScanner = new Scanner(System.in); //used to scan user input

    playerSettings ps = new playerSettings();


    public static void main(String[] args)
    {
        mainMenu mm = new mainMenu();
        mm.StartMenu();
    }


    public void StartMenu(){

        System.out.println("Which player would like to start?");
        System.out.println("1: Player 1");
        System.out.println("2: Player 2");
        String Player = (myScanner.nextLine()); //Checks users input

        switch (Player) {

            case "1": // Player Settings
                ps.ActivePlayer = true;
                System.out.println("Player 1 is now the active player.");
                ps.AP = ps.P1;
                ps.NP = ps.P2;
                Messages();

            case "2": // Lets the user set the name
                ps.ActivePlayer = false;
                System.out.println("Player 2 is now the active player.");
                ps.AP = ps.P2;
                ps.NP = ps.P1;
                Messages();
        }
    }

    public void Messages(){
        playerSettings ps = new playerSettings();

        System.out.println(ps.AP + ", what would you like todo?");
        mainMenu mm = new mainMenu();
        mm.StartGame();
    }

    public void StartGame() {



        System.out.println("1: Player Settings");
        System.out.println("2: Set Word");
        System.out.println("3: Start Game (Will Use Current Word)");
        System.out.println("4: Exit Game");
        String Check = (myScanner.nextLine()); //Checks users input
        switch (Check){

            case "1": // Player Settings
                playerSettings ps = new playerSettings();
                ps.Start();

            case "2": // Lets the user set the name
                setWord sw = new setWord();
                sw.SelectLetter();

            case "3":
                Game game = new Game();//Constructor for input class
                game.Start();//Starts at method Start

            case "4": //closes application
                System.out.println("Goodbye!");
                System.exit(0);
        }

    }

    public void Reset() {
        Game game = new Game();//Constructor for input class
        game.Play();//Starts at method Start
    }

}
