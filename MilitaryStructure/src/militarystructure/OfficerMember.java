package militarystructure;

/**
 *  @Author: Lesly Brisson 
 *    @Date: 04/05/20 
 * @Updated: 04/08/20 
 *@FileName: OfficerMember.java 
 * @Purpose: Create Methods and variables of OfficerMember class which extends Member.java super class
 */

public class OfficerMember extends Member {
    
    public String officerAcademyLocation;
    public String rank;
    private int contractLength;
    
 
    
   public OfficerMember(String name, String branch, int contractLength) {
       super(name, branch);
       this.officerAcademyLocation = officerAcademyLocation;
       this.contractLength = contractLength;
       baseSalary = 3287.35;
    }
  

    @Override
    public String memberStatus() {
       return super.toString()+"\n is currently: Active Duty Status"+getRank();
    }
    
   
    //Setter for Rank
    public void setRank(String officerRank) {
        this.rank = officerRank; 
    
        switch(rank) {
            case "O-1":
                this.baseSalary = 3287.35;
                break;
            case "O-2":
                this.baseSalary = 3787.35;
                break;
            case "O-3":
                this.baseSalary = 4383.25;
                break;
            case "O-4":
                this.baseSalary = 4985.42;
                break;
            case "O-5":
                this.baseSalary = 5777.96;
                break;
            case "O-6":
                this.baseSalary = 6931.05;
                break;
            case "O-7":
                this.baseSalary = 9351.23;
                break;
            case "O-8":
                this.baseSalary = 11254.32;
                break;
            case "O-9":
                this.baseSalary = 15905.70;
                break;
            case "O-10":
                this.baseSalary = 18186.06;
                        break;
                
        }
    }
    
    public void setofficerAcademyLocation() {
        if(branch.equalsIgnoreCase("Air Force")) {
            this.officerAcademyLocation = "Montgomery, Alabama";
        } else if(branch.equalsIgnoreCase("Army")) {
            this.officerAcademyLocation = "Fort Benning, Georgia";
        } else if(branch.equalsIgnoreCase("Navy")) {
            this.officerAcademyLocation = "Newport, Rhode Island";
        } else if(branch.equalsIgnoreCase("Marines")) {
            this.officerAcademyLocation = "Triangle, Virginia";
        }
    }
    
    public void setPromotionLimit(double promotionLimit) {
        this.promotionLimit = promotionLimit;
    }
    
    public String getRank() {
        return "Members Rank is: "+ rank;
    }
    
    public int getContractLength() {
        return contractLength;
    }
    
    public String getofficerAcademyLocation() {
        return officerAcademyLocation;
    }
    
     public double getPromotion() {
        return promotionLimit;
        }
    
    public String employeeStatus() {
      
        String s= String.format("%.2f",promotionLimit);//reduce the double to 2 decimals
        return this.toString()+" with a promotion limit of "+ s+ "Enlisted Members.";
    }

    @Override
    public void setsecurityClearance() {
    }

    @Override
    public void passBackgroundCheck() {
    }
}
