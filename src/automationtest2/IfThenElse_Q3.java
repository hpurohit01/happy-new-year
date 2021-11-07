package automationtest2;

public class IfThenElse_Q3 {


    public boolean isTeen(int age) {
        if (age <= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        automationtest.IfThenElse_Q3 t = new automationtest.IfThenElse_Q3();
        System.out.println(t.isTeen(15));
        System.out.println(t.isTeen(25));

    }
}