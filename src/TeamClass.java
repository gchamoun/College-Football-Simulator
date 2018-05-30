public class TeamClass {
private String TeamName;
private DynamicArrayList schedule;

    public TeamClass(String TeamName) {
        this.TeamName = TeamName;
        this.schedule = new DynamicArrayList();

    }

    
    public void addSchedule(int week, GameClass game){
       schedule.add(week - 1, game);
    }
    public void showSchedule(){
        for (int i = 0; i < 9; i++) {
          GameClass game = (GameClass) schedule.getEntry(i);
            System.out.println(game.toString());
        }    }
            
            
            
            
    public TeamClass getOpponent(){
        
                TeamClass away = (TeamClass) schedule.getEntry(0);
return away;
    }


    public String getTeamName() {
        return TeamName;
    }
    

}
