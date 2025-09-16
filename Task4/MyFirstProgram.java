class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        for (int i = 1; i <= 8; i++) {
            for(int j = 1; j <= 8; j++) {
                o.setNum1(i);
                o.setNum2(j);
                System.out.print(o.multiply() + "\t");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int num1;
    private int num2;

    // конструктор
    public MySecondClass(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public void setNum1(int num1) {this.num1 = num1;}
    public void setNum2(int num2) {this.num2 = num2;}

    public int multiply() { 
        return this.num1 * this.num2; 
    }
}