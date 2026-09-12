package strings.assignment_problems;

public class ProductInventoryParser {
    
    public void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        
        String productName = fields[0].trim();
        String sku = fields[1].trim();
        String quantity = fields[2].trim();
        
        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", productName, sku, quantity);
    }
    
    public static void main(String[] args) {
        ProductInventoryParser parser = new ProductInventoryParser();
        
        System.out.println("=== Product Inventory CSV Parser ===\n");
        
        parser.parseInventoryRecord("Wireless Mouse,WM-2201,150");
        parser.parseInventoryRecord("Wireless Mouse,150");
        parser.parseInventoryRecord("USB Cable,UC-5001,500");
    }
}
