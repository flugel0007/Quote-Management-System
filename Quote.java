public class Quote{
    String mainText;
    String from;
    String link;

    public Quote(String quote) {
        mainText = quote;
        from = "Unknown";
        link = "";
    } 
    public Quote (String quote, String origin){
        mainText = quote;
        from = origin;
        link = "";
    }

    public Quote (String quote, String origin, String url){
        mainText = quote;
        from = origin;
        link = url;
    }
    public String getMainText(){
        return mainText;
    }

    public String getFrom(){
        return from;
    }
    
    public String getLink(){
        return link;
    }
    @Override
    public String toString(){
        return "Quote: " + mainText + "\n" + "From: " + from + "\n" + "Link: " + link + "\n";
    }
    
}