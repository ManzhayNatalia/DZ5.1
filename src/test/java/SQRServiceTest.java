import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRtest.csv")
    void shouldCalculateForRegisteredAndUnderLimit(int x, int y, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        int actual = service.calculate(x, y);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

