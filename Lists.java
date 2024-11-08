import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ИЗМЕНИЛА КОД ПО ВАШЕМУ КОММЕНТАРИЮ И РАЗДЕЛИЛА МЕТОД poiskPovtora на 2 МЕТОДА

public class Lists {
    public static Map<String, Integer> getCountMap(List<String> strings) {//первый считает вхождения
        Map<String, Integer> countMap = new HashMap<>();
        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        return countMap;
    }
    public static Map<String, Boolean> getDuplicateStatusMap(List<String> strings) {//второй проверяет повторения
        Map<String, Integer> countMap = getCountMap(strings);
        Map<String, Boolean> duplicateStatusMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            duplicateStatusMap.put(entry.getKey(), entry.getValue() > 1);
        }
        return duplicateStatusMap;
    }
}
