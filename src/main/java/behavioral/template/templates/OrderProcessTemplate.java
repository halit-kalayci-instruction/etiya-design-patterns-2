package behavioral.template.templates;

public abstract class OrderProcessTemplate {
    public final void process()
    {
        if(!checkStock())
            throw new RuntimeException("Stok bulunmuyor!");
        if(!makePayment())
            throw new RuntimeException("Ödeme başarısız");
        saveOrder();
        shipOrder();
    }

    protected abstract void saveOrder();
    protected abstract boolean checkStock();
    protected abstract boolean makePayment();
    protected abstract void shipOrder();
}
