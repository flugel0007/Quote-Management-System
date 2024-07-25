import java.util.ArrayList;
import java.util.List;
/**
 * QuoteManager
 */
public class QuoteManager {
    public List<Quote> quotes; 

    public QuoteManager(){
        this.quotes = new ArrayList<>();
    }

    public void addQuote (Quote quote){
        quotes.add(quote);
        System.out.println("New Quote has been added");
    }

    public void displayQuotes(){
        if (quotes.isEmpty()) {
            System.out.println("There are no quotes in the Querry. Consider adding a few :D I recommend watching Thomas Frank and Matt D'avella");
        } else {
            for (int i = 0; i < quotes.size(); i++) {
                System.out.println(i+1 +". " +quotes.get(i));
            }
        }
    }

    public void editQuote(int index, String newText, String newAuthor, String newLink){
        if (index >= 0 && index < quotes.size()) {
            Quote oldQuote = quotes.get(index);
            Quote updatedQuote = new Quote(
                newText.isEmpty() ? oldQuote.getMainText() : newText,
                newAuthor.isEmpty() ? oldQuote.getFrom() : newAuthor,
                newLink.isEmpty() ? oldQuote.getLink() : newLink
            );
            quotes.set(index, updatedQuote);
            System.out.println("Quote has been updated to your liking B) ");
        } else {
            System.out.println("Couldn't Find the Quote you were looking for. Try again perhaps :D");
        }
    }
}