package inheritanceexample;

public class MainClass {

    public static void main(String[] args) {
       FootballPlayer fp = new FootballPlayer("Stricker", "Messi");
       CricketPlayer cp = new CricketPlayer("Batsman", "Sakib");
       
       Player[] pList = {fp,cp};
       
       for(Player pl : pList){
        System.out.println(pl.play()); //pl is polimorfic, run time polimorphism 
       }
    }  
}

