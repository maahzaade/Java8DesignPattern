import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> names = new ArrayList<String>();

        names.add("Mahdiye");
        names.add("Harish");
        names.add("Sandeep");
        names.add("Uma");


        // what is names = null; we have to have a validation
        for(String item: names){
            System.out.println(item);
        }



    }
}
