package HomeWork15;

import java.util.List;

public class ListUtilsImp implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        if (strings==null) {
            throw new IllegalArgumentException("tovar is null");
        }
        return null;

    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if (data==null) {
            throw new IllegalArgumentException("tovar is null");
        }

        return null;
    }
}
