import org.junit.Assert;
import org.junit.Test;

public class TeamLeadTest {
    @Test
    public void itShouldHaveANameAndId() {
        String name = "Pooja";
        int id = 12;
        TeamLead teamlead = TeamLead.getTeamLead(name,id);
        Assert.assertEquals(teamlead.getName(),"pooja");
        Assert.assertEquals(teamlead.getId(),12);
    }

    @Test
    public void itShouldReceiveACAllIfAvailable() {
        //given
        String name = "Pooja";
        int id = 12;

        String status = "call Received";
        TeamLead employee = TeamLead.getTeamLead(name,id);
        employee.setIsAvailable(true);
        //then
        Assert.assertEquals(status,employee.receiveCall());
    }

    @Test
    public void itShouldDelegateTheCAllIfNotFree() {
        //given
        String name = "Pooja";
        int id = 12;

        ProductionManager productionManager = ProductionManager.getProductionManager("Lim",12345612);
        String status = "call delegated to PM" + productionManager.getName();
        TeamLead employee = TeamLead.getTeamLead(name,id);
        employee.setIsAvailable(false);
        employee.receiveCall(productionManager);
        //then
        Assert.assertEquals(status,employee.delegateCall(productionManager));
    }

    @Test
    public void itShouldDelegateTheCAllIfNotAbleToHandle() {
        //given
        String name = "Pooja";
        int id = 12;
        ProductionManager productionManager = ProductionManager.getProductionManager("Lim",12345612);
        String status = "call delegated to PM" + productionManager.getName();
        TeamLead employee = TeamLead.getTeamLead(name,id);
        //when
        employee.setIsAbleToHandle(false);
        employee.receiveCall(productionManager);
        //then
        Assert.assertEquals(status,employee.delegateCall(productionManager));
    }

    @Test
    public void itShouldResolveTheCAllIfFreeAndAbleToHandle() {
        //given
        String name = "Pooja";
        int id = 12;
        ProductionManager productionManager = ProductionManager.getProductionManager("Lim",12345612);
        String status = "call resolved";
        TeamLead employee = TeamLead.getTeamLead(name,id);
        //when
        employee.setIsAvailable(true);
        employee.setIsAbleToHandle(true);
        employee.receiveCall(productionManager);
        //then
        Assert.assertEquals(status,employee.receiveCall(productionManager));
    }


}
