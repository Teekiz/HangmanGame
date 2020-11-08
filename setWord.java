import java.util.Scanner;

public class setWord {

    Scanner myScanner = new Scanner(System.in); //used to scan user input

    public String placeHolderLetter1;
    public String placeHolderLetter2;
    public String placeHolderLetter3;
    public String placeHolderLetter4;
    public String placeHolderLetter5;
    public String placeHolderLetter6;


    Word w = new Word();
    playerSettings ps = new playerSettings();

    public void SelectLetter() {

        System.out.println("Please only select one letter per selection, letters a case sensitive");

        System.out.println(ps.NP + ", please type the first letter");
        String letter11 = (myScanner.nextLine());
        placeHolderLetter1 = letter11;


        System.out.println(ps.NP + ",please type the second letter");
        String letter22 = (myScanner.nextLine());
        placeHolderLetter2 = letter22;

        System.out.println(ps.NP + ",please type the third letter");
        String letter33 = (myScanner.nextLine());
        placeHolderLetter3 = letter33;


        System.out.println(ps.NP + ",please type the fourth letter");
        String letter44 = (myScanner.nextLine());
        placeHolderLetter4 = letter44;


        System.out.println(ps.NP + ",please type the fifth letter");
        String letter55 = (myScanner.nextLine());
        placeHolderLetter5 = letter55;


        System.out.println(ps.NP + ",please type the sixth letter");
        String letter66 = (myScanner.nextLine());
        placeHolderLetter6 = letter66;

        System.out.println("Your selected word is " + placeHolderLetter1 + placeHolderLetter2 + placeHolderLetter3 + placeHolderLetter4 + placeHolderLetter5 + placeHolderLetter6 + "");
        System.out.println("Is this correct? (Y/N)");
        String confirm = myScanner.nextLine(); //checks to see users input
        if (confirm.equalsIgnoreCase("y")) { //if the users input is y, then

            w.letter1 = letter11;
            w.letter2 = letter22;
            w.letter3 = letter33;
            w.letter4 = letter44;
            w.letter5 = letter55;
            w.letter6 = letter66;

            System.out.println("===============================================");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("---------------Set word is above---------------");
            System.out.println("--------------Please do not cheat--------------");
            System.out.println("-------------------Thank you-------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("===============================================");

            mainMenu m = new mainMenu();
            m.StartGame(); //return to the main menu after setting the word
        } else {
            System.out.println("Would you like to try again? (Y/N)");
            String check = myScanner.nextLine(); //checks to see users input
            if (check.equalsIgnoreCase("y")) { //if the users input is y, then
                SelectLetter();
            } else {
                System.out.println("Returning to main menu.");
                mainMenu m = new mainMenu();
                m.StartGame(); //return to the main menu after setting the word
            }
        }


    }
}
