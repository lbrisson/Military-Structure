package militarystructure;

/**
 *  @Author: Lesly Brisson 
 *    @Date: 04/05/20 
 * @Updated: 04/08/20 
 *@FileName: DeskSergeant.java 
 *@Purpose: Create Methods and variables of Desk Sergeant class which extends EnlistedMember.java class
*/

public class DeskSergeant extends EnlistedMember {
    public boolean ServerAccess;

    public DeskSergeant(String name, String branch, int contractLength) {
        super(name, branch, contractLength);
        this.ServerAccess = ServerAccess;
    }
    
    
      public boolean getServerAccess(){
        return ServerAccess;//Should return whether or not this Desk Sergeant has access to secret servers
    }

    public void setServerAccess(boolean access){
        //Should allow an external piece of data to update
        // the Desk Sergeant's server privileges to either true or false
        this.ServerAccess=access;
    }

    public int getSuccessfulCheckIns(){
        //Should return the current count of how many times this Desk Sergeant
        // has successfully checked in the military server
        return checkins;
    }

    public boolean checkInData(){
        //Should check if this Desk Sergeants's sueprvisor approves of their check in.
        // If the check in is approved their successful checkin count should be increased and the method should return "true".
        // If the supervisor does not approve the check in the Desk Sergeants's code access is changed to false
        FlightChief supervisor=(FlightChief) this.getSupervisor();
        if (supervisor.approveCheckIn(this)){
            this.checkins++;
            return true;
        } else {
            ServerAccess=false;
            return false;
        }
    }
}
