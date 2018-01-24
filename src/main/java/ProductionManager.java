public class ProductionManager extends Employee {

    private ProductionManager(String name, int id) {
        super(name, id);
    }
    private static ProductionManager productionManager = null;

    public  static ProductionManager getProductionManager(String name, int id){
        if(productionManager == null){
            productionManager = new ProductionManager(name,id);
        }
        return productionManager;
    }
}
