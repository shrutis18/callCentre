public class TeamLead extends Employee{

    private TeamLead(String name, int id) {
        super(name, id);

    }
    private static TeamLead teamLead = null;

    public static TeamLead getTeamLead (String name, int id) {
        if(teamLead==null){
            teamLead= new TeamLead(name,id);
        }
        return teamLead;
    }
}
