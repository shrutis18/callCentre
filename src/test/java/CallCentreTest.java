import org.junit.Assert;
import org.junit.Test;

public class CallCentreTest {
    @Test
    public void itShouldHaveAListOfEmployees () {
        //given
        CallCentre callCentre = new CallCentre();
        //when
        Employee employee1 = new Fresher("tushar",123);
        Employee employee2 =  TeamLead.getTeamLead("pooja",12);
        callCentre.addEmployees(employee1);
        callCentre.addEmployees(employee2);
        Assert.assertEquals(callCentre.getEmployees().size(),2);

    }

//    @Test
//    public void itShouldHaveACallHandler () {
//        //given
//        CallCentre callCentre = new CallCentre();
//        //when
//        Employee employee1 = new Fresher("tushar",123);
//        Employee employee2 =  TeamLead.getTeamLead("pooja",12);
//        callCentre.addEmployees(employee1);
//        callCentre.addEmployees(employee2);
//        Assert.assertEquals(callCentre.getEmployees().size(),2);
//
//    }
}
