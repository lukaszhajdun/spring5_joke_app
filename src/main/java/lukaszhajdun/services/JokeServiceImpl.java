package lukaszhajdun.services;
import lukaszhajdun.repositories.JohnnyJokes;
import org.springframework.stereotype.Service;

/**
 * Created by Kroolik on 2017-11-10.
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final JohnnyJokes johnnyJokes;

    public JokeServiceImpl() {
        this.johnnyJokes = new JohnnyJokes();
    }

    @Override
    public String getJoke() {
        return johnnyJokes.getRandomJoke();
    }
}
