package com.techlabs.factorymethod.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factorymethod.AudiFactory;
import com.techlabs.factorymethod.BMWFactory;
import com.techlabs.factorymethod.IAutoFactory;
import com.techlabs.factorymethod.IAutomobile;

public class FactoryMethodTest {

	public static void main(String args[]) throws Exception {


		FileReader reader=new FileReader("Resources\\Factory.properties");  
	    Properties p=new Properties();  
	    p.load(reader);
	    String propFileName="Resources\\Factory.properties";
	    String c1=p.getProperty("factoryName");
	    Class c2=Class.forName(c1);
	    
	    
	    Method m=c2.getDeclaredMethod("getInstance",null);
	    IAutoFactory factory=(IAutoFactory) m.invoke(null);
	    IAutomobile auto=factory.make();
	    auto.start();
	    auto.stop();
	    
	}
}
