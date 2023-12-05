/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author Elang
 */
public class tabung {
     //atribut
    public int tinggi ;
    public int radius ;
    public int volume ;
    //konstraktor
    public tabung(int tinggi,int radius){
        this.tinggi = tinggi;
        this.radius = radius;
        
    }
    public void Settinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public void setradius(int radius) {
        this.radius = radius;
    }
    public void ComputeandSetvolume () {
        //compute voolume
        int calculate_vol =  22/7*2*this.radius * this.tinggi;
        //set volume
        this.volume = calculate_vol;
    }
    public int getvolume () {
        return this.volume;
    }
}

