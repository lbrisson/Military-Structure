package militarystructure;

/**
 *  @Author: Lesly Brisson 
 *    @Date: 04/05/20 
 * @Updated: 04/08/20 
 *@FileName: Captain.java 
 *@Purpose: Create Methods and variables of Squadron Commander class which extends OfficerMember.java class
 */

public class Captain extends OfficerMember {
    public FlightChief teamSupported;
    
    public Captain(String name, String branch, int contractLength) {
        super(name, branch, contractLength);
    }
    
  

    public FlightChief getTeamSupported(){
        //Should return a reference to the Commander that this Captain is currently supporting.
        return teamSupported;
    }

    public boolean canApprovePromotion(double promotion){
        double requestedPromotion=promotion;
        if (requestedPromotion<=getPromotion()){
            return true;
        } else {
            System.out.print(" Rejected because promotion limit reached.");
            return false;
        }

    }

    public String employeeStatus(){
        return this.toString()+" is limited to "+ getPromotion()+" promotion slots, is supporting "+ this.getTeamSupported();
    }
}
