public class WishlistManager {
   Product head = null;
   int id = 101;

   public WishlistManager() {
   }

   void addItem(String var1, double var2) {
      Product var4 = new Product("W" + this.id, var1, var2);
      ++this.id;
      if (this.head == null) {
         this.head = var4;
      } else {
         Product var5;
         for(var5 = this.head; var5.next != null; var5 = var5.next) {
         }

         var5.next = var4;
      }

      System.out.println("Product added successfully!");
   }

   void displayAll() {
      Product var1 = this.head;
      if (this.head == null) {
         System.out.println("Wishlist is empty.");
      } else {
         while(var1 != null) {
            System.out.println(var1.id + " | " + var1.name + " | " + var1.price);
            var1 = var1.next;
         }

      }
   }

   void removeItem(String var1) {
      if (this.head == null) {
         System.out.println("Wishlist is empty.");
      } else if (this.head.id.equals(var1)) {
         this.head = this.head.next;
         System.out.println("Product removed!");
      } else {
         Product var2;
         for(var2 = this.head; var2.next != null && !var2.next.id.equals(var1); var2 = var2.next) {
         }

         if (var2.next == null) {
            System.out.println("Product not found.");
         } else {
            var2.next = var2.next.next;
            System.out.println("Product removed!");
         }

      }
   }

   void totalCost() {
      double var1 = (double)0.0F;

      for(Product var3 = this.head; var3 != null; var3 = var3.next) {
         var1 += var3.price;
      }

      System.out.println("Total Cost: " + var1);
   }
}
