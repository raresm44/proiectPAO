package soft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {
    private static EstablishConnection establishConnection=new EstablishConnection();

    public EstablishConnection() {}
    public static EstablishConnection getInstance(){return establishConnection;}

    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/paoet3", "root", "root");
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
