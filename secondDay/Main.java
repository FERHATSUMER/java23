public class Main {
    public static void main(String[] args) {    
        Product product1=new Product();
        product1.name="Lenovo V14";
        product1.unitPrice=15000;
        product1.discount=10;
        product1.unitsInStock=10;
        product1.imageUrl="herhangiBirResim1.jpg";
        
        System.out.println(product1.name);

        Product product2=new Product();
        product2.name="Acer ";
        product2.unitPrice=14000;
        product2.discount=5;
        product2.unitsInStock=4;
        product2.imageUrl="herhangiBirResim2.jpg";
        
        System.out.println(product2.name);

        Product product3=new Product();
        product3.name="Monster ";
        product3.unitPrice=19000;
        product3.discount=15;
        product3.unitsInStock=1;
        product3.imageUrl="herhangiBirResim3.jpg";
        
        System.out.println(product3.name);

    for(    Product product : products){
        System.out.println(product.name);

    }}
}
 