import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class startSeason {
   public static List<TeamClass> teamsList = new LinkedList<TeamClass>();

    public static int numTeams;

public static void main(String[] args) {
importTeams();
//shuffle();
showSchedule();
groupTeams();
scheduleGroups();
}
    public static void shuffle() {
        Collections.shuffle(teamsList);
    }

//Imports teams and puts in Array List TeamList
public static void importTeams(){
       TextFileClass textFile = new TextFileClass();
textFile.getFileName();
if (textFile.fileName.length()>0) {
    
}
textFile.getFileContents();
numTeams = textFile.lineCount;
    for (int i = 0; i < numTeams; i++) {
        String team = (String) (textFile.text[i]);
        TeamClass newTeam = new TeamClass(team);

       teamsList.add(newTeam);
    }
    

}
public static void shuffleTeams(){
    
}
public static void groupTeams(){
    //10 Groups of 13 teams
      for (int i = 0; i < 13; i++) {
          int groupNum = i + 1;
//          System.out.println("");
//          System.out.println("Group " + groupNum); 
//          System.out.println("-----------------------");
       int startNum = 0;
       int endNum = startNum + 10;

          if(i != 0){
              startNum = i * 10;
              endNum = startNum + 10;
          }

                    for (int j = startNum; j < endNum; j++) {
                      TeamClass newTeam =  (TeamClass) teamsList.get(j);
                      
//                   System.out.print("(" +j + ")");       System.out.println(newTeam.getTeamName());
          }
      }
    
    
}

public static void scheduleGroups(){
    
    
    
    
    //Controls current team number
    for (int i = 0; i < 10; i++) {

        //Set week to i
          int week = i + 1;
        //Set opponent to 1
        int opponent = 0;
        //Set games played to 0
        int gamesPlayed = 0;
        
        //Loop Until 10 Games are schedules
        while(gamesPlayed < 10){
        //Make sure Week schedule is less then 10    
                        if(week == 11){
                               week = 1;
                        }
         //Make sure opponent is in group
         
            if(opponent != 10){
                
                
                 TeamClass newTeam =  (TeamClass) teamsList.get(i);
                 TeamClass awayTeam =  (TeamClass) teamsList.get(opponent);

               System.out.println(newTeam.getTeamName() + " vs " + awayTeam.getTeamName() + " week of " + week);

                opponent = opponent + 1;
            }
            else{
                 TeamClass newTeam =  (TeamClass) teamsList.get(i);
                 TeamClass awayTeam =  (TeamClass) teamsList.get(opponent);

               System.out.println(newTeam.getTeamName() + " vs " + awayTeam.getTeamName() + " week of " + week);
                opponent = 0;
            }
            week++;
            gamesPlayed++;
     }  
    }
    
}


public static void showSchedule(){
    for (int i = 1; i < teamsList.size(); i++) {
        TeamClass home = (TeamClass) teamsList.get(i);
        
    
    }   

}}
