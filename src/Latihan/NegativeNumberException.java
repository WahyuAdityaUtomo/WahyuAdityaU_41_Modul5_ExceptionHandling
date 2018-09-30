/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author User
 */
public class NegativeNumberException extends Exception  {
    private int bilangan;
    NegativeNumberException(){
        
    }
    NegativeNumberException(String pesan){
        super(pesan);
    }
    NegativeNumberException(String pesan, int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}
