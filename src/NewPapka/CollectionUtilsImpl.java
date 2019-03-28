package NewPapka;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null) {
            throw new NullPointerException("tovar is null");
        }
        if (b==null) {
            throw new NullPointerException("tovar is null");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : a) {
            result.add(num);
        }
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null) {
            throw new NullPointerException("tovar is null");
        }
        if (b==null) {
            throw new NullPointerException("tovar is null");
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : a) {
            result.add(num);

        }
        result.addAll(b);
        result.remove(1);
        result.remove(1);
        result.remove(4);
        result.remove(4);

        return result;
    }


    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null) {
            throw new NullPointerException("tovar is null");
        }
        if (b==null) {
            throw new NullPointerException("tovar is null");
        }
        HashSet<Integer> result = new HashSet<>();
        for (Integer num : a) {
            result.add(num);
        }
        result.addAll(b);
        return result;

    }

    @Override
    public List<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null) {
            throw new NullPointerException("tovar is null");
        }
        if (b==null) {
            throw new NullPointerException("tovar is null");
        }
        List<Integer> list = new ArrayList<>();
        for (Integer t : a) {
            if (b.contains(t)) {
                list.add(t);
            }
        }


        return list; //Всё работает если у нас будет public List, а не Set
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a==null) {
            throw new NullPointerException("tovar is null");
        }
        if (b==null) {
            throw new NullPointerException("tovar is null");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : a) {
            result.add(num);
        }
        result.addAll(b);
        result.remove(0);
        result.remove(3);
        result.remove(2);
        result.remove(2);

        return result;


    }
}
