import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ProgramTest {

    @Test
    public void testPass(){
        assertTrue(true);
    }

    @Test
    public void testFail(){
        fail();
    }

}
