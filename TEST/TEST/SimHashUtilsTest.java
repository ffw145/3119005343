package TEST;

import org.junit.Test;
import com.yuchong.utils.SimHashUtils;
import com.yuchong.utils.TxtIOUtils;

public class SimHashUtilsTest {
    @Test
    public void getHashTest(){
        String[] strings = {"茫茫大雾", "是", "我", "无穷无尽", "无边无际","的", "哀恸"};
        for (String string : strings) {
            String stringHash = SimHashUtils.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig_0.8_add.txt");
        System.out.println(SimHashUtils.getSimHash(str0));
        System.out.println(SimHashUtils.getSimHash(str1));
    }

}
