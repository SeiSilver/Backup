package Core;

interface Hinhhoc {

    public double EnterRadius(double n);

    public double TinhChuVi();

    public double TinhDienTich();

    public void PrintRes();

}

public class Main implements Hinhhoc {
    private double n;

    public static void main(String[] args) {
	Main m = new Main(4);
	m.PrintRes();

    }

    public Main(double n) {
	super();
	this.n = n;
    }

    @Override
    public double EnterRadius(double x) {
	return x;
    }

    @Override
    public double TinhChuVi() {
	return Math.PI * EnterRadius(n) * 2;

    }

    @Override
    public double TinhDienTich() {
	return Math.PI * Math.pow(EnterRadius(n), 2);

    }

    @Override
    public void PrintRes() {
	System.out.println("Chu vi: " + TinhChuVi());
	System.out.println("Dien tich: " + TinhDienTich());
    }

}