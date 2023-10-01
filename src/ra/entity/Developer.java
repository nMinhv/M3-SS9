package ra.entity;

public class Developer extends Employee {
    public void work(){
        System.out.println("dang fix bug");
        super.chamCong();
    }
    public void chamCong(){
        System.out.println("Da quet the");
    }
}
