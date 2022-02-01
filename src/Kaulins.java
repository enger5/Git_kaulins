import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static int mestKaulinu(int reizes) {
		int skaitlis =0, lielakais = 0;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis "+skaitlis);
			if(lielakais<skaitlis){
				lielakais  = skaitlis;
			}
		}
		System.out.println("Lilakais skaitlis metienu reizÁ ir "+lielakais);
		return skaitlis;
	}
	
	public static void main(String[] args) {
		int reizes, izvele;
		List<Integer> pedej = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("Cik reizes mest kauli≈Üu?");
		izvele = scan.nextInt();
		switch(izvele){
		case 1:
			do{
				System.out.println("Cik reizes mest kauli≈Üu?");
				reizes = scan.nextInt();
			}while(reizes<1);
			pedej = mestKaulinu(reizes);
			break;
		case 2:
			System.out.println("Pedeja metiena skaitli ir ");
			for(int i =0; i<pedej.size(); i++){
				pedej.get(i);
			}
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
			System.out.println("Programma apturÁta!");
			break;
			
		}
		}while(izvele!=2);
			scan.close();
	}
}
