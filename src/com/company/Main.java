package com.company;
import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        float inAlas,inTinggi,inTegak;
        String pilihan;
        Scanner Inp = new Scanner(System.in);
        System.out.println("PROGRAM KALKULATOR PRISMA SEDERHANA");
        System.out.println("");
        do {
            System.out.println("Masukan Ukuran Alas : ");
            inAlas = Inp.nextFloat();
            System.out.println("Masukan Ukuran Tinggi : ");
            inTinggi = Inp.nextFloat();
            System.out.println("Masukan Ukuran Tegak : ");
            inTegak = Inp.nextFloat();
            Prisma A = new Prisma(inAlas, inTinggi, inTegak);
            do{
                System.out.println("Masukan Pilihan yang ingin dicari[a,b,c,d]:");
                System.out.println("a.Keliling Prisma");
                System.out.println("b.Luas Prisma");
                System.out.println("c.Volume Prisma");
                System.out.println("d.Luas atap/alas dan Luas atap+alas Prisma");
                pilihan = Inp.next();
                if(pilihan.equals("a")){
                    System.out.println(A.hitungKeliling(inAlas,inTinggi));
                } else if(pilihan.equals("b")){
                    System.out.println(A.hitungLuas(inAlas,inTinggi,inTegak));
                } else if(pilihan.equals("c")){
                    System.out.println(A.hitungVolume(inAlas,inTinggi,inTegak));
                } else if(pilihan.equals("d")){
                    A.luasTutupAlas(inAlas,inTinggi);
                }
                System.out.println("Apakah anda ingin menghitung pilihan lain?[Yes/No]");
                pilihan=Inp.next();

            }while(pilihan.equals("Yes"));

            System.out.println("Apakah anda ingin menghitung prisma baru?[Y/N]");
            pilihan=Inp.next();

        }while(pilihan.equals("Y"));
        System.out.println("Terima Kasih sudah menggunakan Program Kami, silahkan berikan masukan anda di PlayStore");
    }
}
