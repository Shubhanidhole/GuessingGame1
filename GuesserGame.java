package game;

import java.util.Random;
import java.util.Scanner;

class Guesser
{
	int guessnum;
	public int guessNumber(){
		boolean correct=false;
		Scanner sc=new Scanner(System.in);
		//Random rand=new Random();
		//int randnumber=rand.nextInt(100)+1;
		boolean correct1=false;
		
		System.out.println("Guesser kindly guess the number");
		guessnum=sc.nextInt();
		while(!correct1)
		{
			
			if(guessnum<1)
				System.out.println("Number is Lower,Guess again");
			else if(guessnum>10)
				System.out.println("Number is Higher,Guess again");
			else
				System.out.println(" Yes you Guessed the number");
			   correct1=true;
		}
		return guessnum;
		
	}
}

class Player1
{
	int pguessnum;
	public int pguessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player1 guess the number");
		pguessnum=sc.nextInt();
		return pguessnum;
	}
}

class Player2
{
	int pguessnum1;
	public int pguessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player2 guess the number");
		pguessnum1=sc.nextInt();
		return pguessnum1;
	}
}

class Player3
{
	int pguessnum2;
	public int pguessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player3 guess the number");
		pguessnum2=sc.nextInt();
		return pguessnum2;
	}
}

class Player4
{
	int pguessnum3;
	public int pguessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player4 guess the number");
		pguessnum3=sc.nextInt();
		return pguessnum3;
	}
	
}


class Umpire
{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	int numfromplayer4;
	int attempt=1;
	
	public void collectnofromguesser()
	{
		
			Guesser g=new Guesser();
			numfromguesser=g.guessNumber();
			
		
	
	}
	
	public void collectnofromplayer() {
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Player3 p3=new Player3();
		Player4 p4=new Player4();
		numfromplayer1=p1.pguessNumber();
		numfromplayer2=p2.pguessNumber();
		numfromplayer3=p3.pguessNumber();
		numfromplayer4=p4.pguessNumber();
		
	}
	
	public void compare()
	{
		
		if(numfromguesser==numfromplayer1)
		{
			if(numfromguesser==numfromplayer2 && numfromguesser==numfromplayer3 && numfromguesser==numfromplayer4)
			{
				System.out.println("Game Tide...All players guess the correct answer");
			}
			else if(numfromguesser==numfromplayer2)
			{
				System.out.println("player1 and player2 won the game");
			}
			else if(numfromguesser==numfromplayer3)
			{
				System.out.println("player1 and player3 won the game");
			}
			else if(numfromguesser==numfromplayer4)
			{
				System.out.println("player1 and player4 won the game");
			}
			else
			{
			System.out.println("Player1 won the game!!");
			}
			
		}
		else if(numfromguesser==numfromplayer2)
		{
			if(numfromguesser==numfromplayer3)
			{
				System.out.println("player2 and player3 won the game");
			}
			else if(numfromguesser==numfromplayer4)
			{
				System.out.println("player2 and player4 won the game");
			}
			else
			{
			System.out.println("Player2 won the game!!");
			}
		}
		else if(numfromguesser==numfromplayer3)
		{
			if(numfromguesser==numfromplayer4)
			{
				System.out.println("Player3 and Player4 won the game");
			}
			else
			System.out.println("Player3 won the game!!");
		}
		else if(numfromguesser==numfromplayer4)
		{
		
			System.out.println("player4 won the game");
		
		}
		else
		{
			System.out.println("Game lost!! Play again");
		}
	
	}
	
}
public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectnofromguesser();
		u.collectnofromplayer();
		u.compare();

	}

}
