package com.c;

import com.c.data.BlueRayDisc;

import java.util.Scanner;

/**
 * @author Mazhey Polina
 * @since JDK 15.0.2
 * @serialData
 * @version
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название диска: ");
        String nameDisc = scan.next();
        System.out.println("Введите название каталога на диске: ");
        String name_cat = scan.next();
        System.out.println("Введите количество папок в каталоге диска: ");
        int numberFol = scan.nextInt();
        System.out.println("Введите названия папок в каталоге: ");
        String[] nameFol = new String[numberFol];
        for(int i=0 ,j=0; i < numberFol; i++, j++){
            System.out.println("Введите имя " + (j+1) + " папки : " );
            nameFol[i] = scan.next();
        }
        System.out.println("Введите количество записей на диске: ");
        int numberRc = scan.nextInt();
        BlueRayDisc disc = new BlueRayDisc(nameDisc, name_cat, numberFol, nameFol, numberRc){
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
        disc.show();

        scan.close();
    }
}
