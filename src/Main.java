import models.Groups;
import models.Players;
import models.Teams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Players ply1 = new Players("Roberto Carlos", 59, 99, 312);
        Players ply2 = new Players("K. Coman", 32, 85, 332);
        Players ply3 = new Players("G. Jesus", 33, 87, 347);
        Players ply4 = new Players("D. Gea", 35, 91, 361);
        Players ply5 = new Players("M. Ozil", 36, 89, 356);

        ArrayList<Players> players = new ArrayList<Players>();
        players.add(ply1);
        players.add(ply2);
        players.add(ply3);
        players.add(ply4);
        players.add(ply5);

        //Teams

        Teams tm1 = new Teams("France", "Blue", 1);
        Teams tm2 = new Teams("Belgium", "Red", 4);
        Teams tm3 = new Teams("Portugal", "Red", 16);

        ArrayList<Players> brazilPlayers = new ArrayList<Players>();
        ArrayList<Players> argentinaPlayers = new ArrayList<Players>();
        ArrayList<Players> portugalPlayers = new ArrayList<Players>();

        Players b1 = new Players("K. Mbappe", 30, 89, 345);
        Players b2 = new Players("A. Griezman", 38, 86, 343);
        Players b3 = new Players("H. Loris", 25, 81, 349);

        Players a1 = new Players("K. Devroyne", 35, 91, 356);
        Players a2 = new Players("Lukaku", 34, 84, 358);
        Players a3 = new Players("E. Hazard", 29, 86, 359);

        Players po1 = new Players("C. Ronaldo", 37, 90, 332);
        Players po2 = new Players("Nani", 39, 81, 335);
        Players po3 = new Players("D. Costa", 23,79, 333);

        brazilPlayers.add(b1);
        brazilPlayers.add(b2);
        brazilPlayers.add(b3);

        argentinaPlayers.add(a1);
        argentinaPlayers.add(a2);
        argentinaPlayers.add(a3);

        portugalPlayers.add(po1);
        portugalPlayers.add(po2);
        portugalPlayers.add(po3);

        //Groups

        Groups g1 = new Groups("Group G", tm1.getName());
        Groups g2 = new Groups("Group C", tm2.getName());
        Groups g3 = new Groups("Group H", tm3.getName());
        System.out.println(g1.getName()+"=>"+g1.getTeams());
        System.out.println(g2.getName()+"=>"+g2.getTeams());
        System.out.println(g3.getName()+"=>"+g3.getTeams());
    }
}