package com.company;

public class Prisma {
    float tinggi;
    float alas;
    float tegak;
    float keliling;
    float luas;
    float volume;

    public Prisma(float alas, float tinggi, float tegak){
        this.alas=alas;
        this.tinggi=tinggi;
        this.tegak=tegak;
    }

    public void setKeliling(float keliling) {
        this.keliling = keliling;
    }

    public void setLuas(float luas) {
        this.luas = luas;
    }

    public String hitungLuas(float alas, float tinggi, float tegak ){
        luas = alas * tegak + alas * tinggi * 3;
        return("luas: "+luas+"cm2");
    }

    public String hitungKeliling(float alas, float tinggi){
        keliling = alas*6+tinggi*3;
        return("keliling: "+keliling+"cm2");
    }

    public String hitungVolume(float alas,float tinggi,float tegak){
        volume = ((alas*tegak)/2)*tinggi;
        return("volume:"+volume+"cm3");
    }

    void luasTutupAlas(float alas,float tinggi){
        luas = alas*tinggi/2;
        System.out.println("luas salah satu tutup/alas: "+luas+"cm2");
        luas = luas*2;
        System.out.println("luas tutup dan alas: "+luas+"cm2");
    }
}

