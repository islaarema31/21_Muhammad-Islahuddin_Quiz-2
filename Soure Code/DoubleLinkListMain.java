/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;
import java.util.Scanner;
/**
 *
 * @author Muhammad Islahuddin
 */
public class DoubleLinkListMain {
    public static void menu() {
        System.out.println("\nPilih Menu:");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan by Nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
        System.out.println("-------------------");
    }

    public static void main(String[] args) throws Exception {
        DoubleLinkList dll = new DoubleLinkList();
        Scanner sc = new Scanner(System.in);
        int nomorAntrian = 0;
        int pilih;
        String[] nama = {"Ani", "Andi", "Budi", "Ana"};
        String[] nohp  = {"122333", "111111", "222222", "2222222"};
        int[] kodePesanan = {1,2,3,4};
        String[] namaPesanan = {"Jamur Goreng", "Mie Godog", "Nasi PAdang", "Soto Madura"};
        int[] harga = {25000, 15000, 25000, 15000};
        
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {

                case 1:
                    Pembeli pb = new Pembeli(nama[nomorAntrian], nohp[nomorAntrian], kodePesanan[nomorAntrian]);
                    Pesanan ps = new Pesanan(kodePesanan[nomorAntrian], harga[nomorAntrian], namaPesanan[nomorAntrian]);
                    dll.addLast(pem, pes);
                    System.out.println("Nomor Antrian : " + nomorAntrian+1);
                    System.out.println("Nama Customer : " + nama[nomorAntrian]);
                    System.out.println("Nomor Hp : " + nohp[nomorAntrian]);
                    nomorAntrian++;
                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                   
                    break;
                case 4:
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.print("Terima Kasih");
                    break;
                
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
