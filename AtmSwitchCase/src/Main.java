import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        
    	 String userName, password;
         Scanner input = new Scanner(System.in);
         int right = 3;
         int balance = 1500;
         int select;
         
         while (right > 0) {
             System.out.print("Kullan�c� Ad�n�z :");
             userName = input.nextLine();
             System.out.print("Parolan�z : ");
             password = input.nextLine(); 
        
             switch (userName) {
             case "patika":
            	 switch (password) {
            	 case "dev123":
             
             Scanner scan = new Scanner(System.in);
             int bakiye = 1500;
             
             System.out.println("Bakiyeniz = " + balance);
             System.out.println("\n****�SLEMLER****\n");
             System.out.println("1. Para �ekme");
             System.out.println("2. Para Yat�rma");
             System.out.println("3. Bakiye sorgulama");
             System.out.println("4. Kart �ade");
             
             System.out.print("\n�sleminizi Seciniz: ");
             int islem = scan.nextInt();
             
             switch(islem) {
             case 1:
                 System.out.println("Bakiyeniz = " + balance);
                 System.out.print("�ekmek istedi�iniz tutar� giriniz: ");
                 int tutar = scan.nextInt();
                 if(tutar > bakiye) {
                     System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
                     tutar = scan.nextInt();
                 }
                 balance -= tutar;
                 System.out.println("Yeni bakiyeniz = " + balance);
                 break;
             case 2:
                 System.out.println("Bakiyeniz = " + balance);
                 System.out.print("Yat�rmak istedi�iniz tutar� giriniz: ");
                 tutar = scan.nextInt();
                 balance += tutar;
                 System.out.println("Yeni bakiyeniz = " + balance);
                 break;
             case 3:
                 System.out.println("Bakiyeniz = " + balance);
                 break;
             case 4:
                 System.out.println("Kart�n�z� almay� unutmay�n�z.!!");
             default:
                 System.out.println("Yanl�� i�lem se�tiniz. Tekrar giriniz.");
             }
            	 }
            	 default :
             System.out.println("Kullan�c� ad� veya �ifre yanl��. Kalan hakk�n�z: "+ --right);
             switch (right) {
             case 0:
            	 System.out.println("Kart�n�z Bloke Edildi");
             
             }
            	 }
             }
         }
    }
