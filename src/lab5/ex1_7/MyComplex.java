package lab5.ex1_7;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return (imag > 0) ? real + " + " + imag + "i": real + " " + imag + "i";
    }

    public boolean isReal(){
        return imag==0;
    }

    public boolean isImaginary(){
        return real==0;
    }

    public boolean equals(double real,double imag){
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another){
        return (this.real == another.getReal() && this.imag == another.getImag());
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }

    public MyComplex addInto(MyComplex right){
        this.real += right.getReal();
        this.imag += this.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public double argument(){
        return Math.atan2(imag,real);
    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right){
        double newReal = this.real * right.getReal() - this.imag * right.getImag();
        double newImag = this.real * right.getImag() + this.imag * right.getReal();

        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right){
        double newReal = (this.real * right.getReal() + this.imag * right.getImag() / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2)));
        double newImag = (this.imag * right.getReal() - this.real * right.getImag() / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2)));

        this.real = newReal;
        this.imag = newImag;

        return this;
    }

    public MyComplex conjugate(){
        this.imag = -imag;
        return this;
    }
}
