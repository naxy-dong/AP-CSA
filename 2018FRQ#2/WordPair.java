public class WordPair {
    private String fWord;
    private String sWord;
    public WordPair(String first, String second){
        fWord = first;
        sWord = second;
    }
    
    public String getFirst(){
        return fWord;
    }

    public String getSecond(){
        return sWord;
    }

    public String toString(){
        return "[" + fWord + "," + sWord + "]";
    }
}
