import org.junit.Assert;
import org.junit.Test;

public class FresherTest {
    @Test
    public void itShouldHaveANameAndId() {
        String name = "Tom";
        int id = 1234;
        Fresher fresher = new Fresher(name, id);
        Assert.assertEquals(fresher.getName(),name);
        Assert.assertEquals(fresher.getId(),id);

    }
}
