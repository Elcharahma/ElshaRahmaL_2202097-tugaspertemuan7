/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.pertemuan7.pertemuan7encapsulasi;

/**
 *
 * @author ELSHA
 */
public class LinearEquation {
    private double a,b,c,d,e,f;
    
//Konstruktor kosong
 public LinearEquation(){
     
 }

//Method setter
 public LinearEquation(double a, double b, double c, double d, double e, double f){
     this.a = a;
     this.b = b;
     this.c = c;
     this.d = d;
     this.e = e;
     this.f = f;
 }
 
//Method GET
public double getA(){
    return a;
}

public double getB(){
    return b;
}
public double getC(){
    return c;
}
public double getD(){
    return d;
}
public double getE(){
    return e;
}
public double getF(){
    return f;
}

//Method isSolve
public boolean isSolve(){
    return (a * d - b * c )!=0;
}

//Method mengembalikasi persama X dan Y
public double getX(){
    return (e * d - b * f) / (a * d - b * c);
}

public double getY(){
    return (a * f - e * c) / (a * d - b * c);
}
}