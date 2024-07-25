import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuoteManager quoteManager = new QuoteManager();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n Main Menu");
            System.out.println("1. Add Quote");
            System.out.println("2. Display All Quotes");
            System.out.println("3. Exit");
            System.out.print("Choose Option:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Quote: ");
                    String quoteText = scanner.nextLine();
                    System.out.print("(optional) Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("(optional) Enter link: ");
                    String link = scanner.nextLine();
                    quoteManager.addQuote(new Quote(quoteText, author, link));
                    break;
                
                case 2: 
                    quoteManager.displayQuotes();
                    break;

                case 3: 
                    System.out.println("See You Again Fellow Traveller");

                default: 
                    System.out.println("Error. Try Again");

            }
        }
    }
}
