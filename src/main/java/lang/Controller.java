package lang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class Controller {

    private final WordRepository wordRepository;

    @Autowired
    public Controller(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @RequestMapping("/add")
    public Word add(@RequestParam(value = "w") String word, @RequestParam(value = "t") String translation) {
        Word wordObject = new Word(word, translation);
        wordRepository.save(wordObject);
        return wordObject;
    }

    @RequestMapping("/")
    public List<Word> words() {
        return wordRepository.findAll();
    }
}
