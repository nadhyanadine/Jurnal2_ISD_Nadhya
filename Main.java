public class Main {
    private static void main(String[] Args) {
        KelasGenerik<ATK> listATK = new KelasGenerik<>(0);
        KelasGenerik<Bag> listBag = new KelasGenerik<>(0);

        listATK.addData(new ATK("A001", "Spidol", "Snowman Board Maker warna hitam", 10));
        listATK.addData(new ATK("A002", "Pensil", "Pensil warna hitam", 20));
        listATK.addData(new ATK("A003", "Pulpen", "Pulpen warna haitam", 30));
        listATK.addData(new ATK("B001", "Buku Tulis", "Buku Tulis warna hitam", 10));
        listATK.addData(new ATK("B007", "Kertas HVS", "Kertas HVS ukuran A4", 20));

        listBag.addData(new Bag("C001", "Tas", "Tas warna hitam", 30));
        listBag.addData(new Bag("C002", "Cliper", "Cliper warna putih", 20));
        listBag.addData(new Bag("C003", "Tipe X", "Joyko", 10));
        listBag.addData(new Bag("C004", "Kacamata", "Kacamata besi", 10));
        listBag.addData(new Bag("C005", "Mouse", "Mouse Logitech", 60));
    
        
  }
}