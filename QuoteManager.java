import java.util.ArrayList;
import java.util.List;
/**
 * QuoteManager
 */
public class QuoteManager {
    private List<Quote> quotes; 

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
            for (Quote quote : quotes) {
                System.out.println(quote);
            }
        }
    }
}