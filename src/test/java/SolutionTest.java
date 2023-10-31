import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findArrayTest1(){
        int[] pref = {5,2,0,3,1};
        int[] expected = {5,7,2,3,2};
        int[] actual = new Solution().findArray(pref);

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void findArrayTest2(){
        int[] pref = {13};
        int[] expected = {13};
        int[] actual = new Solution().findArray(pref);

        Assert.assertArrayEquals(expected, actual);
    }

}
