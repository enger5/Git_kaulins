import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static int mestKaulinu() {
		Random rand = new Random();
		int skaitlis = rand.nextInt(6)+1;
		return skaitlis;
	}
	
	public static void main(String[] args) {
		int reizes, izvele;
		List<Integer> pedej = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("1-Mest kauliòu | 2-apskaitit pedejo metienu | 3 - Apkatit lielâko metiena | 4-Apturet");
		izvele = scan.nextInt();
		switch(izvele){
		case 1:
			do{
				System.out.println("Cik reizes mest kaulinu?");
				reizes = scan.nextInt();
			}while(reizes<1);
			pedej.add(mestKaulinu());
			break;
		case 2:
			System.out.println("Pedeja metiena skaitli ir ");
			for(Integer i : pedej){
				System.out.println(i+" ");
			}
			System.out.println();
			break;
			
		case 3:
			int lielakais = 0;
			for (int i=0; i<pedej.size(); i++){
				if(pedej.get(i)>lielakais){
					lielakais = pedej.get(i);
				}
			}
				System.out.println("Lielakais skaitlis pedeja metiena ir "+lielakais);
			break;
		case 4:
			System.out.println("Programma apturçta!");
			break;
			
		}
		}while(izvele!=4);
			scan.close();
	}
}
