package me.ffkeff;

public class TestComplex implements Test{
    private final Complex complex;
    public TestComplex(Complex complex){
        this.complex = complex;
    }

    @Override
    public void Start(){
        complex.setReal(1);
        complex.setImaginary(-1);
        System.out.println("Module of z(1,-1) = " + complex.getModule());
        System.out.println("Arg of z(1, -1) = " + complex.getArgument());
        complex.Sum(2, -3);
        System.out.println("Sum z(1, -1) real = " + complex.getReal() + " imaginary = " + complex.getImaginary());
        complex.Sub(1, 2);
        System.out.println("Sub z(3, -4) real = " + complex.getReal() + " imaginary = " + complex.getImaginary());
    }
}
