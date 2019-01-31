package cc4;
import java.io.*;

public class Main {
public static void main(String[] args) throws Exception {
        
        int i,itemNumber;// tempID, tempPrice;
        int j,choice;
        int id;
        int quantity;
        //String tempName;
        //int initialItemcount = 5;
        
        PurchaseOrder purchaseOrderObj = new PurchaseOrder(125, "Mathews");
        PurchaseBO purchaseBOObj = new PurchaseBO();
        Item itemArray[] = new Item[5];
        
        itemArray[0] = new Item(1,"Samsung Mobile",10599);
        itemArray[1] = new Item(2,"Dell Laptop",32999);
        itemArray[2] = new Item(3,"Lenovo Laptop",35000);
        itemArray[3] = new Item(4,"Mac Book",89499);
        itemArray[4] = new Item(5,"Sony Headset",2499);
            
        OrderLine[] orderLineArray = new OrderLine[30];
        
        orderLineArray[0] = new OrderLine(purchaseOrderObj,itemArray[0], 25);
        orderLineArray[1] = new OrderLine(purchaseOrderObj,itemArray[1], 15);
        orderLineArray[2] = new OrderLine(purchaseOrderObj,itemArray[2], 45);
        orderLineArray[3] = new OrderLine(purchaseOrderObj,itemArray[3], 24);
        orderLineArray[4] = new OrderLine(purchaseOrderObj,itemArray[4], 20);
        
        purchaseOrderObj.setOrderLineArray(orderLineArray);
        
        String itemDetails;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            do
            {
                System.out.println("1. Add new item\n2. Update order line\n3. Display\n4. Exit\nEnter your choice :");
                choice = Integer.parseInt(br.readLine());
                switch (choice) {
                    case 1:
                         System.out.println("Enter number of items :");
                         itemNumber = Integer.parseInt(br.readLine());
                         Item newitemArray[] = new Item[itemArray.length + itemNumber];
                         //copy old array to new
                         for(j=0; j<itemArray.length;j++){
                        	 newitemArray[j] = itemArray[j];
                         }
                         //
                         for(j=0;j<itemNumber;j++)
                         {
                             System.out.println("Enter item "+(j+1)+" details :");
                             itemDetails = br.readLine();
                             System.out.println("Enter quantity :");
                             quantity = Integer.parseInt(br.readLine());
                             String splited[] = itemDetails.split(",");             
                 			 newitemArray[itemArray.length + j] = new Item(Integer.parseInt(splited[0]),splited[1],Integer.parseInt(splited[2]));
                             // fill code here.
                 			 orderLineArray[itemArray.length + j] = new OrderLine(purchaseOrderObj,newitemArray[itemArray.length + j], quantity);
                             
                         }
                         
                         purchaseOrderObj.setOrderLineArray(orderLineArray);
                         System.out.println("Item has been added");
                         purchaseOrderObj.displayItemDetails(purchaseOrderObj);
                        break;
                    case 2:
                      
                        System.out.println("Enter the item id you want to update :");
                        id = Integer.parseInt(br.readLine());
                        System.out.println("Enter the quantity :");
                        quantity = Integer.parseInt(br.readLine());
						
                        
                        // fill code here.
						
                        System.out.println("Item has been updated");
                        break;
                    case 3:
                    	
                    	purchaseOrderObj.displayItemDetails(purchaseOrderObj);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        break;
                }
            }while(choice!=4);
    }
}
