import java.util.ArrayList;

public class DataEntry {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add(0,"-");
        arrayList.add(1,"My Array");

//        System.out.println(arrayList.clear());
//        arrayList.remove(1);
//        for (boolean i = true; i == arrayList.iterator().hasNext();i=false) {
//            System.out.println(arrayList.iterator().next().charAt(0));
//        }

        for (int i = arrayList.indexOf("-"); i <= arrayList.indexOf("My Array"); i++) {
            System.out.println(arrayList.iterator().next().charAt());
        }
    }
}
