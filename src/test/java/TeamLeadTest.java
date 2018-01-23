import org.junit.Assert;
import org.junit.Test;

public class TeamLeadTest {
    @Test
    public void itShouldHaveANameAndId() {
        String name = "Bob";
        int id = 12345678;
        TeamLead teamlead = new TeamLead(name,id);
        Assert.assertEquals(teamlead.getName(),name);
        Assert.assertEquals(teamlead.getId(),id);
    }


}
