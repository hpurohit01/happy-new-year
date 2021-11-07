package automationtest1;

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

        automationtest.Variable_Q2 t = new automationtest.Variable_Q2("Hemal", 101);
        t.display();
        automationtest.Variable_Q2 t1 = new automationtest.Variable_Q2("Prime", 102);
        t1.display();
    }
    }

