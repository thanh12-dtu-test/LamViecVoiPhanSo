package application3;

public class PhanSo {
    private int tu, mau;
 
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
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void rutGon() {
        int i = UCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void congPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.rutGon();
        System.out.println("Tong hai phan so = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void truPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.rutGon();
        System.out.println("Hieu hai phan so = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
     
    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.rutGon();
        System.out.println("Tich hai phan so = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.rutGon();
        System.out.println("Chia hai phan so = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
     
}

