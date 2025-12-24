package SplashScreen;
import java.util.ArrayList;
import java.util.List;
import java. util.Scanner;
class CricketTeam
{
    String tname1;
    String tname2;

    public void tossWinnerName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of toss winner name ");
        String str = sc.nextLine();
        if(str.equalsIgnoreCase(tname1)||str.equalsIgnoreCase(tname2)){
            System.out.println("congratulation " +str + " win ");
        }
          else {
            System.out.println("something went wrong ");
            tossWinnerName();

        }

    }

    public  void teamName()
    {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your first team name ");
            tname1 = sc.nextLine();
            System.out.println("Enter your secoand team name ");
            tname2 = sc.nextLine();
            System.out.println("first team is " + tname1);
            System.out.println("Secaond  team is " + tname2);
        } catch(Exception e){
            System.out.println("something went wrong ");
            teamName();
        }
    }
    List<String> cricketTeamName()
    {
        List<String>l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i =1;
        while(i<=11){
            System.out.println("Enter ypur first " +i + " player name");
            String str = sc.nextLine();
            l.add(str);
            i++;
        }
        return l;
    }
}
public class FrontPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Scoring area");
        System.out.println("enter your team name  ");
        CricketTeam ct = new CricketTeam();
        ct.teamName();
        ct.tossWinnerName();
        System.out.println("Enter the player of first team");
        List<String>t = ct.cricketTeamName();
        for(String s : t) System.out.println(s);
        System.out.println("Enter the player of secoand team");
        List<String>t1 = ct.cricketTeamName();
        for(String s : t1) System.out.println(s);

    }
}
