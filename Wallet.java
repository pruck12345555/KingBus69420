public class Wallet {
    private double amount;
    private double cumulativePurchase;
    private int point;

    public void topUp(double amount) {
        // เติมเงิน
        this.amount = amount;
        // เก็บประวัติการเติมเงิน (optional)
    }

    public void purchase(double spent) {
        // ตัดเงิน
        this.amount -= spent;
        // เพิ่มยอดใช้จ่ายสะสม
        this.cumulativePurchase += spent;
        // คำนวณการสะสมแต้มจากยอดใช้จ่าย
        this.point += spent/50;
        // เก็บประวัติการใช้จ่าย (optional)
    }

    public void usePoint(int point) {
        // คำนวณการใช้แต้ม
        this.point -= point;
        // เก็บประวัติการใช้แต้ม (optional)
    }

    public double getAmount() {
        return amount;
    }

    public double getCumulativePurchase() {
        return cumulativePurchase;
    }

    public int getPoint() {
        return point;
    }
    // getters
}