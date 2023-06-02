public class Product {
    private double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public double getPrice(int quantity){
            return price * quantity;
    }

    public static void main(String[] args) {
        Product p=new Product();
        p.setPrice(10);

       double Singlequantity = p.getPrice();
        System.out.println(Singlequantity);

        int quantity=5;

        double totalPrice=p.getPrice(quantity);

        System.out.println(""+quantity + totalPrice );



    }
}

