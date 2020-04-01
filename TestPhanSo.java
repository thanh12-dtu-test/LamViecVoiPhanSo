package application3;
import java.util.Scanner;
public class TestPhanSo {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        // tạo phân số thứ nhất
    	System.out.println("Nhap tu va mau cho phan so thu nhat");
    	System.out.print("\nTu = ");
    	int tu1=input.nextInt();
    	int mau1;
    	do {
    	System.out.print("\nMau =");
    	mau1=input.nextInt();
    	}while(mau1==0);
    	PhanSo phanSo1=new PhanSo(tu1,mau1);    
        // tạo phân số thứ hai
    	System.out.println("Nhap tu va mau cho phan so thu hai");
    	System.out.print("\nTu = ");
    	int tu2=input.nextInt();
    	int mau2;
    	do {
    	System.out.print("\nMau =");
    	mau2=input.nextInt();
    	}while(mau2==0);
    	PhanSo phanSo2=new PhanSo(tu2,mau2);
         
        // gọi phương thức cộng, trừ, nhân, chia 2 phân số
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
     
}