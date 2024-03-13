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
public class Merchant {
     private String namaMerchant;
     private String namaProduk;
     private Double hargaMakanan;
     private String Level;

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }
     
     public Merchant(String namaMerchant,String namaProduk,double hargaMakanan){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
     }
    
    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public Double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(Double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
     
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//       
//        
//    }
    
}
