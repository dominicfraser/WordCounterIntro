package example.codeclan.com.wordcounter;

/**
 * Created by user on 18/04/2017.
 */

public class Word {

private String words;

    public Word(String words){
        this.words = words;
    }


    public String[] splitToArray() {
        return this.words.split(" ");
    }

    public int amountOfWords(){
        String[] splitArray = splitToArray();
        return splitArray.length;
    }
}
