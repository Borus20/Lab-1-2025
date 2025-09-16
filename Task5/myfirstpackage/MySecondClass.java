package myfirstpackage;

public class MySecondClass {
    private int num1;
    private int num2;
    public MySecondClass(int n1, int n2) { this.num1 = n1; this.num2 = n2; }
    public void setNum1(int num1) { this.num1 = num1; }
    public void setNum2(int num2) { this.num2 = num2; }
    public int multiply() { return this.num1 * this.num2; }
}