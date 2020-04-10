package militarystructure;

/**
 *  @Author: Lesly Brisson 
 *    @Date: 04/05/20 
 * @Updated: 04/08/20 
 *@FileName: MilitaryStructure.java 
 *@Purpose: Practice using inheritance, interfaces and abstract classes to relate objects to one another
 *          Classes are representing the military work structure
 */

public class MilitaryStructure {

   
    public static void main(String[] args) {
        
        Member VPofENG = new FlightChief("Lisa Rope", "Army", 4);
        DeskSergeant seE = new DeskSergeant("John Carmen", "Army", 9);
        SquadronCommander CFO = new SquadronCommander("Thomas Jones", "Air Force", 4);
        Captain CaptaintA = new Captain("Cody Thompson", "Marines", 8);
        OfficerMember CaptainB = new Captain("Blake Wall", "Navy", 10);
        EnlistedMember Airman = new EnlistedMember("Bill Fence", "Air Force", 6);
        Member ArmyCommander = new OfficerMember("Tommy Gates", "Army", 10);
        FlightChief NavyFlightChief = new FlightChief("Tory Crown", "Air Force", 4);
        EnlistedMember DeskS2 = new DeskSergeant("Paul Blart", "Army", 8);
        DeskSergeant DeskS1 = new DeskSergeant("Dokata James", "Marines", 12);
        
        System.out.println(Airman.toString());
        Airman.setRank("E-7");
        ArmyCommander.setRank("O-5");
        System.out.println(Airman.getRank());
        System.out.println(Airman.getBaseSalary());
        
        System.out.println("");
        
        System.out.println(ArmyCommander.toString());
        System.out.println(ArmyCommander.getRank());
        System.out.println(ArmyCommander.getBaseSalary());
        System.out.println("");

        System.out.println(DeskS1.toString()+"\nMember ID: "+DeskS1.memberID);
        DeskS1.setRank("E-5");
        DeskS1.setServerAccess(true);
        DeskS1.getServerAccess();
        DeskS1.setSocialSecurityClearance("983839340");
        DeskS1.getSocialSecurityNumber();
        DeskS1.setMOS("Security Forces");
        DeskS1.getMOS();
        System.out.println("MOS: "+DeskS1.getMOS());
        System.out.println(DeskS1.getRank());
        System.out.println(DeskS1.getBaseSalary());

    
    }
}
