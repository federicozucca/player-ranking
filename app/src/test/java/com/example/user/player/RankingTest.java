package com.example.user.player;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * Created by user on 12/12/2016.
 */
public class RankingTest {
    Ranking ranking;
    Player player;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;

    @Before
    public void before(){
        ranking = new Ranking();
        player = new Player("Roger", "Clever", 1);
        player1 = new Player("Nadal", "Not Clever", 2);
        player2 = new Player("George", "Nerd", 3);
        player3 = new Player("Fred", "j", 4);
        player4 = new Player("Julia", "No", 5);
        player5 = new Player("Sam", "Jsda", 6);
        player6 = new Player("Daniel", "the brasilian", 7);
        player7 = new Player("Margherita", "actress", 8);
        player8 = new Player("Enrick", "pokerman", 9);
        player9 = new Player("Joe", "Ruth's daughter", 10);
        player10 = new Player("Valentino", "Rossi",10);
    }

    @Test
    public void testCountPlayer(){
        assertEquals(0,ranking.countPlayers());
    }

    @Test
    public void testAddPlayerByIndex(){
        ranking.addPlayerByIndex(player);
        assertEquals(1, ranking.countPlayers());
    }

    @Test
    public void testGetPlayerByIndex(){
        ranking.addPlayerByIndex(player);
        assertEquals("Name: Roger, Nickname: Clever, Ranking: 1", ranking.getPlayerByIndex(0));
    }

    @Test
    public void testGetTwoPlayers(){
        ranking.addPlayerByIndex(player);
        ranking.addPlayerByIndex(player1);
        assertEquals(2, ranking.countPlayers());
    }

    @Test
    public void testGetTenPlayers(){
        ranking.addPlayerByIndex(player);
        ranking.addPlayerByIndex(player1);
        ranking.addPlayerByIndex(player2);
        ranking.addPlayerByIndex(player3);
        ranking.addPlayerByIndex(player4);
        ranking.addPlayerByIndex(player5);
        ranking.addPlayerByIndex(player6);
        ranking.addPlayerByIndex(player7);
        ranking.addPlayerByIndex(player8);
        ranking.addPlayerByIndex(player9);
        ranking.removeLastPlayerAndAddNewOne(player10);
        assertEquals(10, ranking.countPlayers());
        assertEquals("Name: Valentino, Nickname: Rossi, Ranking: 10", ranking.getPlayerByIndex(9));
    }

    @Test
    public void testGetPlayerByName(){
        ranking.addPlayerByIndex(player);
        ranking.addPlayerByIndex(player1);
        ranking.addPlayerByIndex(player2);
        ranking.addPlayerByIndex(player3);
        ranking.addPlayerByIndex(player4);
        ranking.addPlayerByIndex(player5);
        ranking.addPlayerByIndex(player6);
        ranking.addPlayerByIndex(player7);
        ranking.addPlayerByIndex(player8);
        ranking.addPlayerByIndex(player9);
        assertEquals("Name: Roger, Nickname: Clever, Ranking: 1", ranking.getPlayerByName("Roger"));
    }

}
