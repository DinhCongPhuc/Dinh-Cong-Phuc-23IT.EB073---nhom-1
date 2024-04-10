package Bai_kiem_tra_giua_ki_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QLNV {
	Employee em[] = new Employee[0];
	 public void ThemNhanVienExperience () {
		 Scanner sc = new Scanner(System.in);
		 Experience e = new Experience();
		        System.out.print("Nhap ID: ");
		        e.setID(sc.nextInt());
		        sc.nextLine();
		        System.out.print("Nhap ten: ");
		        e.setFullName(sc.nextLine());
		        System.out.print("Nhap ngay sinh: ");
		        e.setBirthDay(sc.nextLine());
		        System.out.print("Nhap email: ");
		        e.setEmail(sc.nextLine());
		        System.out.print("Nhap so nam kinh nghiem: ");
		        e.setExpInYear(sc.nextInt());
		        sc.nextLine();
		        System.out.print("Nhap ky nang chuyen mon: ");
		        e.setProSkill(sc.nextLine());
		        em = Arrays.copyOf(em, em.length + 1);
		        em[em.length - 1] = e;
		    }

		    public void HienThiDS() {
		        for (int i = 0; i < em.length; i++) {
		            System.out.println(em[i].toString() + "\n");
		        }
		    }

	 }

