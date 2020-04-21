package soft;

public class Client {
    private GroceriesList list=new GroceriesList();
    private boolean problem;
    private String MethodToPay;


    public Client(GroceriesList a,boolean b, String c){
        this.list=a;
        this.problem=b;
        this.MethodToPay=c;
    }
    public GroceriesList getList() {
        return list;
    }
    public void show_client(){
        list.Showlist();
        System.out.println(problem);
        System.out.println(MethodToPay);
    }
    public void setList(GroceriesList list) {
        this.list = list;
    }

    public boolean isProblem() {
        return problem;
    }

    public void setProblem(boolean problem) {
        this.problem = problem;
    }

    public String getMethodToPay() {
        return MethodToPay;
    }

    public void setMethodToPay(String methodToPay) {
        MethodToPay = methodToPay;
    }
}
