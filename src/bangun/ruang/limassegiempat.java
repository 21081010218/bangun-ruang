/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author Elang
 */
public class limassegiempat {
   //atribut
    public int sisi ;
    public int tinggi ;
    public int volume ;
    //konstraktor
    public limassegiempat(int sisi, int tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public void Setsisi(int sisi) {
        this.sisi = sisi;
    }
    public void settinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
    public void ComputeandSetvolume () {
        //compute voolume
        int calculate_vol = (this.sisi*this.sisi * this.tinggi) /3 ;
        //set volume
        this.volume = calculate_vol;
    }
    public int getvolume () {
        return this.volume;
    }
   
}
