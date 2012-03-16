import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProjectEulerNumberOneTest {

    private final ProjectEulerNumberOne projectEulerNumberOne = new ProjectEulerNumberOne();

    @Test
    public void testGetResult() throws Exception {
        assertEquals("result", 233168, projectEulerNumberOne.getResult());
    }
}
