package lang;

import org.springframework.data.annotation.Id;

public class Word {

    @Id
    public String id;

    public String word;
    public String translation;

    public Word() {}

    public Word(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    @Override
    public String toString() {
        return String.format("Word=[id=%s, word=\"%s\", translation=\"%s\"]", id, word, translation);
    }
}
