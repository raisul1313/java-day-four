package employee;

public class MainClass {
    public static void main(String[] args) {
        MonthlySalaried ms = new MonthlySalaried(250000.00, "Mr. Raisul");
        HourlySalaried hs = new HourlySalaried(2500, 2.5, "Mr. Kuddus");
        MonthlyPlusCommissioned mpc = new MonthlyPlusCommissioned(50000.0, 3.5, 15000.0, "Mr. Akkas");
        
        Employee [] emps = {ms,hs,mpc};
        for(Employee e : emps){
            System.out.println(e.getName()+"'s "+e.getClass().getSimpleName()+" is "+e.getTotalEarning());
          
        }
    }
    
}
