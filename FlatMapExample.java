import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// flatMap() method helps in converting Stream<Stream<T>> to Stream<T>.
// It performs flattening (flat or flatten) and mapping (map), simultaneously.
// The Stream.flatMap() method combines both the operations i.e. flat and map.

public class FlatMapExample {
    public static void main(String args[]) {
        List<String> productList1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String> productList2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productList3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productList4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
        List<List<String>> allProducts = new ArrayList<List<String>>();

        allProducts.add(productList1);
        allProducts.add(productList2);
        allProducts.add(productList3);
        allProducts.add(productList4);

        List<String> listOfAllProducts = new ArrayList<String>();

        for (List<String> pro : allProducts) {
            for (String product : pro) {
                listOfAllProducts.add(product);
            }
        }

        System.out.println("List before applying mapping and flattening: ");
        System.out.println(listOfAllProducts);
        System.out.println();

        System.out.println("List after applying flat map: ");
        List<String> flatMapList = allProducts.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}
