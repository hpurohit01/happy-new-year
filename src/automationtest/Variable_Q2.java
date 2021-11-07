package automationtest;

public class Variable_Q2 {

    String name="Hemal";
    int id=101;

    public Variable_Q2(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {

        Variable_Q2 t =new Variable_Q2("Hemal",101);
        t.display();
        Variable_Q2 t1 =new Variable_Q2("Prime",102);
        t1.display();

    }

}
