package behavioral.template.templates;

public class DigitalProductTemplate extends OrderProcessTemplate{
    @Override
    protected void saveOrder() {
        System.out.println("Dijital ürün bilgileri kaydedildi.");
    }

    @Override
    protected boolean checkStock() {
        System.out.println("Dijital ürün olduğu için stok kontrolü es geçiliyor..");
        return true;
    }

    @Override
    protected boolean makePayment() {
        System.out.println("Ödeme başarılı.");
        return true;
    }

    @Override
    protected void shipOrder() {
        System.out.println("Dijital ürün e-postaya gönderiliyor.");
    }
}
