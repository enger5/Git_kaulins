import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.util.ArrayList;
import java.util.List;
public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis, lielakais = 0;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis "+skaitlis);
			if(lielakais<skaitlis){
				lielakais  = skaitlis;
			}
		}
		System.out.println("Lilakais skaitlis metienu reizç ir "+lielakais);
	}
	
	public static void main(String[] args) {
		int reizes, izvele, lielakais=0;
		List<Integer>pedej = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("1-Mest kaulni | 2-Apskatit pedejo metienu | 3-Apskaitit pçdejo lielako pedeja metienç | stop");
			izvele = scan.nextInt();
			switch(izvele){
			case 1:
				do{
					System.out.println("Cik reizes mest kaulinu?");
					reizes = scan.nextInt();
				}while(reizes<1);
				for(Integer i : pedej){
					System.out.println(i+" ");
				}
				System.out.println();
				break;
			case 2:
			 System.out.println("Pçdçjâ metiena skaitïis ir ");
			 for(Integer i : pedej){
				 System.out.println(i+" ");
			 }
			System.out.println();
			break;
			case 3:
				for(int i=0; i<pedej.size();i++){
					if(pedej.get(i)>lielakais){
						lielakais  =pedej.get(i);
					}
				}
				System.out.println("Lielakais skaitlis pçdçjâ metienâ ir "+lielakais);
				break;
			case 4:
				System.out.println("Programma apturçta!");
				break;
			}
		}while(izvele!=4);
		scan.close();
		
	}
}
