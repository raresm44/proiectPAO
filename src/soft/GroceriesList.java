package soft;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GroceriesList implements Runnable {
    private Product[] listprod=new Product[30];
    private int numberofproducts=0;
    private ProductonSale[] listprodsale=new ProductonSale[30];
    private int numberofproductsonsale=0;

    Scanner sc = new Scanner(System.in);
    public void Showlist() {
        if (numberofproducts == 0 && numberofproductsonsale == 0) {
            System.out.println("Clientul nu doreste nimic");
        } else if (numberofproducts == 0 && numberofproductsonsale != 0) {
            System.out.println("Clientul nu doreste nimic la pret intreg!");
            System.out.println("Clientul doreste urmatoarele produse la oferta: ");
            for (int i = 0; i < numberofproductsonsale; i++) {
                listprodsale[i].showProduct();
            }
        } else if (numberofproducts != 0 && numberofproductsonsale == 0) {
            System.out.println("Clientul doreste urmatoarele produse: ");
            for (int i = 0; i < numberofproducts; i++)
                listprod[i].showProduct();
            System.out.println("Clientul nu doreste niciun produs la oferta!");
        }
        else if(numberofproductsonsale!=0 && numberofproducts!=0){
            System.out.println("Clientul doreste urmatoarele produse: ");
            for (int i = 0; i < numberofproducts; i++)
                listprod[i].showProduct();
            System.out.println("Clientul doreste urmatoarele produse la oferta: ");
            for (int i = 0; i < numberofproductsonsale; i++) {
                listprodsale[i].showProduct();
            }
        }
    }
    /*public int total_cost(){
        int totalprice=0;
        for(int i=0;i<numberofproducts;i++){
            totalprice+=listprod[i].getQuantity()*listprod[i].getPrice()
        }
    }*/
    public void add_product(Product X){
        listprod[numberofproducts]=X;
        numberofproducts++;
        FileWriter fileWriter=null;
        try{
            Path path= Paths.get("log.csv");
            if(Files.exists(path)) {
                fileWriter=new FileWriter("exception.csv");
                System.out.println("Fisierul log EXISTA!");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                String Toprint="add_product, "+datestring+"\n";
                Files.write(path, Toprint.getBytes(), StandardOpenOption.APPEND);

            }
            else{
                System.out.println("Fisierul log NU EXISTA!");
                fileWriter=new FileWriter("log.csv");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                fileWriter.append("add_product, "+datestring+"\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run(){
            System.out.println("Adaugat cu succes");
        }
    public void add_product(int id,String name,float price, int quantity)
    {
        Product newp=new Product(id,name,price,quantity);
        listprod[numberofproducts]=newp;
        numberofproducts++;
        FileWriter fileWriter=null;
        try{
            Path path= Paths.get("log.csv");
            if(Files.exists(path)) {
                fileWriter=new FileWriter("exception.csv");
                System.out.println("Fisierul log EXISTA!");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                String Toprint="add_product, "+datestring+"\n";
                Files.write(path, Toprint.getBytes(), StandardOpenOption.APPEND);

            }
            else{
                System.out.println("Fisierul log NU EXISTA!");
                fileWriter=new FileWriter("log.csv");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                fileWriter.append("add_product, "+datestring+"\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void add_productonsale(ProductonSale Y){
        listprodsale[numberofproductsonsale]=Y;
        numberofproductsonsale++;
        FileWriter fileWriter=null;
        try{
            Path path= Paths.get("log.csv");
            if(Files.exists(path)) {
                fileWriter=new FileWriter("exception.csv");
                System.out.println("Fisierul log EXISTA!");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                String Toprint="add_productonsale, "+datestring+"\n";
                Files.write(path, Toprint.getBytes(), StandardOpenOption.APPEND);

            }
            else{
                System.out.println("Fisierul log NU EXISTA!");
                fileWriter=new FileWriter("log.csv");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                fileWriter.append("add_productonsale, "+datestring+"\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void add_productonsale(int id,String name, float iprice,float price, int quantity){
        ProductonSale newp=new ProductonSale(id,name,iprice,price,quantity);
        listprodsale[numberofproductsonsale]=newp;
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
        listprodsale[numberofproductsonsale]=new_prodsale;
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
        listprod[numberofproducts]=temp;
        numberofproducts++;
    }

    public int getNumberofproducts() {
        return numberofproducts;
    }

    public void setNumberofproducts(int numberofproducts) {
        this.numberofproducts = numberofproducts;
    }

    public int getNumberofproductsonsale() {
        return numberofproductsonsale;
    }

    public void setNumberofproductsonsale(int numberofproductsonsale) {
        this.numberofproductsonsale = numberofproductsonsale;
    }

    public Product[] getListprod() {
        return listprod;
    }

    public void setListprod(Product[] listprod) {
        this.listprod = listprod;
    }

    public ProductonSale[] getListprodsale() {
        return listprodsale;
    }

    public void setListprodsale(ProductonSale[] listprodsale) {
        this.listprodsale = listprodsale;
    }
}
