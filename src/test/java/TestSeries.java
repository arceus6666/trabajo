import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arceus6666 on 04/05/2018.
 */
public class TestSeries {

    @Test
    public void v1(){

        int[] expectedResult=new int[5];
        expectedResult[0]=0;
        expectedResult[1]=1;
        expectedResult[2]=1;
        expectedResult[3]=2;
        expectedResult[4]=3;
        int[] actualResult=Main2.fibonacci(5);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
    }

    @Test
    public void v2(){
        int[] expectedResult=new int[5];
        expectedResult[0]=0;
        expectedResult[1]=1;
        expectedResult[2]=1;
        expectedResult[3]=2;
        expectedResult[4]=3;
        int[] actualResult=Main2.fibonacci(5);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
    }
}
