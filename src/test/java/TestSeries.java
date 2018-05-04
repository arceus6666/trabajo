import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arceus6666 on 04/05/2018.
 */
public class TestSeries {

    @Test
    public void testFibonacci1(){


        int[] expectedResult=new int[0];

        int[] actualResult=Main2.fibonacci(-100);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
        System.out.println("Test1Exito");
    }

    @Test
    public void testFibonacci2(){

        int[] expectedResult=new int[0];
        int[] actualResult=Main2.fibonacci(-101);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
        System.out.println("Test2exito");
    }

    @Test
    public void testFibonacci3(){

        int[] expectedResult=new int[0];
        int[] actualResult=Main2.fibonacci(-99);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
        System.out.println("Test3exito");
    }

    @Test
    public void testFibonacci4(){


        String expectedResult="354224848179261915075";
        int[] actualResult=Main2.fibonacci(100);

        Assert.assertTrue("La serie no devuelve valores correctos", expectedResult.equals((actualResult[99] + "")));
        System.out.println("Test4exito");
    }

    @Test
    public void testFibonacci5(){

        String expectedResult= "573147844013817084101";
        int[] actualResult=Main2.fibonacci(101);

        Assert.assertTrue("La serie no devuelve valores correctos", expectedResult.equals((actualResult[100] + "")));
        System.out.println("Test5exito");
    }

    @Test
    public void testFibonacci6(){

        String expectedResult = "218922995834555169026";
        int[] actualResult=Main2.fibonacci(99);
        
        Assert.assertTrue("La serie no devuelve valores correctos", expectedResult.equals((actualResult[98] + "")));
        System.out.println("Test6exito");
    }

    @Test
    public void testFibonacci7(){

        int[] expectedResult=new int[0];
        int[] actualResult=Main2.fibonacci(-1);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
        System.out.println("Test7exito");
    }

    @Test
    public void testFibonacci8(){

        int[] expectedResult=new int[0];
        int[] actualResult=Main2.fibonacci(0);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
        System.out.println("Test8exito");
    }

    @Test
    public void testFibonacci9(){

        int[] expectedResult=new int[1];
        expectedResult[0]=0;
        int[] actualResult=Main2.fibonacci(1);

        Assert.assertArrayEquals("La serie no devuelve valores correctos", expectedResult, actualResult);
        System.out.println("Test9exito");
    }

}
