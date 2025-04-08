package Utilities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.util.Properties;
@Data
@NoArgsConstructor
class setPropertyUtils {

    private String browser;
    private String testurl;

    public setPropertyUtils(String filePath)
    {
        Properties p=new Properties();
        try{
            FileInputStream fileInputStream=new FileInputStream(filePath);
            p.load(fileInputStream);
            this.browser=p.getProperty("browser");
            this.testurl=p.getProperty("testurl");
        }
        catch (Exception e)
        {
            System.out.println("Runtime Exception");
        }
    }
    public static setPropertyUtils loadProperty()
    {
        String filePath=System.getProperty("user.dir")+"src\\main\\java\\configFiles\\config.properties";
        return new setPropertyUtils(filePath);
    }


}
