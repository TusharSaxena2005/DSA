import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
    public List<Integer> getArrayList() {
        // ArrayList is a Dynamic size array but slower than array
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(3);
        System.out.println(data.size());
        return data;
    }

    public Set<Integer> getHashSet() {
        // HashSet automatically remove duplicate element
        Set<Integer> data2 = new HashSet<>();
        data2.add(81);
        data2.add(72);
        data2.add(53);
        data2.add(64);
        data2.add(53);
        System.out.println(data2.size());
        return data2;
    }

    public Set<Integer> getTreeSet() {
        // TreeSet automatically store element in a sorted manner
        Set<Integer> data3 = new TreeSet<Integer>();
        data3.add(81);
        data3.add(72);
        data3.add(53);
        data3.add(64);
        data3.add(53);
        System.out.println(data3.size());
        return data3;
    }

    public Map<String, Integer> getHashMap() {
        // HashMap has fast retreving data O(1) and dynamic resizing
        Map<String, Integer> data4 = new HashMap<>();
        data4.put("A", 1);
        data4.put("B", 2);
        data4.put("C", 3);
        data4.put("D", 4);
        System.out.println(data4.size());
        return data4;
    }

    public static void main(String[] args) {
        Collection collections = new Collection();
        Map<String,Integer> arrayList = collections.getHashMap();
        System.out.println(arrayList);
    }
}
