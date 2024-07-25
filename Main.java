import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuoteManager quoteManager = new QuoteManager();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n Main Menu");
            System.out.println("1. Add Quote");
            System.out.println("2. Display All Quotes");
            System.out.println("3. Edit Quote");
            System.out.println("4. Delete Quote");
            System.out.println("5. Exit");
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
                    quoteManager.displayQuotes();
                    System.out.print("Which Quote would you like to edit? :");
                    int index = scanner.nextInt() -1;
                    scanner.nextLine();

                    if (index >= 0 && index < quoteManager.quotes.size()) {
                        Quote oldQuote = quoteManager.quotes.get(index);
                        System.out.println("Current Quote:");
                        System.out.println("   "+oldQuote);

                        System.out.print("Enter new quote text (leave blank to keep current): ");
                        String newQuoteText = scanner.nextLine();
                        System.out.print("Enter new author (leave blank to keep current): ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Enter new link (leave blank to keep current): ");
                        String newLink = scanner.nextLine();

                        quoteManager.editQuote(index, newQuoteText, newAuthor, newLink);
                    } else {
                        System.out.println("Invalid index. Quote not found.");
                    }

                    break;

                
                case 4:
                    quoteManager.displayQuotes();
                    System.out.println("Which Quote would u like to remove? :D");
                    int delIndex = scanner.nextInt()-1;
                    scanner.nextLine();

                    if(delIndex>=0 && delIndex < quoteManager.quotes.size()){
                        quoteManager.deleteQuote(delIndex);
                    } else {
                        System.out.println("Couldn't Find the Quote you were looking for. Try again perhaps :D");
                    }

                case 5: 
                    System.out.println("See You Again Fellow Traveller");
                    scanner.close();
                    return;

                default: 
                    System.out.println("Error. Try Again");
                break;

            }
        }
    }
}
