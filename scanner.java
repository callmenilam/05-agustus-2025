import java.util.Scanner;

public class scanner {
     public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Nama Kamu : ");
            String nama = input.nextLine();
            System.out.println("Masukan usia");
            int usia = input.nextInt();

            System.out.println("===");
            System.out.println("hai,"+nama+",Usai kamu "+usia);

 }
 }
   