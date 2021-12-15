package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Klavyeden alınan matematik,fizik,kimya,türkçe,tarih ve müzik notlarının ortalamasını bulan ve ortalama 50'den
        büyükse geçti, değilse kaldı çıktısını veren program.(İf-else kullanmadan)
	 */
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = klavye.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = klavye.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = klavye.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = klavye.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = klavye.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = klavye.nextInt();
        int toplam = (matematik + turkce + tarih + fizik + muzik + kimya);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız: " + ortalama);
        boolean sonuc = (ortalama >= 50);
        String str = sonuc ? "Sınıfı geçtiniz" : "Sınıfı geçemediniz";
        System.out.println(str);


    }
}
