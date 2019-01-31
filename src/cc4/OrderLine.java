package cc4;

public class OrderLine {
	PurchaseOrder purchaseOrder;
    Item item;
    int quantity;
    
    public OrderLine(PurchaseOrder purchaseOrder, Item item, int quantity) {
        this.purchaseOrder = purchaseOrder;
        this.item = item;
        this.quantity = quantity;
    }
    
    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
