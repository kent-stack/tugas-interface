/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author KENT
 */
class MobilBekas extends Mobil {
    private final int tahun;
    private final int harga;
            
    public MobilBekas(String merek, String model, int tahun, double harga){
        super(merek, model);
        this.tahun = tahun;
        this.harga = (int) harga;
    }
    
    public int getTahun(){
        return tahun;
    }
    
    public  double getHarga(){
        return harga;
    }
    
    public void info(){
        System.out.println("Mobil Bekas : " + getMerek() + " " + getModel() + "(" + tahun + ")");
    }
}
