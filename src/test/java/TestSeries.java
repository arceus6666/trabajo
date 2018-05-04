import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arceus6666 on 04/05/2018.
 */
public class TestSeries {

    @Test
    public void verificarPares(){

        int[] expectedResult=new int[1];
        expectedResult[0]=2;
        int[] actualResult=Main2.getNPairs(1);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
    }
}
