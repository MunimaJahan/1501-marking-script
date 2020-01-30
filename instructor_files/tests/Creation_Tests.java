import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Quiz: PettingZoo: CreationTests")
public class Creation_Tests {

    @Test
    @DisplayName("constructor takes no parameters")
    public void constructor_takes_no_parameters() {
        new PettingZoo();
    }
     
}
