import java.util.ArrayList;

public class ExceptionsList {

    static ArrayList<Object> myList = new ArrayList<Object>();
    public static void main(String[] args) {
        myList.add("13");
        myList.add("helo world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
            } 
            catch(ClassCastException e) {
                System.out.println("Exception thrown: " + myList.get(i));
            }
        }
    }
}