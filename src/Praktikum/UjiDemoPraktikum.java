/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author User
 */
public class UjiDemoPraktikum extends Exception {
    private int bilangan;
    UjiDemoPraktikum(){
    }
    UjiDemoPraktikum(String pesan){
        super(pesan);
    }
    UjiDemoPraktikum(String pesan, int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}
