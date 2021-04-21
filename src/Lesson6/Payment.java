package Lesson6;

public class Payment {
    // Создать класс Payment с внутренним классом, с помощью объектов которого можно
    // сформировать покупку из нескольких товаров

    private Product[] prodArray;
    private int totalCoast;

    class Product {
        private String productName;
        private int productCost;

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setProductCost(Integer productCost) {
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public int getProductCost() {
            return this.productCost;
        }
    }


    public Payment(Integer paymentNumber) {
        prodArray = new Product[paymentNumber];
        this.totalCoast = 0;
    }

    public void addProduct(Product product) {
        for (int i = 0; i < prodArray.length; i++) {
            if (prodArray[i] == null) {
                prodArray[i] = product;
                break;
            }
        }
    }

    public void printProductBasketAndTotalCoast() {
        for (int i = 0; i < this.prodArray.length; i++) {
            System.out.println(this.prodArray[i].productName + ", coast: " + this.prodArray[i].productCost);
            totalCoast += this.prodArray[i].productCost;
        }
        System.out.println("Total coast: " + totalCoast);
    }
}
