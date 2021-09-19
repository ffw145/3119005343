package TEST;

import org.junit.Test;
import com.yuchong.utils.SimHashUtils;

public class ShortStringExceptionTest {

    @Test
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(SimHashUtils.getSimHash("永失吾爱，举目破败"));
    }

}