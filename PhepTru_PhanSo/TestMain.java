package PhepTru_PhanSo;

import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap tu va mau cho phan so thu nhat");
		System.out.print("\nTu = ");
		int tu1=input.nextInt();
	    int mau1;
	    do {
	    	System.out.print("\nMau =");
	    	mau1=input.nextInt();
	    }while(mau1==0);
	    PhanSo phanSo1=new PhanSo(tu1,mau1);    
	    System.out.println("Nhap tu va mau cho phan so thu hai");
	    System.out.print("\nTu = ");
	    int tu2=input.nextInt();
	    int mau2;
	    do {
	    	System.out.print("\nMau =");
	    	mau2=input.nextInt();
	    }while(mau2==0);
	    PhanSo phanSo2=new PhanSo(tu2,mau2);
	    phanSo1.truPhanSo(phanSo2);
	}    
}
