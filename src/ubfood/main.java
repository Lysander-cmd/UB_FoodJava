/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfood;

/**
 *
 * @author USER
 */
public class main {

    public static void main(String[] args) {
        DataMerchant.tambahMerchant(new Merchant("Toko A", "Nasi Goreng", 15000));
        DataMerchant.tambahMerchant(new Merchant("Toko B", "Mie Ayam", 12000));
        DataMerchant.tambahMerchant(new Merchant("Toko C", "Bakso", 10000));
        DataMerchant.tampilData();
        

        Merchant merchant = DataMerchant.cariMerchant("Toko B");
        if (merchant != null) {
            DataMerchant.tampilMerchant(merchant);
        } else {
            System.out.println("Merchant tidak ditemukan!");
        }
        System.out.println("\n");
        
        merchant.setHargaMakanan(13000.0);
        DataMerchant.updateMerchant(merchant);

        DataMerchant.tampilData();
    }

}
