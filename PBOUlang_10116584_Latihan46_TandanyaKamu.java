/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan46_tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author syhar
 */
public class PBOUlang_10116584_Latihan46_TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Age x = new Age();
        System.out.print("Masukan Tahun Lahir Anda : ");
        x.setYearBirth(scan.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir anda : "+x.getYearBirth());
        System.out.print("Hari ini Tahun : ");
        x.setYearNow(scan.nextInt());
        System.out.println("Umur kamu sampai hari ini adalah "+x.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+x.tandanyaKamu(x.hitungUmur()));
    }
    
}
