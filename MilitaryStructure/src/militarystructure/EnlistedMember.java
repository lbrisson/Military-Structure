package militarystructure;

/**
 *  @Author: Lesly Brisson
 *    @Date: 04/05/20
 * @Updated: 04/08/20
 *@FileName: EnlistedMember.java
 * @Purpose: Create Methods and variables of EnlsitedMember class which extends Member.java super class
 */

public class EnlistedMember extends Member {
    
    public String basicTrainingLocation;
    public String rank;
    private int contractLength;
    public int checkins;
    
    
    
    public EnlistedMember(String name, String branch, int contractLength) {
        super(name, branch);
        this.basicTrainingLocation = basicTrainingLocation;
        this.contractLength = contractLength;
        baseSalary = 1732.94;
    }

    public void setBasicTraining() {
        if(branch.equalsIgnoreCase("Air Force")) {
            this.basicTrainingLocation = "San Antonio, Texas";
        } else if(branch.equalsIgnoreCase("Army")) {
            this.basicTrainingLocation = "Fort Benning, Georgia";
        } else if(branch.equalsIgnoreCase("Navy")) {
            this.basicTrainingLocation = "Chicago, Illinois";
        } else if(branch.equalsIgnoreCase("Marines")) {
            this.basicTrainingLocation = "San Diego, California";
        }
    }
   
    public void setRank(String enlistedRank) {
       this.rank = enlistedRank; 
    
        switch(rank) {
            case "E-1":
                this.baseSalary = 1732.94;
                break;
            case "E-2":
                this.baseSalary = 1942.49;
                break;
            case "E-3":
                this.baseSalary = 2043.73;
                break;
            case "E-4":
                this.baseSalary = 2262.46;
                break;
            case "E-5":
                this.baseSalary = 2467.95;
                break;
            case "E-6":
                this.baseSalary = 2963.90;
                break;
            case "E-7":
                this.baseSalary = 3114.40;
                break;
            case "E-8":
                this.baseSalary = 4480.18;
                break;
            case "E-9":
                this.baseSalary = 5472.87;
                break;
        }
    }
    
    @Override
    public String getRank() {
        return "Members Rank is: "+ rank;
    }
     
    public String getBasicTraining() {
        return basicTrainingLocation;
    }

    @Override
    public String memberStatus() {
        return super.toString()+"\nis currently: Active Duty Status\n"+getRank();
    }
    
    public int getContractLength() {
        return contractLength;
    }

    @Override
    public void setsecurityClearance() {  
    }

    @Override
    public void passBackgroundCheck() {
    }
}
