import org.junit.Test;

public class NetworkUntilTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond(){
        NetworkUtils.getConnection();
    }
}
