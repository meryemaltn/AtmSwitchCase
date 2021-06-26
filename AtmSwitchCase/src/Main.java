import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        
    	 String userName, password;
         Scanner input = new Scanner(System.in);
         int right = 3;
         int balance = 1500;
         int select;
         
         while (right > 0) {
             System.out.print("Kullanýcý Adýnýz :");
             userName = input.nextLine();
             System.out.print("Parolanýz : ");
             password = input.nextLine(); 
        
             switch (userName) {
             case "patika":
            	 switch (password) {
            	 case "dev123":
             
             Scanner scan = new Scanner(System.in);
             int bakiye = 1500;
             
             System.out.println("Bakiyeniz = " + balance);
             System.out.println("\n****ÝSLEMLER****\n");
             System.out.println("1. Para Çekme");
             System.out.println("2. Para Yatýrma");
             System.out.println("3. Bakiye sorgulama");
             System.out.println("4. Kart Ýade");
             
             System.out.print("\nÝsleminizi Seciniz: ");
             int islem = scan.nextInt();
             
             switch(islem) {
             case 1:
                 System.out.println("Bakiyeniz = " + balance);
                 System.out.print("Çekmek istediðiniz tutarý giriniz: ");
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
                 System.out.print("Yatýrmak istediðiniz tutarý giriniz: ");
                 tutar = scan.nextInt();
                 balance += tutar;
                 System.out.println("Yeni bakiyeniz = " + balance);
                 break;
             case 3:
                 System.out.println("Bakiyeniz = " + balance);
                 break;
             case 4:
                 System.out.println("Kartýnýzý almayý unutmayýnýz.!!");
             default:
                 System.out.println("Yanlýþ iþlem seçtiniz. Tekrar giriniz.");
             }
            	 }
            	 default :
             System.out.println("Kullanýcý adý veya þifre yanlýþ. Kalan hakkýnýz: "+ --right);
             switch (right) {
             case 0:
            	 System.out.println("Kartýnýz Bloke Edildi");
             
             }
            	 }
             }
         }
    }
