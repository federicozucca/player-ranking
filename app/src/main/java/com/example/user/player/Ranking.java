package com.example.user.player;

import java.util.ArrayList;

/**
 * Created by user on 12/12/2016.
 */
public class Ranking {
    private ArrayList<Player> rankings;

    public Ranking(){
        rankings= new ArrayList<Player>();
    }

    public void addPlayerByIndex( Player player){
        int index = (player.getRanking()-1);
    rankings.add(index, player);
    }

    public String getPlayerByIndex( int index){
        Player player = rankings.get(index);
        return player.toString();
    }

    public int countPlayers(){
        return rankings.size();
    }

    public void removeLastPlayerAndAddNewOne(Player player){
        rankings.remove(9);
        rankings.add(player);
    }

    public String getPlayerByName( String name){
        for (int i = 0; i < rankings.size(); i++) {



            Player player = player.get(i).getName();

            if(player.getName().equals(name));{

                System.out.println();}
            }

    }

}
