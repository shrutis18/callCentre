public class TeamLead extends Employee{
    boolean isAbleToHandle;
    private TeamLead(String name, int id) {
        super(name, id);
        this.isAbleToHandle = true;

    }

    private static TeamLead teamLead = null;

    public static TeamLead getTeamLead (String name, int id) {
        if(teamLead==null){
            teamLead= new TeamLead(name,id);
        }
        return teamLead;
    }
    public void setIsAbleToHandle(boolean isAbleToHandle) {
        this.isAbleToHandle = isAbleToHandle;
    }


    public String receiveCall(Employee seniorEmployee) {
        String status = "call resolved";
        if(isAvailable && isAbleToHandle){
            return status;
        }
        else
        {
          return   delegateCall(seniorEmployee);
        }
    }

    public String delegateCall(Employee seniorEmployee) {
        String status = "call delegated to PM" + seniorEmployee.getName();
        return status;
    }
}
