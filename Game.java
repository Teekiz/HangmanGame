import java.util.Scanner;

public class Game {

    @SuppressWarnings("duplicate code")

    public int hangmanPoints;

    public String Gussed1 = "_";
    public String Gussed2 = "_";
    public String Gussed3 = "_";
    public String Gussed4 = "_";
    public String Gussed5 = "_";
    public String Gussed6 = "_";

    Boolean G1 = false;
    Boolean G2 = false;
    Boolean G3 = false;
    Boolean G4 = false;
    Boolean G5 = false;
    Boolean G6 = false;


    Word w = new Word();
    playerSettings ps = new playerSettings();

    Scanner myScanner = new Scanner(System.in); //used to scan user input

    public void Start() {

        System.out.println("Welcome " + ps.AP + "!");
        Play();
    }


    public void Play() {


        if (G1 == true && G2 == true && G3 == true && G4 == true && G5 == true && G6 == true) {
            AddScore();
        } else if (hangmanPoints < 8) {

            System.out.println("Current guess is " + Gussed1 + Gussed2 + Gussed3 + Gussed4 + Gussed5 + Gussed6 + "");
            System.out.println("What letter would you like to try? (letters are case sensitive)");
            String HangmanLetter = (myScanner.nextLine());
            if (HangmanLetter.equals(w.letter1) && G1 == false) { //Letter 1
                Gussed1 = w.letter1;
                G1 = true;
                Play();
            } else {

                if (HangmanLetter.equals(w.letter2) && G2 == false) { //Letter 2
                    Gussed2 = w.letter2;
                    G2 = true;
                    Play();
                } else {

                    if (HangmanLetter.equals(w.letter3) && G3 == false) { //Letter 3
                        Gussed3 = w.letter3;
                        G3 = true;
                        Play();
                    } else {
                        if (HangmanLetter.equals(w.letter4) && G4 == false) { //Letter 4
                            Gussed4 = w.letter4;
                            G4 = true;
                            Play();
                        }

                        if (HangmanLetter.equals(w.letter5) && G5 == false) { //Letter 5
                            Gussed5 = w.letter5;
                            G5 = true;
                            Play();
                        } else {
                            if (HangmanLetter.equals(w.letter6) && G6 == false) { //Letter 6
                                Gussed6 = w.letter6;
                                G6 = true;
                                Play();
                            } else {
                                hangmanPoints++;
                                Hangman();
                            }
                        }
                    }
                }


            }
        } else {

            System.out.println("You lost.");
            System.out.println("Would you like to try again? (Y/N)");

            Gussed1 = "_";
            Gussed2 = "_";
            Gussed3 = "_";
            Gussed4 = "_";
            Gussed5 = "_";
            Gussed6 = "_";

            String Check = (myScanner.nextLine()); //Checks users input
            if (Check.equalsIgnoreCase("y")) { //if the users input is y, then
                mainMenu m = new mainMenu();
                m.Reset(); //return to the main menu after setting the word
            } else {
                mainMenu mm = new mainMenu();
                mm.StartGame();
            }
        }

    }

    public void Hangman() {

        if (hangmanPoints == 7) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  0   |");
            System.out.println(" (|)  |");
            System.out.println(" ( )  |");
            System.out.println("      |");
            System.out.println("=========");
            Play();
        } else if (hangmanPoints == 6) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  0   |");
            System.out.println(" (|)  |");
            System.out.println(" (    |");
            System.out.println("      |");
            System.out.println("=========");
            Play();
        } else if (hangmanPoints == 5) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  0   |");
            System.out.println(" (|)  |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            Play();
        } else if (hangmanPoints == 4) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  0   |");
            System.out.println(" (|   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            Play();
        } else if (hangmanPoints == 3) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  0   |");
            System.out.println(" (    |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            Play();
        } else if (hangmanPoints == 2) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  0   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            Play();
        } else if (hangmanPoints == 1) {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            Play();

        } else {
            Play();
        }
    }

    public void AddScore()
    {
        if (ps.AP.equals(ps.P1))
        {
            ps.P1Score = ps.P1Score + 1;
            System.out.println(ps.P1 + "s score is now " + ps.P1Score);
            Won();
        }
        else
        {
            ps.P2Score = ps.P2Score + 1;
            System.out.println(ps.P2 + "s score is now " + ps.P2Score);
            Won();
        }
    }

    public void Won() {

        System.out.println("Congratulations, You won!");
        System.out.println("Your guessed the selected word correctly (" + w.letter1 + w.letter2 + w.letter3 + w.letter4 + w.letter5 + w.letter6 + ")");

        Gussed1 = "_";
        Gussed2 = "_";
        Gussed3 = "_";
        Gussed4 = "_";
        Gussed5 = "_";
        Gussed6 = "_";

        System.out.println("Would you like to try again? (Word will remain the same) (Y/N)");
        String Check = (myScanner.nextLine()); //Checks users input
        if (Check.equalsIgnoreCase("y")) { //if the users input is y, then
            mainMenu m = new mainMenu();
            m.Reset(); //return to the main menu after setting the word
        } else {
            mainMenu mm = new mainMenu();
            mm.StartGame();
        }


    }
}
