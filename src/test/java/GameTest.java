import org.junit.*;
import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void newGame_instantiatesCorrectly() {
        Game testGame = new Game("a");
        assertEquals(true, testGame instanceof Game);
    }
}
