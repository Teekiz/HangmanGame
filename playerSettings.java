import java.util.Scanner;

public class playerSettings {

    Scanner myScanner = new Scanner(System.in); //used to scan user input

    public static String P1 = "Player 1";
    public static String P2 = "Player 2";
    public static String AP;
    public static String NP;

    public static int P1Score;
    public static int P2Score;

    Boolean ActivePlayer;


    public void Start() {

        System.out.println(AP + ", what would you like todo?");

        System.out.println("1: Set Names");
        System.out.println("2: See Score");
        System.out.println("3: Set Active Player");
        System.out.println("4: Return to main menu");

        String Check = (myScanner.nextLine()); //Checks users input
        switch (Check) {

            case "1": // Set Names
                setNames();

            case "2": // See Score
                seeScore();

            case "3":
                ChangeActivePlayer();

            case "4": //closes application
                mainMenu mm = new mainMenu();
                mm.StartGame();
        }
    }

    public void setNames() {
        System.out.println("Which player would you like to change?");
        System.out.println("1: " + P1);
        System.out.println("2: " + P2);
        System.out.println("3: Return");

        String Player = (myScanner.nextLine()); //Checks users input
        switch (Player) {

            case "1": // Set Names
                Player1();

            case "2": // See Score
                Player2();

            case "3":
                Start();
        }
    }

    public void Player1() {
        System.out.println("What would you like to change " + P1 + " to?");
        String Player1 = (myScanner.nextLine()); //Checks users input
        System.out.println("Are you sure you would like to change " + P1 + " to " + Player1 + "? (Y/N)");
        String confirm = (myScanner.nextLine()); //Checks users input
        if (confirm.equalsIgnoreCase("y")) {
            P1 = Player1;
            setNames();
        } else {
            System.out.println("Returning...");
            setNames();
        }

    }

    public void Player2() {
        System.out.println("What would you like to change " + P2 + " to?");
        String Player2 = (myScanner.nextLine()); //Checks users input
        System.out.println("Are you sure you would like to change " + P2 + " to " + Player2 + "? (Y/N)");
        String confirm = (myScanner.nextLine()); //Checks users input
        if (confirm.equalsIgnoreCase("y")) {
            P2 = Player2;
            setNames();
        } else {
            System.out.println("Returning...");
            setNames();
        }
    }


    public void ChangeActivePlayer() {


        System.out.println("Who would you like the active player to become?");
        System.out.println("1: " + P1);
        System.out.println("2: " + P2);
        String act = (myScanner.nextLine()); //Checks users input
        switch (act) {
            case "1":
                AP = P1;
                NP = P2;
                ActivePlayer = true;
                System.out.println(AP + " is now the active player");
                Start();

            case "2":
                AP = P2;
                NP = P1;
                ActivePlayer = false;
                System.out.println(AP + " is now the active player");
                Start();
        }
    }

    public void seeScore() {

        System.out.println(P1 + "s Score is " + P1Score + ".");
        System.out.println(P2 + "s Score is " + P2Score + ".");
        Start();
    }
}

