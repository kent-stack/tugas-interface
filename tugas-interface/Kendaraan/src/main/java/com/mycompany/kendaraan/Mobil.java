/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;

/**
 *
 * @author KENT
 */

interface Kendaraan {
    void info();
}
class Mobil implements Kendaraan{
    private final String merek;
    private final String model;
    
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
        
    }
    
    public String getMerek(){
        return merek;
    }
    
    public String getModel(){
        return model;
    }   
    
    public void info(){
        System.out.println("Mobil : " + merek + " " + model);
    }
}


