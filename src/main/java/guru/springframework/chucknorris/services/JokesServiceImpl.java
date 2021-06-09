package guru.springframework.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService{

    @Override
    public String getJoke() {
        ChuckNorrisQuotes cq = new ChuckNorrisQuotes();
        return cq.getRandomQuote();
    }
}
