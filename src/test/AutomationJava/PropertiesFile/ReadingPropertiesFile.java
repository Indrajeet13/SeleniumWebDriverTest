package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		
		//Location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
		
		//Loading properties file
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);
		
		//Reading data from properties file
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		String pass = propertiesobj.getProperty("password");
		String oid = propertiesobj.getProperty("orderid");
		String cid = propertiesobj.getProperty("cust_id");
		
		System.out.println(url+" "+email+" "+pass+" "+oid+" "+cid);
		
		//Reading all keys from peroperties file
		Set<String> keys = propertiesobj.stringPropertyNames();
		System.out.println(keys);
		
		//Reading all the values from properties file
		Collection<Object> values = propertiesobj.values();
		System.out.println(values);	
		
		file.close();
		
		
	}

}
