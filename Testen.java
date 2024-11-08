import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class Testen {
    private static List<String> strings;
    @BeforeEach //эта пометка всегда чтоб метод работал для всех тестов
    public void tearUp() {
        strings = List.of("Малина", "Апельсин", "Киви", "Малина", "Банан", "Киви");
    }
    @Test
    @DisplayName("getDuplicateStatusMap(): повторы строк отображаются корректно")
    public void test_korrekt_DublicateStatus_Map(){
        Map<String, Boolean> expectedresult = Map.of(
                "Малина", true, "Апельсин", false, "Киви", true, "Банан", false);//ожидание
        Map<String, Boolean> actualresult = Lists.getDuplicateStatusMap(strings);//вызываем работу метода
        Assertions.assertEquals(expectedresult, actualresult);
    }
    @Test
    @DisplayName("getDuplicateStatusMap(): нет дубликатов для уникальных строк")
    public void test_without_DublicateStatus_Map(){
        strings = List.of("Малина", "Апельсин", "Киви", "Банан");
        Map<String, Boolean> expectedresult = Map.of(
                "Малина", false, "Апельсин", false, "Киви", false, "Банан", false);//ожидание
        Map<String, Boolean> actualresult = Lists.getDuplicateStatusMap(strings);//вызываем работу метода
        Assertions.assertEquals(expectedresult, actualresult);
    }
    @Test
    @DisplayName("getDuplicateStatusMap(): пустая мап если список нулл")
    public void test_listNull() {
        strings = null;
        Map<String, Boolean> expectedresult = Map.of();
        Map<String, Boolean> actualresult = Lists.getDuplicateStatusMap(strings);
        Assertions.assertEquals(expectedresult, actualresult);
    }
}

