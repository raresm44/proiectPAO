package soft;

public class Cashier extends Employee{
    private int cashier_id;
    private boolean on_duty;


    public Cashier()
    {
        cashier_id=0;
        on_duty=false;
    }
    public Cashier(int cash_id,boolean ond)
    {
        this.cashier_id=cash_id;
        this.on_duty=ond;
    }
    public void show_cashier(){
        System.out.println("#"+this.cashier_id+" | "+this.on_duty);
    }
    public int getCashier_id() {
        return cashier_id;
    }

    public void setCashier_id(int cashier_id) {
        this.cashier_id = cashier_id;
    }

    public boolean getOn_duty() {
        return on_duty;
    }

    public void setOn_duty(boolean on_duty) {
        this.on_duty = on_duty;
    }
}
