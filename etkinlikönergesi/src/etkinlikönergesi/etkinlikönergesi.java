package etkinlikönergesi;

import java.util.Scanner;

public class etkinlikönergesi {

	public static void main(String[] args) {
		
		int x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("sýcaklýðý giriniz: ");
		x=input.nextInt();
		
		if(x<5) {
			
			System.out.println("bu havada kayak yapabilirsiniz. ");
		}
		else if(5<=x && x<15) {
			
			System.out.println("bu havada sinemaya gidebilirsiniz. ");
		}
		else if(15<=x && x<25) {
					
					System.out.println("bu havada pikniðe gidebilirsiniz. ");
		}
		else if(x<=25) {
			
			System.out.println("bu havada yüzmeye gidebilirsiniz. ");
}
		
		
	}

}
