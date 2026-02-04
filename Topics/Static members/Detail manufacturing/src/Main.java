import java.util.Scanner;

class ManufacturingController {
    // here you may declare a field
    public static int productCount = 0;

    public static String requestProduct(String product) {
        // write your code here
        productCount++;
        return String.format("%d. Requested %s", productCount, product);
    }

    public static int getNumberOfProducts() {
        // write your code here
        return productCount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();

            if (product.trim().isEmpty()) {
                System.out.println(ManufacturingController.getNumberOfProducts());
            } else {
                System.out.println(ManufacturingController.requestProduct(product));
                System.out.println(ManufacturingController.getNumberOfProducts());
            }
        }
    }
}