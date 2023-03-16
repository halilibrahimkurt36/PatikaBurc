import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int month,day;
		Scanner giris=new Scanner(System.in);
		
		System.out.println("Kaçıncı Ayda Doğdunuz? : ");
		month=giris.nextInt();
		
		System.out.println("Ayın Kaçıncı Günü Doğdunuz? : ");
		day=giris.nextInt();
		
		if(month==1) {
			if(day<=21) {
				System.out.println("Burcunuz OĞLAK");
			}
			else {
				System.out.println("Burcunuz KOVA");
			}
		}
		else if(month==2) {
			if(day<=19) {
				System.out.println("Burcunuz KOVA");
			}
			else {
				System.out.println("Burcunuz BALIK");	
			}
		}
		else if(month==3) {
			if(day<=20) {
				System.out.println("Burcunuz BALIK");
			}
			else {
				System.out.println("Burcunuz KOÇ");
			}
				
		}
		else if(month==4) {
			if(day<=20) {
				System.out.println("Burcunuz KOÇ");
			}
			else {
				System.out.println("Burcunuz BOĞA");
			}
				
		}
		else if(month==5) {
			if(day<=21) {
			System.out.println("Burcunuz BOĞA");
		}
		else {
			System.out.println("Burcunuz İKİZLER");
		}
			
	}
		else if(month==6) {
			if(day<22) {
				System.out.println("Burcunuz İKİZLER");
			}
			else
				System.out.println("Burcunuz YENGEÇ");
		}
		else if(month==7) {
			if(day<22) {
				System.out.println("Burcunuz YENGEÇ");
			}
			else {
				System.out.println("Burcunuz ASLAN");
			}
		}
		else if(month==8) {
			if(day<=22) {
				System.out.println("Burcunuz ASLAN");
			}
			else {
				System.out.println("Burcunuz BAŞAK");
			}
		}
		else if(month==9) {
			if(day<=22) {
				System.out.println("Burcunuz BAŞAK");
			}
			else {
				System.out.println("Burcunuz TERAZİ");
			}
		}
		else if(month==10) {
			
			if(day<=22) {
				System.out.println("Burcunuz TERAZİ");
			}
			else {
				System.out.println("Burcunuz AKREP");
			}
		}
		else if(month==11) {
			if(day<=21) {
				System.out.println("Burcunuz AKREP");
			}
			else {
				System.out.println("Burcunuz YAY");
			}
		}
		else if(month==12) {
			if(day<=21) {
				System.out.println("Burcunuz YAY");
			}
			else {
				System.out.println("Burcunuz OĞLAK");
			}
		}
		else {
			System.out.println("Sınırların Dışında Ay Girişi Yaptınız");
		}

}
}
