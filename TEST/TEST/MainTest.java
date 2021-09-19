package TEST;

import org.junit.Test;
import com.yuchong.utils.*;

import java.io.*;

public class MainTest {

    @Test
    public void origAndOrigTest() throws IOException {
        String str0 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String ansFileName = "C:/Users/wyc/Desktop/test/ansOrigAndOrigTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        FileWriter fw = new FileWriter(ansFileName);
        fw.write("orig.txt与orig.txt的查重率为：");
        fw.close();
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest() throws IOException {
        String str0 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig_0.8_add.txt");
        String ansFileName = "C:/Users/wyc/Desktop/test/ansOrigAndAddTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        FileWriter fw = new FileWriter(ansFileName);
        fw.write("orig.txt与orig_0.8_add.txt的查重率为：");
        fw.close();
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest() throws IOException {
        String str0 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig_0.8_del.txt");
        String ansFileName = "C:/Users/wyc/Desktop/test/ansOrigAndDelTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        FileWriter fw = new FileWriter(ansFileName);
        fw.write("orig.txt与orig_0.8_del.txt的查重率为：");
        fw.close();
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test() throws IOException {
        String str0 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig_0.8_dis_1.txt");
        String ansFileName = "C:/Users/wyc/Desktop/test/ansOrigAndDis1Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        FileWriter fw = new FileWriter(ansFileName);
        fw.write("orig.txt与orig_0.8_dis_1.txt的查重率为：");
        fw.close();
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test() throws IOException {
        String str0 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig_0.8_dis_10.txt");
        String ansFileName = "C:/Users/wyc/Desktop/test/ansOrigAndDis10Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        FileWriter fw = new FileWriter(ansFileName);
        fw.write("orig.txt与orig_0.8_dis_10.txt的查重率为：");
        fw.close();
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test() throws IOException {
        String str0 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig.txt");
        String str1 = TxtIOUtils.readTxt("C:/Users/wyc/Desktop/test/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/wyc/Desktop/test/ansOrigAndDis15Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        FileWriter fw = new FileWriter(ansFileName);
        fw.write("orig.txt与orig_0.8_dis_15.txt的查重率为：");
        fw.close();
        TxtIOUtils.writeTxt(ans, ansFileName);
    }

}