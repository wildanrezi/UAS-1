/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

/**
 *
 * @author User
 */
public class TumpukanApp {
    public static void main(String args[]){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(1);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println("nilai teratas = " + tumpukan.peek());
        System.out.println("Nama saya adalah Wildan Rezi Ramdhani");
        System.out.println("nilai yang dihapus = " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
}
}