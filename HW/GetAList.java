import java.util.*;
public class GetAList {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(10);

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 10);

        Set<Integer> temp = new HashSet<>(map.values());
        List<Integer> res = new ArrayList<>();
        for (Integer l : alist) {
            if (!temp.contains(l)) res.add(l);
        }
        System.out.println(res);
    }
}

