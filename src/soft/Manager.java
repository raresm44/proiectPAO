package soft;

public class Manager extends Employee{
    private int manager_id;
    private int experience_months;
    private boolean avaialble;

    public int getManager_id() {
        return manager_id;
    }
    public Manager(int man_id,int exp_m, boolean av)
    {
        this.manager_id=man_id;
        this.experience_months=exp_m;
        this.avaialble=av;
    }
    public Manager(){
        this.manager_id=0;
        this.experience_months=0;
        this.avaialble=false;
    }
    public void show_manager(){
        System.out.println("#"+this.manager_id+" | "+this.experience_months+" | "+this.avaialble);
    }
    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getExperience_months() {
        return experience_months;
    }

    public void setExperience_months(int experience_months) {
        this.experience_months = experience_months;
    }

    public boolean isAvaialble() {
        return avaialble;
    }

    public void setAvaialble(boolean avaialble) {
        this.avaialble = avaialble;
    }
}
