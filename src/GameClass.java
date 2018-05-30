public class GameClass {
    private TeamClass homeTeam;
    private TeamClass awayTeam;
    private int homeScore;
    private int awayScore;
    
    public GameClass(TeamClass homeTeam, TeamClass awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }

    @Override
    public String toString() {
        return homeTeam.getTeamName() + " vs " + awayTeam.getTeamName();
    }
    
}
