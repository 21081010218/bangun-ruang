/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author Elang
 */
public class kubus {
    //atribut
    public int sisi ;
    public int volume ;
    //konstraktor
    public kubus(int sisi){
        this.sisi = sisi;
    }
    public void Setsisi(int sisi) {
        this.sisi = sisi;
    }
    public void ComputeandSetvolume () {
        //compute voolume
        int calculate_vol = this.sisi * this.sisi * this.sisi;
        //set volume
        this.volume = calculate_vol;
    }
    public int getvolume () {
        return this.volume;
    }
   
}



