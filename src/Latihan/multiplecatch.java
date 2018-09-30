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
public class multiplecatch {
    public static void main(String[] args) {
        String nama = ("Wahyu Aditya Utomo");
        String asal = ("Blitar");
        int nilai = 0;
    try
    {
        int a = 3/0;//berpotensi untuk menimbulkan kesalahan yaitu dg pembagian bil 0  
        int num = Integer.parseInt(args[0]);
        System.out.println("Perintah Selanjutnya...");
        System.out.println("nama : "+nama);
        System.out.println("asal : "+asal);
        System.out.println("nilai : "+nilai);
        }
    catch(ArrayIndexOutOfBoundsException e){
    }
    catch(NullPointerException e){
        
    }
    catch(Exception e){
        
    }
    }
}
