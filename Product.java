public class Product {
   String id;
   String name;
   double price;
   Product next;

   public Product(String var1, String var2, double var3) {
      this.id = var1;
      this.name = var2;
      this.price = var3;
      this.next = null;
   }
}
