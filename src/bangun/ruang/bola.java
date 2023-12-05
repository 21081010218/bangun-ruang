/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author Elang
 */
public class bola {
     //atribut
    public int radius ;
    public int volume ;
    //konstraktor
    public bola(int radius){
        this.radius = radius;  
    }
    public void setradius(int radius) {
        this.radius = radius;
    }
    public void ComputeandSetvolume () {
        //compute voolume
        int calculate_vol =  22/7*4/3*this.radius*this.radius*this.radius;
        //set volume
        this.volume = calculate_vol;
    }
    public int getvolume () {
        return this.volume;
    }
}
