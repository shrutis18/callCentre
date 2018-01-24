import org.junit.Assert;
import org.junit.Test;

public class ProductionManagerTest {
    @Test
    public void itShouldHaveANameAndId() {
        String name = "LIm";
        int id = 12345612;
        ProductionManager productionManager = ProductionManager.getProductionManager(name,id);
        Assert.assertEquals(productionManager.getName(),name);
        Assert.assertEquals(productionManager.getId(),id);
    }
}


