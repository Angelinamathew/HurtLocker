import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();

        System.out.println(output);

    }
//    public static Map<String, List<String> parseData(String text){
//
//    }
}
//LinkedHashmap
//ArrayList
//exceptions