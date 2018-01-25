import org.junit.Assert;
import org.junit.Test;

public class FresherTest {

    @Test
    public void itShouldHaveANameAndId() {
        String name = "Tom";
        int id = 1234;
        Fresher fresher = new Fresher(name, id);
        Assert.assertEquals(fresher.getName(), name);
        Assert.assertEquals(fresher.getId(), id);

    }
    @Test
    public void itShouldReceiveACAllIfAvailable() {
        //given
        String name = "Tom";
        int id = 1234;
        String status = "call Received";

        Fresher employee = new Fresher(name,id);
        employee.setIsAvailable(true);
        //then
        Assert.assertEquals(status,employee.receiveCall());
    }

    @Test
    public void itShouldNotReceiveACAllIfNotAvailable() {
        //given
        String name = "Tom";
        int id = 1234;
        String status = "call  made to some other employee";
        Fresher employee = new Fresher(name,id);
        employee.setIsAvailable(false);
        //then
        Assert.assertEquals(status,employee.receiveCall());
    }


    @Test
    public void itShouldAnswerTheCallIfAbleToHandle() {
        //given
        String name = "Tom";
        int id = 1234;
        String status = "call resolved";
        TeamLead teamLead = TeamLead.getTeamLead("pooja",12);
        Fresher employee = new Fresher(name,id);
        //then
        Assert.assertEquals(status,employee.addressCall(teamLead));
    }

    @Test
    public void itShouldDelegateTheCallIfNotAbleToHandle() {
        //given
        String name = "Tom";
        int id = 1234;
        Fresher employee = new Fresher(name,id);
        TeamLead teamLead = TeamLead.getTeamLead("pooja",12);
        String status = "call delegated to TL "+ teamLead.getName();
        //when
        employee.setAbleToHandle(false);
        employee.addressCall(teamLead);
        //then
        Assert.assertEquals(status,employee.delegateCall(teamLead));
    }

}
