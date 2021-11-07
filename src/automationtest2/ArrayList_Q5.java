package automationtest2;

import java.util.ArrayList;

public class ArrayList_Q5 {


    public static void main(String[] args) {

        ArrayList<String> value=new ArrayList<String>();

        value.add("Scrum");
        value.add("Java");
        value.add("Jira");
        value.add("Selenium");
        value.add("Cucumber");
        value.add("Postman");

        for (String str:value){
            System.out.println(str);
        }
    }
}