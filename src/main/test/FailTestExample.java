import junit.framework.*;

public class FailTestExample extends TestCase {

    public void testOK() {
        assertEquals( 1, 1 );
        assertTrue( true );
        assertFalse( false );
    }

    public void testBad() {
        fail("will always fail");
    }

    public static Test suite() {
        return new TestSuite( FailTestExample.class );
    }
}
