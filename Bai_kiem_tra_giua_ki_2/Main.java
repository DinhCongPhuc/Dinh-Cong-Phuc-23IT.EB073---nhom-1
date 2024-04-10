package Bai_kiem_tra_giua_ki_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QLNV ql = new QLNV();
        int chon = 0;
        boolean check = true;
        while (check != false) {
            System.out.println(
                    "1.Them tai khoan\n2.Hien thi danh sach\nchon bat ky de thoat.\nchon");
            Scanner k = new Scanner(System.in);
            chon = k.nextInt();
            switch (chon) {
                case 1:
                    ql.ThemNhanVienExperience();
                    break;
                case 2:
                    ql.HienThiDS();
                    break;
                case 3:
                    
	}
        }
	}
}
