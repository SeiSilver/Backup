// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1;

public class Dictionary implements Comparable<Dictionary> {
    private String word;
    private String meaning;

    public Dictionary(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    @Override
    public int compareTo(Dictionary o) {
        return o.getWord().compareTo(this.word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-35s", getWord(), getMeaning());
    }

}
