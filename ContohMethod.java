public class ContohMethod {
    public static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }
    public static void main(String[] args) {
        int sisi = 10;
        int luas = hitungLuasPersegi(sisi);
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }
}