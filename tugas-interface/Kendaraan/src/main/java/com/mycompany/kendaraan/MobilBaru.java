/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author KENT
 */
class MobilBaru extends Mobil {
    private final String garansi;
    
    public MobilBaru(String merek, String model, String garansi){
        super(merek, model);
        this.garansi = garansi;
    }
    
    public String getGaransi(){
        return garansi;
    }
    
    public void info(){
        System.out.println("Mobil Baru : " + getMerek() + " " + getModel() + "(Garansi : " + garansi + ")");
    }
}
