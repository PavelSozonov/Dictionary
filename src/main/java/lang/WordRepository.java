package lang;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "words", path = "words")
public interface WordRepository extends MongoRepository<Word, String> {

    Word findByWord(String word);
    List<Word> findByTranslation(String word);
}
