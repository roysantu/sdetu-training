package cc4;

public class PurchaseOrder {
	private int id;
    private String customerName;
    private OrderLine[] orderLineArray;

    public PurchaseOrder(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public OrderLine[] getOrderLineArray() {
        return orderLineArray;
    }

    public void setOrderLineArray(OrderLine[] orderLineArray) {
        this.orderLineArray = orderLineArray;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String userName) {
        this.customerName = userName;
    }
    
    void displayItemDetails(PurchaseOrder purchaseOrderObj)
    {
        int i;
        System.out.println("Order list of "+purchaseOrderObj.getCustomerName()+" :");
        //String tempOut = String.format("%-15s %-15s %-15s %s\n","Item Id","Name","Price","Quantity");
        System.out.format("%-15s %-15s %-15s %s\n","Item Id","Name","Price","Quantity");
        
        //System.out.println(tempOut);
        int size = 0;
        for(i=0;i<purchaseOrderObj.orderLineArray.length;i++)
            if(purchaseOrderObj.orderLineArray[i] != null)
                size++;
        
        for(i=0;i<size;i++)
        {
            System.out.format("%-15s%-15s%-15d%d\n"
                    ,purchaseOrderObj.getOrderLineArray()[i].getItem().getId() 
                    ,purchaseOrderObj.getOrderLineArray()[i].getItem().getName()
                    ,purchaseOrderObj.getOrderLineArray()[i].getItem().getPrice()
                    ,purchaseOrderObj.getOrderLineArray()[i].getQuantity());
        }
    }
}
