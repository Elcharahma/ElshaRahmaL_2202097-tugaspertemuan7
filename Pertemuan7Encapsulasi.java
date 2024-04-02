/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.pertemuan7.pertemuan7encapsulasi;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class Pertemuan7Encapsulasi {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        
        System.out.println("Masukkan nilai a b c d e f : ");
        double a = nilai.nextDouble();
        double b = nilai.nextDouble();
        double c = nilai.nextDouble();
        double d = nilai.nextDouble();
        double e = nilai.nextDouble();
        double f = nilai.nextDouble();
        
        LinearEquation bilangan = new LinearEquation(a,b,c,d,e,f);
        
        if(bilangan.isSolve()){
            System.out.println("Solusi nilai X = "+bilangan.getX()+ " dan Y = "+bilangan.getY());
        }else{
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}
