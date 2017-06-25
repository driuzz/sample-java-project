import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void sampleTest() {
        Assert.assertEquals("Sample", new Sample().call("sample"));
    }
}
