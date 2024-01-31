package behavioral.template.templates;


public class PhysicalProductTemplate extends OrderProcessTemplate {
    @Override
    protected void saveOrder() {
        System.out.println("Fiziksel ürün bilgileri kaydedildi.");
    }

    @Override
    protected boolean checkStock() {
        System.out.println("ERP Programından stok kontrol edildi. Stok mevcut");
        return true;
    }

    @Override
    protected boolean makePayment() {
        System.out.println("Ödeme başarılı.");
        return true;
    }

    @Override
    protected void shipOrder() {
        System.out.println("Kargoya verildi.");
    }
}
