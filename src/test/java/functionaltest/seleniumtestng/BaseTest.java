package functionaltest.seleniumtestng;

import org.testng.annotations.BeforeSuite;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

public class BaseTest  {
    public Properties prop;


    private void initialize() {
        try {
            prop = new Properties();
            InputStream file = new FileInputStream(System.getProperty("user.dir")+ File.separator+"src"+
                    File.separator+"Properties.properties");
            prop.load(file);


        } catch(Exception e){
                e.printStackTrace();
            }
    }

    @BeforeSuite
    public HashMap<String,String> getData(){
        HashMap<String,String> map = new HashMap<String,String>();
        initialize();
        for(Entry<Object,Object> entry : prop.entrySet()){
            map.put((String) entry.getKey(),(String) entry.getValue());
        }


        return map;
    }

}
