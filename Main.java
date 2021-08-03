import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		int gcd = 0;
		
		for (int i = 1; i <= sayi1; i++) {
			if (sayi1 % i ==0 && sayi2 % i == 0) {
				
				gcd = i;
				
			}
			
		}
		
		int lcm = (sayi1*sayi2)/gcd;
		
		System.out.println(sayi1 + " ve " + sayi2 + " icin GCD = " + gcd + "\n" + sayi1 + " ve " + sayi2 + " icin LCM = " + lcm);
		scan.close();
  }
}