/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author emman
 */
//  12/09/2023
public class Numeros {
    //Atributos
    private byte numByte;
    private int numInt;
    private float numFloat;
    private double numDouble;
    
    //Constructores
    public Numeros() {
        numByte = 0;
        numInt = 0;
        numFloat = 0;
        numDouble = 0;
    }

    public Numeros(byte numByte, int numInt, float numFloat, double numDouble) {
        this.numByte = numByte;
        this.numInt = numInt;
        this.numFloat = numFloat;
        this.numDouble = numDouble;
    }
    
    //GETTER Y SETTER
    public byte getNumByte() {
        return numByte;
    }

    public void setNumByte(byte numByte) {
        this.numByte = numByte;
    }

    public int getNumInt() {
        return numInt;
    }

    public void setNumInt(int numInt) {
        this.numInt = numInt;
    }

    public float getNumFloat() {
        return numFloat;
    }

    public void setNumFloat(float numFloat) {
        this.numFloat = numFloat;
    }

    public double getNumDouble() {
        return numDouble;
    }

    public void setNumDouble(double numDouble) {
        this.numDouble = numDouble;
    }
    
    //MÉTODOS DE CLASE
    public Numeros generarDatosAleatorios(){
        Random azar = new Random();
        DecimalFormat df = new DecimalFormat("#.###");
        
        numByte = (byte)azar.nextInt(256);
        numInt =  azar.nextInt();
        numFloat = Float.parseFloat(df.format(azar.nextInt(10)+azar.nextFloat()));
        numDouble = Double.parseDouble(df.format((azar.nextInt())+azar.nextDouble()));
                
        return new Numeros(numByte,numInt,numFloat,numDouble);     
    }
 }
    
    
    

