/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfood;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DataMerchant {

    static Scanner input = new Scanner(System.in);
    static Merchant merc[] = new Merchant[100];

    public static Merchant tambahMerchant(Merchant merchant) {
        for (int i = 0; i < merc.length; i++) {
            if (merc[i] == null) {
                merc[i] = merchant;
                System.out.println("Data Merchant ke - "+ (i+1)+ ":");
                System.out.println("Nama Merchant : " + merc[i].getNamaMerchant());
                System.out.println("Nama Produk : " + merc[i].getNamaProduk());
                System.out.println("Harga Makanan : " + merc[i].getHargaMakanan());
                System.out.println("Masukan level makanan : ");
                String Level = input.nextLine();
                merchant.setLevel(Level);
                break;
            }
        }
        return null;
    }

    public static Merchant cariMerchant(String nama) {
        for (Merchant merchant : merc) {
            if (merchant != null && merchant.getNamaMerchant().equals(nama)) {
                return merchant;
            }
        }
        return null;
    }

    public static void tampilData() {

        for (Merchant merchant : merc) {
            if (merchant != null) {
                System.out.println("===Tampilan Data Merchant UBFood===");
                System.out.println("Nama Merchant: " + merchant.getNamaMerchant());
                System.out.println("Nama Produk: " + merchant.getNamaProduk());
                System.out.println("Harga Makanan: " + merchant.getHargaMakanan());
                System.out.println("Level Makanan: " + merchant.getLevel());
                System.out.println();
            }
        }
    }

    public static void tampilMerchant(Merchant merchant) {
        System.out.println("Tampilan Data Merchant UBFood yang dicari : ");
        System.out.println("Nama Merchant: " + merchant.getNamaMerchant());
        System.out.println("Nama Produk : " + merchant.getNamaProduk());
        System.out.println("Harga Makanan : " + merchant.getHargaMakanan());
        System.out.println("Level Makanan : " + merchant.getLevel());
    }

    public static void updateMerchant(Merchant merchant) {
        for (int i = 0; i < merc.length; i++) {
            if (merc[i] != null && merc[i].getNamaMerchant().equals(merchant.getNamaMerchant())) {
                System.out.println("Tampilan data sesudah diupdate : ");
                System.out.println("\n");
                merc[i] = merchant;
                break;
            }
        }
    }
}
