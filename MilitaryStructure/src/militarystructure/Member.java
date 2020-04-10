package militarystructure;

/**
 *  @Author: Lesly Brisson 
 *    @Date: 04/05/20 
 * @Updated: 04/08/20 
 *@FileName: Member.java 
 * @Purpose: Super Class used to share traits, variables and methods with other classes
 */

public abstract class Member implements GovernmentEmployee{
    
    private static int memberCount;
    private String name;
    private String socialSecurityNumber;
    public int memberID;
    private String securityClearance;
    public String rank;
    public int headcount=0;
    private String MOS;
    String branch;
    public double promotion;
    double baseSalary;
    public Member supervisor;
    public double promotionLimit;
    public Captain captainSupport;
    
    
  
    
    //Default Parameter Constructor
    public Member(String name, String branch) {
        
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.securityClearance = securityClearance;
        this.branch = branch;
        memberCount++;
        this.memberID = memberCount;
        this.MOS = MOS;
    }
    
    
    //Setter for Rank
    public void setBranch(String branch) {
        this.branch = branch; 
    }
    
    //Setter for Security Clearance
    public void setSecurityClearance() {
        this.securityClearance = securityClearance;
    }
    
    public void setSocialSecurityClearance(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
      public void setMOS(String MOS) {
        this.MOS = MOS;
    }
      
    public void setRank(String rank) {
        this.rank = rank;
    }  
    
      
      public void setSupervisor(Member supervisor) {
        this.supervisor = supervisor;
      }
    
    
    //Getter for Name
    public String getName() {
        return name;
    }
    
    //Getter for Rank
    public String getBranch() {
        return branch;
    }
    
     public String getMOS() {
        return MOS;
    }
     
    public Captain getCaptainSupport() {
        return captainSupport;
    }
     
     public double getPromotion() {
        return promotion;
     }
    
    public String getSecurityClearance() {
        return securityClearance;
    }
    
      public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
 
    
    public int getMemberID() {
        return memberID;
    }
    
    public Member getSupervisor() {
        return supervisor;
    }
    
    
     public boolean equals(Member other) {
        //Should return true if the two member IDs are the same, false otherwise
        return this.getMemberID() == other.getMemberID();
    }
    
    //Prints members name + welcome message
    public String toString() {
        return "Military Member Name: "+ getName()+ "\nBranch: "+branch;
    }
    
    //Displays member current status
    public abstract String memberStatus();


   public double getBaseSalary() {
        return this.baseSalary;//Should return the employee's current salary
    }

   public String getRank() {
        return "Members Rank is: "+ rank;
    }
}
