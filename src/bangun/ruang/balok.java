/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author Elang
 */
public class balok {
       //atribut
    public int lebar ;
    public int tinggi ;
    public int panjang ;
    public int volume ;
    //konstraktor
    public balok(int lebar, int tinggi, int panjang){
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
    }

    public void Setlebar(int lebar) {
        this.lebar = lebar;
    }
    public void setpanjang(int panjang) {
        this.panjang = panjang;
    }
    public void settinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
    public void ComputeandSetvolume () {
        //compute voolume
        int calculate_vol = this.panjang * this.lebar * this.tinggi;
        //set volume
        this.volume = calculate_vol;
    }
    public int getvolume () {
        return this.volume;
    } 
}
