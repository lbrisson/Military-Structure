package militarystructure;

import java.util.ArrayList;

/**
 *  @Author: Lesly Brisson
 *    @Date: 04/05/20 
 * @Updated: 04/08/20 
 *@FileName: FlightChief.java 
 * @Purpose: Create Methods and variables of Flight Chief class which extends EnlistedMember.java class
 */

public class FlightChief extends EnlistedMember {
    public String squadron;
    private int numDeployments;
    public ArrayList<DeskSergeant> team;
    
    
    
    
    public FlightChief(String name, String branch, int contractLength) {
        super(name, branch, contractLength);
        this.numDeployments = numDeployments;
        this.squadron = squadron;
    }
    
    public void setNumDeployments(int numDeployments) {
        this.numDeployments = numDeployments;
    }
    
    public void setSquadron() {
        this.squadron = squadron;
    }
    
    public String getNumDeployments() {
        return "Deployed "+numDeployments+ "times.";
    }
    
    public String getSquadron() {
        return "Flight Chief for "+squadron+ " squadron";
    }
    
     public boolean requestPromotion(Member e, double bonus) {
        SquadronCommander Commander = (SquadronCommander)getCaptainSupport().getSupervisor();
        if (Commander.approvePromotion(e, promotion)) {
            return true;
        } else {
            return false;
        }
    }
     

    boolean approveCheckIn(DeskSergeant e) {
         if(e.getSupervisor().equals(this) && e.getServerAccess()) {
            return true;
        } else {
            return false;
        }
    }
}
