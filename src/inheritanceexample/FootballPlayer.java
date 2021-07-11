package inheritanceexample;

public class FootballPlayer extends Player {
    private String position;

    public FootballPlayer(String position, String playerName) {
        super(playerName);
        this.position = position;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String play() {
        return super.getPlayerName()+" is playing football at postition "+position;
    }
      
}
