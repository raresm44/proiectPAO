package soft;

import java.sql.*;

public class DatabaseFunctions {
    private static DatabaseFunctions databaseFunctions=new DatabaseFunctions();

    public DatabaseFunctions(){ }
    public static DatabaseFunctions getInstance() {
        return databaseFunctions;
    }

    public void addCashier(Cashier a){
        try {
            Connection con = EstablishConnection.getInstance().getConnection();
            Statement st = con.createStatement();
            int cash_id = a.getCashier_id();
            int onduty;
            if (a.getOn_duty()) onduty = 1;
            else onduty = 0;
            String sql = "insert into Cashier (cashier_id,on_duty)" + "VALUES(" + cash_id + "," + onduty + ")";
            st.executeUpdate(sql);
            con.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void addManager(Manager a){
        try{
            Connection con = EstablishConnection.getInstance().getConnection();
            Statement st = con.createStatement();
            int man_id=a.getManager_id();
            int exp=a.getExperience_months();
            int avl;
            if(a.isAvaialble()) avl=1;
            else avl=0;
            String sql="Insert into Manager (manager_id,experience_months,available) VALUES("+man_id+","+exp+","+avl+")";
            st.executeUpdate(sql);
            con.close();


        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void addProduct(Product a){
        try{
            Connection con = EstablishConnection.getInstance().getConnection();
            Statement st = con.createStatement();
            int pr_id=a.getProduct_id();
            String pr_name=a.getProduct_name();
            float pret=a.getPrice();
            int qua=a.getQuantity();
            String sql="INSERT INTO PRODUCT (product_id,product_name,price,quantity) VALUES("+pr_id+", '"+pr_name+"' ,"+pret+","+qua+")";
            st.executeUpdate(sql);
            con.close();

        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public void showCashiers(){
        try{
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from cashier");
            System.out.println("cashier_id | on_duty");
            while(rs.next()){
                System.out.println(rs.getInt("cashier_id")+"   |   "+rs.getInt("on_duty"));
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public String showCashiersGUI(){
        try{
            String mem=new String();
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from cashier");
            mem="cashier_id | on_duty\n";
            while(rs.next()){
                mem=mem+rs.getInt("cashier_id")+"   |   "+rs.getInt("on_duty")+"\n";
            }
            con.close();
            return mem;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public void showManagers(){
        try {
            Connection con = EstablishConnection.getInstance().getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Manager");
            System.out.println("manager_id | experience_months | available");
            while (rs.next()) {
                System.out.println(rs.getInt("manager_id") + "     |       " + rs.getInt("experience_months") + "     |     " + rs.getInt("available"));
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void showProduct(){
        try {
        Connection con = EstablishConnection.getInstance().getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Product");
        System.out.println("product_id | product_name | price | quantity");
        while (rs.next()) {
            System.out.println(rs.getInt("product_id") + "     |       " + rs.getString("product_name") + "     |     " + rs.getFloat("price")+"     |     "+rs.getInt("quantity"));
          }
            con.close();
        }catch(SQLException e){
        e.printStackTrace();
    }
    }
    public void deleteCashier(){
        try{
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement stdel=con.createStatement();
            String sqldel="delete from cashier";
            stdel.executeUpdate(sqldel);
            con.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteManager(){
        try{
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement stdel=con.createStatement();
            String sqldel="delete from Manager";
            stdel.executeUpdate(sqldel);
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteProduct(){
        try{
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement stdel=con.createStatement();
            String sqldel="delete from Product";
            stdel.executeUpdate(sqldel);
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void updateCashier(int id,int duty){
        try{
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement stupdate=con.createStatement();
            String sqlupdate="Update Cashier set on_duty="+duty+" where cashier_id="+id;
            System.out.println("Updating Cashier...");
            System.out.println("SUCCES!");
            stupdate.executeUpdate(sqlupdate);
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void updateManager(int id, int avl){
        try{
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement stupdate=con.createStatement();
            String sqlupdate="Update Manager set available="+avl+" where manager_id="+id;
            System.out.println("Updating Manager...");
            System.out.println("SUCCES!");
            stupdate.executeUpdate(sqlupdate);
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void updateProduct(String name, float pret){
        try{
            Connection con=EstablishConnection.getInstance().getConnection();
            Statement stupdate=con.createStatement();
            String sqlupdate="Update product set price="+pret+" where product_name= '"+name+"'";
            System.out.println("Updating Product...");
            System.out.println("SUCCES!");
            stupdate.executeUpdate(sqlupdate);
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
