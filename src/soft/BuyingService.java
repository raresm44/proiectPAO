package soft;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BuyingService {
    private Cashier[] cashiers=new Cashier[10];
    private int numberofCashiers=0;
    private Manager[] managers=new Manager[10];
    private int numberofManagers=0;
    private Stock stock;
    private Client[] clients=new Client[100];
    private int numberofClients=0;
    private float total=0;

    public void Cashier_status(){
        if(numberofCashiers==0){
            System.out.println("Nu este inregistrat niciun vanzator");
        }
        else if(numberofCashiers!=0){
            for(int i=0;i<numberofCashiers;i++){
                if(cashiers[i].getOn_duty()==true){
                    System.out.println("Vanzatorul cu ID-ul: #"+cashiers[i].getCashier_id()+" este pregatit!");
                    break;
                }
            }
        }
    }
    public void add_cashier(int id,boolean onduty){
        Cashier temp=new Cashier(id,onduty);
        cashiers[numberofCashiers]=temp;
        numberofCashiers++;
        FileWriter fileWriter=null;
        try{
            Path path= Paths.get("log.csv");
            if(Files.exists(path)) {
                fileWriter=new FileWriter("exception.csv");
                System.out.println("Fisierul log EXISTA!");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                String Toprint="add_cashier, "+datestring+"\n";
                Files.write(path, Toprint.getBytes(), StandardOpenOption.APPEND);

            }
            else{
                System.out.println("Fisierul log NU EXISTA!");
                fileWriter=new FileWriter("log.csv");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                fileWriter.append("add_cashier, "+datestring+"\n");
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
    public void Manager_status(){
        if(numberofManagers==0)
            System.out.println("Nu este inregistrat niciun manager");
        else{
            for(int i=0;i<numberofManagers;i++){
                if(managers[i].isAvaialble()==true){
                    System.out.println("Managerul cu ID-ul: #"+managers[i].getManager_id()+" este disponibil!");
                }
            }
        }
    }
    public void add_manager(int id,int exp,boolean av){
        Manager temp=new Manager(id,exp,av);
        managers[numberofManagers]=temp;
        numberofManagers++;
        FileWriter fileWriter=null;
        try{
            Path path= Paths.get("log.csv");
            if(Files.exists(path)) {
                fileWriter=new FileWriter("exception.csv");
                System.out.println("Fisierul log EXISTA!");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                String Toprint="add_manager, "+datestring+"\n";
                Files.write(path, Toprint.getBytes(), StandardOpenOption.APPEND);

            }
            else{
                System.out.println("Fisierul log NU EXISTA!");
                fileWriter=new FileWriter("log.csv");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                fileWriter.append("add_manager, "+datestring+"\n");
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
    public void add_Client(GroceriesList lista,boolean problem, String methodofpay){
        Client temp=new Client(lista,problem,methodofpay);
        clients[numberofClients]=temp;
        numberofClients++;
        FileWriter fileWriter=null;
        try{
            Path path= Paths.get("log.csv");
            if(Files.exists(path)) {
                fileWriter=new FileWriter("exception.csv");
                System.out.println("Fisierul log EXISTA!");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                String Toprint="add_client, "+datestring+"\n";
                Files.write(path, Toprint.getBytes(), StandardOpenOption.APPEND);

            }
            else{
                System.out.println("Fisierul log NU EXISTA!");
                fileWriter=new FileWriter("log.csv");
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String datestring = date.format(new Date());
                fileWriter.append("add_client, "+datestring+"\n");
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
    public void show_clients(){
        for(int i=0;i<numberofClients;i++)
           clients[i].show_client();
    }
    public void Check_clientlist(){
        if(numberofClients==0){
            System.out.println("Niciun client nu asteapta!");
        }
        else{
            /*for(int i=0;i<numberofClients;i++) {
                GroceriesList customerlist=clients[i].getList();
                Product[] productcustomerlist=customerlist.getListprod();
                int numberofproducts=customerlist.getNumberofproducts();
                for(int j=0;j<=numberofproducts;j++)
                {
                    float pret=productcustomerlist[j].getPrice();
                    total=total+pret;
                }
            }*/
            System.out.println("Sunt clienti care asteapta");
            for(int i=0;i<numberofClients;i++){
                System.out.println("Se scaneaza produsele unui client...");
                float totalclient=0;
                GroceriesList listt=clients[i].getList();
                int counter=listt.getNumberofproducts();
                Product[] listitems=listt.getListprod();
                System.out.println("Produsele normale: ");
                for(int j=0;j<counter;j++){
                    listitems[j].showProduct();
                    totalclient+=listitems[j].getPrice()*listitems[j].getQuantity();
                }
                ProductonSale[] listitemsonsale=listt.getListprodsale();
                int countersale=listt.getNumberofproductsonsale();
                System.out.println("Produsele la promotie: ");
                for(int j=0;j<countersale;j++){
                    listitemsonsale[j].showProduct();
                    totalclient+=listitemsonsale[j].getSale_price()*listitemsonsale[j].getSale_quantity();
                }
                System.out.println("Produsele clientului costa in total: "+totalclient+" lei");
                total+=totalclient;
            }
         numberofClients=0;
        }

    }
    public void show_total(){
        System.out.println(total);
    }

    public Cashier[] getCashiers() {
        return cashiers;
    }

    public void setCashiers(Cashier[] cashiers) {
        this.cashiers = cashiers;
    }

    public int getNumberofCashiers() {
        return numberofCashiers;
    }

    public void setNumberofCashiers(int numberofCashiers) {
        this.numberofCashiers = numberofCashiers;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    public int getNumberofManagers() {
        return numberofManagers;
    }

    public void setNumberofManagers(int numberofManagers) {
        this.numberofManagers = numberofManagers;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public int getNumberofClients() {
        return numberofClients;
    }

    public void setNumberofClients(int numberofClients) {
        this.numberofClients = numberofClients;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
