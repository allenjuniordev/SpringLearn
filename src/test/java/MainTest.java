import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testCreateOrder() {
        Main main = new Main();
        String data = main.createOrder("tomato", "capuccino");
        assertEquals("You ordered a capuccino", data);
        data = main.createOrder("not tomato", "capuccino");
        assertEquals("Sorry, we don't serve your type of coffee", data);
    }
}