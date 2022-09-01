import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row, column;
		
		System.out.println("Mayýn tarlasýna girdin!!!");
		System.out.println("Oynamak istediðin boyutlarý gir");
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Satýr sayýsý");
		row=scanner.nextInt();
		System.out.println("Sütun sayýsý");
		column=scanner.nextInt();
		
		MayýnTarlasi mayýn=new MayýnTarlasi(row,column);
		
		mayýn.run();
		
		
	}

}
