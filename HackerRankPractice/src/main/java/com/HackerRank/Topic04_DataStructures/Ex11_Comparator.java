package com.HackerRank.Topic04_DataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex11_Comparator {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}


class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

 class Checker implements Comparator<Player> {
	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if (o1.score == o2.score) {
			return o1.name.compareTo(o2.name);
		} else {
			return o1.score > o2.score?-1:1;
		}
	}	 
 }