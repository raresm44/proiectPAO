package soft;
import java.util.Scanner;
public class Stock {
    private Product[] products=new Product[40];
    private int numberofproducts=0;
    private ProductonSale[] productsale=new ProductonSale[40];
    private int numberofproductsonsale=0;
    Scanner sc = new Scanner(System.in);
    public void Showstock() {
        if (numberofproducts == 0 && numberofproductsonsale == 0) {
            System.out.println("Stocul e gol");
        } else if (numberofproducts == 0 && numberofproductsonsale != 0) {
            System.out.println("Stocul produselor la pret intreg este gol!");
            System.out.println("Stocul produselor la oferta: ");
            for (int i = 0; i < numberofproductsonsale; i++) {
                productsale[i].showProduct();
            }
        } else if (numberofproducts != 0 && numberofproductsonsale == 0) {
            System.out.println("Stocul produselor la pret intreg: ");
            for (int i = 0; i < numberofproducts; i++)
                products[i].showProduct();
            System.out.println("Stocul produselor la oferta este gol!");
        }
        else if(numberofproductsonsale!=0 && numberofproducts!=0){
            System.out.println("Stocul produselor la pret intreg: ");
            for (int i = 0; i < numberofproducts; i++)
                products[i].showProduct();
            System.out.println("Stocul produselor la oferta: ");
            for (int i = 0; i < numberofproductsonsale; i++) {
                productsale[i].showProduct();
            }
        }
    }
    public void add_product(Product X){
        products[numberofproducts]=X;
        numberofproducts++;
    }
    public void add_product(int id,String name,float price, int quantity)
    {
        Product newp=new Product(id,name,price,quantity);
        products[numberofproducts]=newp;
        numberofproducts++;
    }

    public void add_productonsale(ProductonSale Y){
        productsale[numberofproductsonsale]=Y;
        numberofproductsonsale++;
    }
    public void add_productonsale(int id,String name, float iprice,float price, int quantity){
        ProductonSale newp=new ProductonSale(id,name,iprice,price,quantity);
        productsale[numberofproductsonsale]=newp;
        numberofproductsonsale++;
    }
    public void add_productonsale(){
        System.out.println("Id-ul produsului la oferta: ");
        int tp_id=sc.nextInt();
        sc.nextLine();

        System.out.println("Numele produsului la oferta: ");
        String tp_name=sc.nextLine();

        System.out.println("Pretului initial al produsului a fost: ");
        float tp_iprice=sc.nextFloat();

        System.out.println("Pretul produsului la oferta: ");
        float tp_price=sc.nextFloat();

        System.out.println("Cantitatea produsului: ");
        int tp_quantity=sc.nextInt();

        ProductonSale new_prodsale=new ProductonSale(tp_id,tp_name,tp_iprice,tp_price,tp_quantity);
        productsale[numberofproductsonsale]=new_prodsale;
        numberofproductsonsale++;
    }
    public void add_product(){

        System.out.println("Id-ul produsului: ");
        int tp_id=sc.nextInt();
        sc.nextLine();

        System.out.println("Numele produsului: ");
        String tp_name=sc.nextLine();

        System.out.println("Pretul produsului: ");
        float tp_price=sc.nextFloat();

        System.out.println("Cantitatea produsului: ");
        int tp_quantity=sc.nextInt();

        Product temp=new Product(tp_id,tp_name,tp_price,tp_quantity);
        products[numberofproducts]=temp;
        numberofproducts++;
    }
    public int search_product_byname(String prod_name){
        for(int i=0;i<numberofproducts;i++){
            if(products[i].getProduct_name()==prod_name){
                return i;
            }

        }
        return -1;
    }
    public void delete_product(String prodname){
       int x=search_product_byname(prodname);
       if(x==-1){
           System.out.print("Produsul nu a putut fi gasit");
       }

       else{
           System.out.println("Produsul a fost identificat cu succes si va fi sters in scurt timp!");
           products[x].showProduct();
           for(int i=x;i<numberofproducts;i++){
               products[i]=products[i+1];
           }
           numberofproducts--;
       }
       System.out.println("Produsul a fost sters! Noul stoc: ");
       for(int i=0;i<numberofproducts;i++){
           products[i].showProduct();
       }
    }
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public ProductonSale[] getProductsale() {
        return productsale;
    }

    public void setProductsale(ProductonSale[] productsale) {
        this.productsale = productsale;
    }
}
