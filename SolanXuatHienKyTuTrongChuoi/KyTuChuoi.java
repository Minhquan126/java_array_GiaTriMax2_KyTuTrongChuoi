package SolanXuatHienKyTuTrongChuoi;

import java.util.Scanner;

public class KyTuChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can kiem tra : ");
        char check = scanner.nextLine().charAt(0);
        String name = "nguyen minh quan";
        int count = 0;

        int length = name.length();
        char[] newName = new char[length];
        for (int i = 0; i < length; i++) {
            newName[i] = name.charAt(i);
        }
        for (int i = 0; i < length; i++) {
            if (check == newName[i]) {
                count ++;
            }
        }
        System.out.println("count : " + count);

    }
}
