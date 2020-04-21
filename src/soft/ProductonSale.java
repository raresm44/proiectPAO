package soft;

public class ProductonSale {
    private int sale_id;
    private String sale_name;
    private float initial_price;
    private float sale_price;
    private int sale_quantity;

    public ProductonSale(){
        this.sale_id=0;
        this.sale_name="";
        this.initial_price=0;
        this.sale_price=0;
        this.sale_quantity=0;
    }
    public ProductonSale(int sale_id, String sale_name,float initial_price,float sale_price, int sale_quantity)
    {
        this.sale_id=sale_id;
        this.sale_name=sale_name;
        this.initial_price=initial_price;
        this.sale_price=sale_price;
        this.sale_quantity=sale_quantity;
    }
    public void showProduct(){
        System.out.println("#"+getSale_id()+" | "+getSale_name()+" | "+getInitial_price()+" | "+getSale_price()+" | "+getSale_quantity());
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public String getSale_name() {
        return sale_name;
    }

    public void setSale_name(String sale_name) {
        this.sale_name = sale_name;
    }

    public float getInitial_price() {
        return initial_price;
    }

    public void setInitial_price(float initial_price) {
        this.initial_price = initial_price;
    }

    public float getSale_price() {
        return sale_price;
    }

    public void setSale_price(float sale_price) {
        this.sale_price = sale_price;
    }

    public int getSale_quantity() {
        return sale_quantity;
    }

    public void setSale_quantity(int sale_quantity) {
        this.sale_quantity = sale_quantity;
    }
}
