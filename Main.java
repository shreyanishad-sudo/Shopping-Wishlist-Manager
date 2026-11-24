import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      WishlistManager var2 = new WishlistManager();

      int var3;
      do {
         System.out.println("\n ------ SHOPPING WISHLIST MANAGER ------");
         System.out.println("1. Add Product");
         System.out.println("2. Display Wishlist");
         System.out.println("3. Remove Product");
         System.out.println("4. Calculate Total Cost");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         var3 = var1.nextInt();
         var1.nextLine();
         switch (var3) {
            case 1:
               System.out.print("Enter product name: ");
               String var4 = var1.nextLine();
               System.out.print("Enter product price: ");
               double var5 = var1.nextDouble();
               var2.addItem(var4, var5);
               break;
            case 2:
               var2.displayAll();
               break;
            case 3:
               System.out.print("Enter product ID: ");
               String var7 = var1.nextLine();
               var2.removeItem(var7);
               break;
            case 4:
               var2.totalCost();
               break;
            case 5:
               System.out.println("Thank you for using Wishlist Manager!");
               break;
            default:
               System.out.println("Invalid choice!");
         }
      } while(var3 != 5);

      var1.close();
   }
}
