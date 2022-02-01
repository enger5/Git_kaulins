import java.util.Random;
import java.util.Scanner;
import java.math.*;
public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis, lielakais = 0;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(11)+0;
			System.out.println("Uzkrita skaitlis "+skaitlis);
			System.out.println("Sqrt skaitlis: " +Math.sqrt((double)skaitlis));
			if(lielakais<skaitlis){
				lielakais  = skaitlis;
			}
		}
		System.out.println("Lilakais skaitlis metienu reizç ir "+lielakais);
	}
	
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("Cik reizes mest kauliÅ†u?");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
	}
}
