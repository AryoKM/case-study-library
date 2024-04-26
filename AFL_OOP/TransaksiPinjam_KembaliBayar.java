import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TransaksiPinjam_KembaliBayar {
    private int KDTransaksi;
    private int IDIdent;
    private int IDPustakawan;
    private int ISBN_ISSN;
    private int KCD;
    private String statusRusak;
    private String totalRusak;
    private String jumlahDenda;
    private int hargaTotal;
    private int tanggalPinjam;
    private int tanggalKembali;

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\USER\\Desktop\\testAFLOOP\\output\\output.txt");
            fileWriter.write("Welcome to the TransaksiPinjam_KembaliBayar System\n\n");

            TransaksiPinjam_KembaliBayar transaksi = new TransaksiPinjam_KembaliBayar();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan KDTransaksi:");
            transaksi.setKDTransaksi(scanner.nextInt());

            System.out.println("Masukkan IDIdent:");
            transaksi.setIDIdent(scanner.nextInt());

            System.out.println("Masukkan IDPustakawan:");
            transaksi.setIDPustakawan(scanner.nextInt());

            System.out.println("Masukkan ISBN_ISSN:");
            transaksi.setISBN_ISSN(scanner.nextInt());

            System.out.println("Masukkan KCD:");
            transaksi.setKCD(scanner.nextInt());

            System.out.println("Masukkan Status Rusak:");
            transaksi.setStatusRusak(scanner.next());

            System.out.println("Masukkan Total Rusak:");
            transaksi.setTotalRusak(scanner.next());

            System.out.println("Masukkan Jumlah Denda:");
            transaksi.setJumlahDenda(scanner.next());

            System.out.println("Masukkan Harga Total:");
            transaksi.setHargaTotal(scanner.nextInt());

            System.out.println("Masukkan Tanggal Pinjam:");
            transaksi.setTanggalPinjam(scanner.nextInt());

            System.out.println("Masukkan Tanggal Kembali:");
            transaksi.setTanggalKembali(scanner.nextInt());

            scanner.close();

            fileWriter.write("Transaksi Details:\n");
            fileWriter.write("KDTransaksi: " + transaksi.getKDTransaksi() + "\n");
            fileWriter.write("IDIdent: " + transaksi.getIDIdent() + "\n");
            fileWriter.write("IDPustakawan: " + transaksi.getIDPustakawan() + "\n");
            fileWriter.write("ISBN_ISSN: " + transaksi.getISBN_ISSN() + "\n");
            fileWriter.write("KCD: " + transaksi.getKCD() + "\n");
            fileWriter.write("Status Rusak: " + transaksi.getStatusRusak() + "\n");
            fileWriter.write("Total Rusak: " + transaksi.getTotalRusak() + "\n");
            fileWriter.write("Jumlah Denda: " + transaksi.getJumlahDenda() + "\n");
            fileWriter.write("Harga Total: " + transaksi.getHargaTotal() + "\n");
            fileWriter.write("Tanggal Pinjam: " + transaksi.getTanggalPinjam() + "\n");
            fileWriter.write("Tanggal Kembali: " + transaksi.getTanggalKembali() + "\n");

            fileWriter.close();
            System.out.println("Transaksi Details tersimpan sebagai Transaksi_Details.txt");
        } catch (IOException e) {
            System.out.println("Error menyimpan file.");
            e.printStackTrace();
        }
    }

    public int getKDTransaksi() {
        return KDTransaksi;
    }

    public void setKDTransaksi(int KDTransaksi) {
        this.KDTransaksi = KDTransaksi;
    }

    public int getIDIdent() {
        return IDIdent;
    }

    public void setIDIdent(int IDIdent) {
        this.IDIdent = IDIdent;
    }

    public int getIDPustakawan() {
        return IDPustakawan;
    }

    public void setIDPustakawan(int IDPustakawan) {
        this.IDPustakawan = IDPustakawan;
    }

    public int getISBN_ISSN() {
        return ISBN_ISSN;
    }

    public void setISBN_ISSN(int ISBN_ISSN) {
        this.ISBN_ISSN = ISBN_ISSN;
    }

    public int getKCD() {
        return KCD;
    }

    public void setKCD(int KCD) {
        this.KCD = KCD;
    }

    public String getStatusRusak() {
        return statusRusak;
    }

    public void setStatusRusak(String statusRusak) {
        this.statusRusak = statusRusak;
    }

    public String getTotalRusak() {
        return totalRusak;
    }

    public void setTotalRusak(String totalRusak) {
        this.totalRusak = totalRusak;
    }

    public String getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(String jumlahDenda) {
        this.jumlahDenda = jumlahDenda;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public int getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(int tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public int getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(int tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
}