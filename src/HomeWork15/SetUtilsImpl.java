package HomeWork15;

import java.util.*;

public class SetUtilsImpl implements SetUtils {

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {

        if (collection1==null){
            throw  new  NullPointerException("tovar is null");
        }
        if (set2==null){
            throw  new  NullPointerException("tovar is null");
        }
        Comparator com=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (-1)*o1.compareTo(o2);
            }
        };
        SortedSet<String> result=new TreeSet<String>(com);
        for (Integer val:collection1){
            result.add(val.toString());
        }
        result.addAll(set2);
        return result;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        int [] arrayParams={ val1,  val2, val3,  val4,  val5};
        Set<Integer> result=new TreeSet<Integer>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });

        for (int i=0;i<arrayParams.length;i++){
            result.add(arrayParams[i]);
        }
        return result;
    }
}
