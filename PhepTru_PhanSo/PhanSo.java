package PhepTru_PhanSo;

public class PhanSo {
	public int tu, mau;
	public PhanSo() {
		tu=0;
	    mau=1;
	}
	public PhanSo(int tu, int mau) {
		super();
	    this.tu = tu;
	    this.mau = mau;
	}  
	public int getTu() {
	    return tu;
	}
	public void setTu(int tu) {
	    this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
	    this.mau = mau;
	}
	public int UCLN(int a, int b) {
		while (a != b) {
			if (a > b) a -= b;
	        else b -= a;
		}
	    return a;
	}
	public void rutGon() {
		int i = UCLN(this.getTu(), this.getMau());
	    this.setTu(this.getTu() / i);
	    this.setMau(this.getMau() / i);
	}      
	public void truPhanSo(PhanSo ps) {
		int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
	    int ms = this.getMau() * ps.getMau();
	    PhanSo phanSoHieu = new PhanSo(ts, ms);
	    phanSoHieu.rutGon();
	    System.out.println("Hieu hai phan so = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
	}
}
