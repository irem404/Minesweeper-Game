import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row, column;
		
		System.out.println("May�n tarlas�na girdin!!!");
		System.out.println("Oynamak istedi�in boyutlar� gir");
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Sat�r say�s�");
		row=scanner.nextInt();
		System.out.println("S�tun say�s�");
		column=scanner.nextInt();
		
		May�nTarlasi may�n=new May�nTarlasi(row,column);
		
		may�n.run();
		
		
	}

}
