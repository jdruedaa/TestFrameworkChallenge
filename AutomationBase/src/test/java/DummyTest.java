import com.beust.ah.A;
import org.movie.ActionMovie;
import org.movie.Movie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MathUtils;

public class DummyTest {

    @Test
    public void SumTest()
    {
        int x = 4;
        int y = 6;
        Assert.assertEquals(MathUtils.sum(x,y),10);
    }

    @Test
    public void IndependentNewActionMovieTest()
    {
        ActionMovie firstMovie = new ActionMovie();
        firstMovie.setName("The Punisher");
        firstMovie.setRating(4.2);
        firstMovie.setClassification("Teen");
        ActionMovie secondMovie = (ActionMovie) firstMovie.clone();
        secondMovie.setRating(4.9);
        Assert.assertEquals(secondMovie.getName(),firstMovie.getName());
        Assert.assertEquals(secondMovie.getClassification(),firstMovie.getClassification());
        Assert.assertNotEquals(secondMovie.getRating(), firstMovie.getRating());
    }
}
