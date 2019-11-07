/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan46_tandanyakamu;

/**
 *
 * @author syhar
 */
public class Age {
    public static final String ANSI_RED ="\u001B[31m";
    public static final String ANSI_RESET ="\u001B[0m";
    private int yearBirth;
    private int yearNow;
    private String red;
    
    
    public int age(int yearNow){
        return this.yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public void setYearNow(int yearNow) {
        this.yearNow = yearNow;
    }
    public int hitungUmur(){
        int umur = yearNow - getYearBirth()   ; 
        return umur;
    }
    
    public String tandanyaKamu(int umur){
        if (umur>=0&&umur<=5) {
            red = ANSI_RED+ "Lagi lucu-lucunya"+ANSI_RESET;                    
        }
        else if (umur>5&&umur<=10) {
            red = ANSI_RED+ "Masih Anak-Anak"+ANSI_RESET;                    
        }
        else if (umur>10&&umur<=13) {
            red = ANSI_RED+ "Masih Remaja"+ANSI_RESET;                    
        }
        else if (umur>13&&umur<=19) {
            red = ANSI_RED+ "Alay"+ANSI_RESET;                    
        }
        else if (umur>19&&umur<=29) {
            red = ANSI_RED+ "Laagi Galau Nyari Jodoh"+ANSI_RESET;                    
        }
        else if (umur>29&&umur<=35) {
            red = ANSI_RED+ "Lagi Sibuk Nyari Uang"+ANSI_RESET;                    
        }
        else if (umur>35&&umur<=150) {
            red = ANSI_RED+ "Sudah Tua"+ANSI_RESET;                    
        }
        else
            red = ANSI_RED+ "Tidak Terdeteksi"+ANSI_RESET;
        return red;
    }
        
       
    
}
