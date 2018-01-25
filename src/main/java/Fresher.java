public class Fresher extends Employee{
    boolean ableToHandleCall ;
    private boolean ableToHandle;

    public Fresher(String name, int id) {
        super(name, id);
        this.ableToHandleCall = true;
    }


    public String addressCall( Employee seniorEmployee) {
        String status;
        if(ableToHandleCall == true){
            status = "call resolved";
        }
        else {
           return delegateCall(seniorEmployee);
        }

        return status;
    }

    public void setAbleToHandle(boolean ableToHandle) {
        this.ableToHandle = ableToHandle;
    }

    public String delegateCall(Employee seniorEmployee) {
        String status;
        status = "call delegated to TL "+ seniorEmployee.getName();
            return status;
    }
}
