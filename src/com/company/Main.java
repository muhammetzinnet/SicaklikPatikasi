package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int derece;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz = ");
        derece = scanner.nextInt();

        if (derece<5){
            System.out.println("Kaymaya gide bilirsin...");
        }else if (derece>=5 && derece<=25){
            int tercih;
            System.out.println("İki tercih yapabilirsin hangisine gitmek istersin ???");
            System.out.print("Sinamayamı? yoksa piknikmi yapmayamı? \n1-Sinama  2-Piknik\n ");
            Scanner input = new Scanner(System.in);
            tercih = input.nextInt();
            switch (tercih){
                case 1:
                    System.out.println("Sinamaya gidebilirsin...");
                    break;
                case 2:
                    System.out.println("Piknik için gayet uygun...");
                    break;
            }
        }else {
            System.out.println("Yüzmeye gidebilirsin...");
        }
    }
}
