import soft.*;
import GUI.*;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;
import java.util.*;

public class main {

    public static void main(String[] args) {


        JFrame frame=new JFrame("Application");
        frame.setContentPane(new Application().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        //Verificari pt Baza de date & servicii
        /*DatabaseFunctions datafunctions=DatabaseFunctions.getInstance();
        //Cashier
        datafunctions.deleteCashier();
        Cashier c1=new Cashier(1,true);
        Cashier c2=new Cashier(2,false);
        Cashier c3=new Cashier(3,true);
        datafunctions.addCashier(c1);
        datafunctions.addCashier(c2);
        datafunctions.addCashier(c3);
        datafunctions.showCashiers();
        datafunctions.updateCashier(2,1);
        datafunctions.showCashiers();

        //Manager
        Manager m1=new Manager(1,20,true);
        Manager m2=new Manager(2, 30, false);
        datafunctions.deleteManager();
        datafunctions.addManager(m1);
        datafunctions.addManager(m2);
        datafunctions.showManagers();
        datafunctions.updateManager(2,1);
        datafunctions.showManagers();

        //Product
        String cola="Cola ";
        Product p1=new Product(1,cola,6,30);
        Product p2=new Product(2,"Pepsi",5,50);
        Product p3=new Product(3,"mere",1,200);
        datafunctions.deleteProduct();
        datafunctions.addProduct(p1);
        datafunctions.addProduct(p2);
        datafunctions.addProduct(p3);
        datafunctions.showProduct();
        datafunctions.updateProduct("Pepsi", 4);
        datafunctions.showProduct();*/
        /*
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paoet3", "root", "root");
            //Sterge toate randurile din BuyingService
            sqldel="delete from BuyingService";
            stdel.executeUpdate(sqldel);

            //Creare rand nou in BuyingService
            sql="Insert into BuyingService (buying_id,cashier_id,manager_id,product_id,feedback) VALUES(1,3,2,8,'FERICIT')";
            statement.executeUpdate(sql);
            sql="Insert into BuyingService (buying_id,cashier_id,manager_id,product_id,feedback) VALUES(2,3,2,7,'NERVOS')";
            statement.executeUpdate(sql);

            //Update in BuyingService
            sqlupdate="Update BuyingService set feedback='NERVOS' where buying_id=1";
            stupdate.executeUpdate(sqlupdate);

            //Afisare BuyingService
            System.out.println("buying_id | cashier_id | manager_id | product_id | feedback");
            sql2="Select * from BuyingService";
            rs=st.executeQuery(sql2);
            while(rs.next()){
                System.out.println(rs.getInt("buying_id")+"    |     "+rs.getInt("cashier_id")+"    |    "+rs.getInt("manager_id")+"    |    "+rs.getInt("product_id")+"    |     "+rs.getString("feedback"));
            }


        } catch (SQLException e) {
            System.out.println("Eroare JDBC: "+e);
        }
         */



























        //Scanner sc = new Scanner(System.in);
        /*Product A=new Product(1,"salam",10,3);
        A.showProduct();
        Product[] lista=new Product[30];
        for(int i=0;i<1;i++) {
        System.out.println("Id-ul produsului: ");
        int tp_id=sc.nextInt();
        sc.nextLine();
       // lista[i].setProduct_id(tp_id);
        System.out.println("Numele produsului: ");
                     String tp_name=sc.nextLine();
       // lista[i].setProduct_name(tp_name);

        System.out.println("Pretul produsului: ");
        float tp_price=sc.nextFloat();
       // lista[i].setPrice(tp_price);
        System.out.println("Cantitatea produsului: ");
        int tp_quantity=sc.nextInt();
        //lista[i].setQuantity(tp_quantity);
        Product new_prod=new Product(tp_id,tp_name,tp_price,tp_quantity);
        lista[i]=new_prod;
        }
        for(int i=0;i<1;i++)
        {
            lista[i].showProduct();
        }
        ProductonSale B=new ProductonSale(99,"TV Led",1000,400,5);
        B.showProduct();
        ProductonSale[] listasale=new ProductonSale[30];
        for(int i=0;i<2;i++){
            System.out.println("Id-ul produsului la oferta: ");
            int tp_id=sc.nextInt();
            sc.nextLine();
            // lista[i].setProduct_id(tp_id);
            System.out.println("Numele produsului la oferta: ");
            String tp_name=sc.nextLine();
            // lista[i].setProduct_name(tp_name);
            System.out.println("Pretului initial al produsului a fost: ");
            float tp_iprice=sc.nextFloat();
            System.out.println("Pretul produsului la oferta: ");
            float tp_price=sc.nextFloat();
            // lista[i].setPrice(tp_price);
            System.out.println("Cantitatea produsului: ");
            int tp_quantity=sc.nextInt();
            //lista[i].setQuantity(tp_quantity);
            ProductonSale new_prodsale=new ProductonSale(tp_id,tp_name,tp_iprice,tp_price,tp_quantity);
            listasale[i]=new_prodsale;
        }*/

       /* Product me=new Product(1,"mere",3,100);
        Product pe=new Product(2,"pere",5,32);
        ProductonSale tvled=new ProductonSale(1,"TV LED",1000,400,3);
        ProductonSale tvlcd=new ProductonSale(2,"TV LCD",2000,800,2);
        Stock test=new Stock();
        test.add_product();
        test.add_product(me);
        test.add_product(pe);
        test.add_productonsale(tvled);
        test.add_productonsale(tvlcd);
        test.Showstock();

        Cashier c1=new Cashier(1,true);
        Cashier c2=new Cashier(2, false);
        Cashier c3=new Cashier(3, false);

        Manager m1=new Manager(1,20,true);
        Manager m2=new Manager(2, 30, false);
        Manager m3=new Manager(3, 15, false);

        */

       /*BuyingService test=new BuyingService();
       test.add_cashier(1,true);
       test.add_cashier(2,false);
       test.add_manager(1,20,true);
       test.add_manager(2,30,false);
       test.Cashier_status();
       test.Manager_status();
       test.Check_clientlist();
        Product me=new Product(1,"mere",3,100);
        Product pe=new Product(2,"pere",5,32);
        ProductonSale tvled=new ProductonSale(1,"TV LED",1000,400,3);
        ProductonSale tvlcd=new ProductonSale(2,"TV LCD",2000,800,2);
       GroceriesList c1=new GroceriesList();
       c1.add_product(me);
       c1.add_product(pe);
       c1.add_productonsale(tvled);
       c1.add_productonsale(tvlcd);
       c1.Showlist();
        test.add_Client(c1,false,"cash");
        test.show_clients();
       test.Check_clientlist();
       test.show_total();
        Product pepsi=new Product(3,"pepsi",5,3);
        Product cola=new Product(4,"cola",5,5);
        ProductonSale frigider=new ProductonSale(1,"frigider",1000,620,3);
        ProductonSale aragaz=new ProductonSale(2,"aragaz",2000,320,2);
        GroceriesList c2=new GroceriesList();
        c2.add_productonsale(frigider);
        c2.add_productonsale(aragaz);
        c2.add_product(pepsi);
        c2.add_product(cola);
        test.add_Client(c2,false,"card");
        test.Check_clientlist();
        test.show_total();*/
       /*
        BuyingService test=new BuyingService();
        test.add_cashier(1,true);
        test.add_cashier(2,false);
        test.add_manager(1,20,true);
        test.add_manager(2,30,false);
        Cashier[] maincashiers=new Cashier[10];
        maincashiers=test.getCashiers();
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter("cashier.csv");
            fileWriter.append("Cashier_id,On-Duty");
            fileWriter.append("\n");
            for(int i=0;i<test.getNumberofCashiers();i++)
            {
                fileWriter.append(String.valueOf(maincashiers[i].getCashier_id()));
                fileWriter.append(",");
                fileWriter.append(String.valueOf(maincashiers[i].getOn_duty()));
                fileWriter.append("\n");
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
        BufferedReader reader=null;
        System.out.println("Lista de vanzatori citita din fisier:");
        try{
            Cashier[] readcashiers=new Cashier[10];
            String line="";
            reader=new BufferedReader(new FileReader("cashier.csv"));
            reader.readLine();
            int counter=0;
            while((line=reader.readLine())!=null){
                String[] fields=line.split(",");
                if(fields.length>0){
                    Cashier cashier=new Cashier();
                    cashier.setCashier_id(Integer.parseInt(fields[0]));
                    cashier.setOn_duty(Boolean.parseBoolean(fields[1]));
                    readcashiers[counter]=cashier;
                    counter++;
                }
            }
            for(int i=0;i<counter;i++){
                readcashiers[i].show_cashier();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                reader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        Manager[] mainmanagers=new Manager[10];
        mainmanagers=test.getManagers();
        FileWriter fileWriterM=null;
        try{
            fileWriterM=new FileWriter("manager.csv");
            fileWriterM.append("Manager_id, Experience_month, Available");
            fileWriterM.append("\n");
            for(int i=0;i<test.getNumberofManagers();i++){
                fileWriterM.append(String.valueOf(mainmanagers[i].getManager_id()));
                fileWriterM.append(",");
                fileWriterM.append(String.valueOf(mainmanagers[i].getExperience_months()));
                fileWriterM.append(",");
                fileWriterM.append(String.valueOf(mainmanagers[i].isAvaialble()));
                fileWriterM.append("\n");
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                fileWriterM.flush();
                fileWriterM.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

        BufferedReader readerM=null;
        System.out.println("\n");
        System.out.println("Lista de manageri citita din fisier:");
        try{
            Manager[] readmanagers=new Manager[10];
            String line="";
            readerM=new BufferedReader(new FileReader("manager.csv"));
            readerM.readLine();
            int counter=0;
            while((line=readerM.readLine())!=null){
                String[] fields=line.split(",");
                if(fields.length>0){
                    Manager manager=new Manager();
                    manager.setManager_id(Integer.parseInt(fields[0]));
                    manager.setExperience_months(Integer.parseInt(fields[1]));
                    manager.setAvaialble(Boolean.parseBoolean(fields[2]));
                    readmanagers[counter]=manager;
                    counter++;
                }
            }
            for(int i=0;i<counter;i++){
                readmanagers[i].show_manager();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                reader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Product me=new Product(1,"mere",3,100);
        Product pe=new Product(2,"pere",5,32);
        ProductonSale tvled=new ProductonSale(1,"TV LED",1000,400,3);
        ProductonSale tvlcd=new ProductonSale(2,"TV LCD",2000,800,2);
        GroceriesList c1=new GroceriesList();
        //Thread c2=new Thread(new GroceriesList());
        c1.add_product(me);
        //c2.add_product(me).
        //c2.start();
        c1.add_product(pe);
        c1.add_productonsale(tvled);
        c1.add_productonsale(tvlcd);
       // c1.Showlist();
        Product[] maingrocerprod=new Product[30];
        maingrocerprod=c1.getListprod();
        ProductonSale[] maingrocerprodsale=new ProductonSale[30];
        maingrocerprodsale=c1.getListprodsale();
        FileWriter fileWriterG=null;
        try{
            fileWriterG=new FileWriter("GroceriesList.csv");
            fileWriterG.append("Products | numberofProducts | ProductsonSaleO | numberofproductsonsale");
            fileWriterG.append("\n");
            for(int i=0;i<c1.getNumberofproducts();i++)
            {
                fileWriterG.append("#"+String.valueOf(maingrocerprod[i].getProduct_id()));
                fileWriterG.append(" , ");
                fileWriterG.append(maingrocerprod[i].getProduct_name());
                fileWriterG.append(" , ");
                fileWriterG.append(String.valueOf(maingrocerprod[i].getPrice()));
                fileWriterG.append(" , ");
                fileWriterG.append(String.valueOf(maingrocerprod[i].getQuantity()));
                fileWriterG.append(";");
            }
            fileWriterG.append(" | ");
            fileWriterG.append(String.valueOf(c1.getNumberofproducts()));
            fileWriterG.append(" | ");
            for(int i=0;i<c1.getNumberofproductsonsale();i++)
            {
                fileWriterG.append("#"+String.valueOf(maingrocerprodsale[i].getSale_id()));
                fileWriterG.append(" , ");
                fileWriterG.append(maingrocerprodsale[i].getSale_name());
                fileWriterG.append(" , ");
                fileWriterG.append(String.valueOf(maingrocerprodsale[i].getSale_price()));
                fileWriterG.append(" , ");
                fileWriterG.append(String.valueOf(maingrocerprodsale[i].getSale_quantity()));
                fileWriterG.append(";");
            }
            fileWriterG.append(" | ");
            fileWriterG.append(String.valueOf(c1.getNumberofproductsonsale()));

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                fileWriterG.flush();
                fileWriterG.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        test.add_Client(c1,false,"cash");

        Client[] mainclients=new Client[10];
        mainclients=test.getClients();
        FileWriter fileWriterC=null;
        try{
            fileWriterC=new FileWriter("clients.csv");
            fileWriterC.append("Groceries_List || problem || MethodtoPay ");
            fileWriterC.append("\n");
            for(int y=0;y<test.getNumberofClients();y++) {

                for (int i = 0; i < mainclients[y].getList().getNumberofproducts(); i++) {
                    fileWriterC.append("#" + String.valueOf(maingrocerprod[i].getProduct_id()));
                    fileWriterC.append(" , ");
                    fileWriterC.append(maingrocerprod[i].getProduct_name());
                    fileWriterC.append(" , ");
                    fileWriterC.append(String.valueOf(maingrocerprod[i].getPrice()));
                    fileWriterC.append(" , ");
                    fileWriterC.append(String.valueOf(maingrocerprod[i].getQuantity()));
                    fileWriterC.append(";");
                }
                fileWriterC.append(" | ");
                fileWriterC.append(String.valueOf(c1.getNumberofproducts()));
                fileWriterC.append(" | ");
                for (int i = 0; i < mainclients[y].getList().getNumberofproductsonsale(); i++) {
                    fileWriterC.append("#" + String.valueOf(maingrocerprodsale[i].getSale_id()));
                    fileWriterC.append(" , ");
                    fileWriterC.append(maingrocerprodsale[i].getSale_name());
                    fileWriterC.append(" , ");
                    fileWriterC.append(String.valueOf(maingrocerprodsale[i].getSale_price()));
                    fileWriterC.append(" , ");
                    fileWriterC.append(String.valueOf(maingrocerprodsale[i].getSale_quantity()));
                    fileWriterC.append(";");
                }
                fileWriterC.append(" | ");
                fileWriterC.append(String.valueOf(c1.getNumberofproductsonsale()));
                fileWriterC.append(" || ");
                fileWriterC.append(String.valueOf(mainclients[y].isProblem()));
                fileWriterC.append(" || ");
                fileWriterC.append(String.valueOf(mainclients[y].getMethodToPay()));
                fileWriterC.append("\n");
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                fileWriterC.flush();
                fileWriterC.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    */
    }

}