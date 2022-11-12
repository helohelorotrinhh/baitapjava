package basic.dev;

import java.util.Scanner;


public class MainApp {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ten: ");
		String Ten = input.next();
		
		System.out.println("Ma Sinh Vien: ");
		String Msv = input.next();
		
		System.out.println("CMND: ");
		int Cmnd = input.nextInt();
		
		System.out.println("Ten Lop: ");
		String TenLop = input.next();
		
		System.out.println("Ten Truong: ");
		 String TenTruong = input.next();
		 
		
		System.out.println("DTB: ");
		float Dtb = input.nextFloat();
		
		
		System.out.println("Thong Tin Sinh Vien");
	
		
		System.out.println("  Ten :  " +Ten+ "  Msv :  " +Msv+ "  CMND : " +Cmnd + " TenLop : " +TenLop+ " TenTruong : " +TenTruong+ " DTB : " +Dtb);
		
		input.nextLine();
		
		System.out.println("Ten: ");
		String Ten1 = input.next();
		
		System.out.println("Dia Chi: ");
		String Diachi = input.next();
		
	    System.out.println("SDT: ");
	    int Sdt = input.nextInt();
	    
	    System.out.println("HSL: ");
	    float Hsl = input.nextFloat();
	    
	    System.out.println("Thong Tin Cong Nhan La");
	    System.out.println("  Ten  : "+Ten1+ "  DiaChi :  "+Diachi+"  SDT : "+Sdt+"  HSL : "+Hsl);
	    
	    input.nextLine();
	    
	    System.out.println("Ten: ");
	    String Ten2 = input.next();
	    
	    System.out.println("Hang: ");
	    String Hang = input.next();
	    
	    System.out.println("Gia: ");
	    float Gia = input.nextFloat();
	    
	    System.out.println("Mau Son: ");
	    String MauSon = input.next();
	    
	    System.out.println("Thong Tin Chiec Xe La");
	    System.out.println(" Ten  :  "+Ten2+"  Hang  :  "+Hang+"  Gia : "+Gia+"  MauSon  :  "+MauSon);
	    
	    
	    input.nextLine();
	    
	    
		input.close();
		

		
		
	}

}
