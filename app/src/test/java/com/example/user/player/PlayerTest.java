package com.example.user.player;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Roger", "Clever", 1);
    }


    @Test
    public void testGetName(){
        assertEquals("Roger", player.getName());
    }

    @Test
    public void testGetNickname(){
        assertEquals("Clever", player.getNickname());
    }

    @Test
    public void testGetRanking(){
        assertEquals(1, player.getRanking());
    }

    @Test
    public void testToString(){
        assertEquals("Name: Roger, Nickname: Clever, Ranking: 1", player.toString());
    }


}

