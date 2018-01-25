import org.junit.Assert;
import org.junit.Test;

public class ProductionManagerTest {
    @Test
    public void itShouldHaveANameAndId() {
        String name = "Lim";
        int id = 12345612;
        ProductionManager productionManager = ProductionManager.getProductionManager(name,id);
        Assert.assertEquals(productionManager.getName(),name);
        Assert.assertEquals(productionManager.getId(),id);
    }

    @Test
    public void itShouldReceiveACall() {
        //given
        String name = "Lim";
        int id = 12345612;
        String status = "call Received";
        Employee employee = ProductionManager.getProductionManager(name,id);
        //employee.setIsAvailable(true);
        //then
        Assert.assertEquals(status,employee.receiveCall());
    }
}


