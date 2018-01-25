public abstract class Employee {
    private final String name;
    private final int id;
    public boolean isAvailable ;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.isAvailable = true;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public  String receiveCall() {
        String status;
        if (isAvailable == true) {
            status = "call Received";

        }
        else {
            status = "call  made to some other employee";
        }
        return  status;
    }


}
