package inheritanceexample;

public class CricketPlayer extends Player{
    private String role;

    public CricketPlayer(String role, String playerName) {
        super(playerName);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String play() {
        return super.getPlayerName()+"is playing cricket as a "+role;
    }
    
} 
