package soft;

public class audit extends GroceriesList implements Runnable{
    public void run()
    {
      System.out.println("Run method executed by thread");
    }
}
