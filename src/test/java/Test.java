import org.testng.Assert;

public class Test {
    @org.testng.annotations.Test
    public void test(){
        int a = 2, b = 2;
        int result = 4;
        int actual = a + b;
        Assert.assertEquals(actual, result);
    }

    @org.testng.annotations.Test
    public void test1(){
        int a = 4, b = 2;
        int result = 2;
        int actual = a - b;
        Assert.assertEquals(actual, result);
    }

    @org.testng.annotations.Test
    public void test2(){
        int a = 50, b = 2;
        int result = 100;
        int actual = a * b;
        Assert.assertEquals(actual, result);
    }

    @org.testng.annotations.Test
    public void test3(){
        int a = 100, b = 2;
        int result = 50;
        int actual = a / b;
        Assert.assertEquals(actual, result);
    }

}
