package baitap_buoi2;

import java.util.Scanner;

public class Bai_3 {
	static String maHS, hoDem, ten, ngaySinh, gioiTinh;
	static float tb, toan, van, li, hoa, su, dia, sinh, anh, gdcd;
	public static void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hoc sinh: ");
		maHS = sc.nextLine();
		System.out.print("Nhap ho dem: ");
		hoDem = sc.nextLine();
		System.out.print("Nhap ten: ");
		ten = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("Nhap diem Toan: ");
		toan = sc.nextFloat();
		System.out.print("Nhap diem Van: ");
		van = sc.nextFloat();
		System.out.print("Nhap diem Li: ");
		li = sc.nextFloat();
		System.out.print("Nhap diem Hoa: ");
		hoa = sc.nextFloat();
		System.out.print("Nhap diem Su: ");
		su = sc.nextFloat();
		System.out.print("Nhap diem Dia: ");
		dia = sc.nextFloat();
		System.out.print("Nhap diem Sinh: ");
		sinh = sc.nextFloat();
		System.out.print("Nhap diem Tieng Anh: ");
		anh = sc.nextFloat();
		System.out.print("Nhap diem GDCD: ");
		gdcd = sc.nextFloat();
	}
	public static void diemTB() {
		tb = (toan*2+van*2+li+hoa+su+dia+sinh+anh+gdcd)/11;
	}
	public static void inThongTin() {
		System.out.println("");
		System.out.println("Ma hoc sinh: "+maHS);
		System.out.println("Ho va ten: "+hoDem+" "+ten);
		System.out.println("Ngay sinh: "+ngaySinh);
		System.out.println("Gioi tinh: "+gioiTinh);
		System.out.format("Toan: %3.1f \t Van: %3.1f \t Li: %3.1f \t Hoa: %3.1f",toan,van,li,hoa);
		System.out.format("\nSu: %3.1f \t Dia: %3.1f \t Sinh: %3.1f \t Anh: %3.1f \t GDCD: %3.1f",su,dia,sinh,anh,gdcd);
		System.out.format("\nDiem trung binh hoc ki: %3.1f",tb);
	}
	public static void main(String[] args) {
		nhapThongTin();
		diemTB();
		inThongTin();

	}

}
