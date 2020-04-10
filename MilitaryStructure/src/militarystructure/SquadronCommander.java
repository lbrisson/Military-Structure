package militarystructure;

import java.util.ArrayList;

/**
 *  @Author: Lesly Brisson 
 *    @Date: 04/05/20 
 * @Updated: 04/08/20 
 *@FileName: SquadronCommander.java 
 * @Purpose: Create Methods and variables of Squadron Commander class which extends OfficerMember.java class
 */

public class SquadronCommander extends OfficerMember {
    public ArrayList<Captain> team;
    
    
    public SquadronCommander(String name, String branch, int contractLength) {
        super(name, branch, contractLength);
        this.baseSalary=getBaseSalary()*2;
        this.headcount=10;
        this.team=new ArrayList<Captain>();
    }
   

    public boolean hasHeadCount() {
        //Should return true if the number of direct reports this Commander has is less than their headcount.
        if(this.team.size()<this.headcount) {
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Member e, double bonus) {
       
       if (bonus<=getPromotion()) {
           this.promotionLimit-=promotion;
           e.promotionLimit+=promotion;
           return true;
       } else {
           return false;
       }
    }


    public boolean approvePromotion(Member e, double promotion) {
        for (int i=0;i<team.size();i++) {
            if((team.get(i).getTeamSupported()).equals(e.supervisor) && team.get(i).canApprovePromotion(promotion)) {
                e.promotion += promotion;
                team.get(i).promotionLimit -= promotion;
                return true;
            }
        }
        return  false;
    }

    public String getTeamStatus() {

        if (team.size()==0) {
            return this.memberStatus()+ " and no new updates yet.";
        } else {
            String teamStatus="";
            for (int i=0;i<team.size();i++) {
                teamStatus+=("    "+team.get(i).memberStatus()+"\n");
            }
            return this.memberStatus()+" and is supervising: \n"+teamStatus;

        }
    }
}
