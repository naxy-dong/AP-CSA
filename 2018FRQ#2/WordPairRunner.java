public class WordPairRunner{
    public static void main(String[] args){
        String[] words = {"the", "red", "fox", "the", "red"};
        for(String w : words){
            System.out.print(w + " ");
        }
        WordPairList wpl = new WordPairList(words);
        System.out.println("\n" + wpl.numMatches());
    }
}