package restFullServices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {


 public String readProperty(String key) throws IOException {
     Properties prop = new Properties();
     File file = new File("C:\\Users\\Saurav\\IntelliJ_Idea_projects\\IntelliJ_SampleProj\\src\\test\\java\\restFullServices\\property.properties");
     FileInputStream fis = new FileInputStream(file);
     prop.load(fis);
     return  prop.getProperty(key);
 }
}
