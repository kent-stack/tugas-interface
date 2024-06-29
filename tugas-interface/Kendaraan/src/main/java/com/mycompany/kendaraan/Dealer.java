/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author KENT
 */
class Dealer {
    private final String nama;
    private final MobilBaru mobilBaru;
    private final MobilBekas mobilBekas;
    
    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas){
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void info(){
        System.out.println("Dealer : " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
