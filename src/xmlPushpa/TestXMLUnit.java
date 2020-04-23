package xmlPushpa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class TestXMLUnit {
	
	@Test
	public void test1() throws Exception{
		for(int i=1;i<=2;i++) {
			String prefix = "test"+i;
			Assert.assertTrue("test comparision failed for "+prefix,XMLUnit.compareXMLs(prefix+"_1.xml",prefix+"_2.xml"));
		}
	}

}

