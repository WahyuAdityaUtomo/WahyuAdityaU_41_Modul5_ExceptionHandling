/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasRumah;

/**
 *
 * @author User
 */
public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Membaca Larik");
        int [] larik = new int[10];
        try{
            larik[50] = 77;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Kesalahan Array");
        }
        catch(Exception e){
            System.out.println("Kesalahan Umum");
        }
        catch(Throwable t){
            System.out.println("Throwable"); 
        }
        System.out.println("Penyebab Eksepsi");
    }
}
