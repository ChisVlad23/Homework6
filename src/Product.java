public class Product {

        private String name;
        private Integer price;
        private Integer quantity;
        private String category;

   public Product(String name, Integer price, Integer quantity, String category){
       this.name = name;
       this.price = price;
       this.quantity = quantity;
       this.category = category;
   }

   String getName(){
       return name;
   }

    Integer getPrice(){
        return price;
    }

    Integer getQuantity(){

        return quantity;
    }

    String getCategory(){
        return category;
    }

    Boolean hasStock (){
        if (quantity > 0){
            return true;
        }
        else return false;
    }

Boolean isCategory(String category){
       return this.category.equals(category);
}

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}
