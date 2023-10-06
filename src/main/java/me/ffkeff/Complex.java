package me.ffkeff;

import java.lang.Math;

public class Complex {

    private double real;
    public void setReal(double real){
        this.real = real;
    }
    public double getReal(){
        return real;
    }

    private double imaginary;
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    public double getImaginary(){
        return imaginary;
    }

    public Complex(){
        real = 0;
        imaginary = 0;
    }

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getModule(){
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    public double getArgument(){
        if(real > 0)
            return Math.atan(imaginary / real);

        if(real < 0 && imaginary >= 0)
            return Math.PI + Math.atan(imaginary / real);

        if(real < 0 && imaginary < 0)
            return -Math.PI + Math.atan(imaginary / real);

        if(real == 0 && imaginary > 0)
            return Math.PI / 2;

        if(real == 0 && imaginary < 0)
            return -Math.PI / 2;

        return 0;
    }

    public void Sum(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void Sub(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
}
