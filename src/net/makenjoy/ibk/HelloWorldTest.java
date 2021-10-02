package net.makenjoy.ibk;


import static org.junit.Assert.*;
import org.junit.Test;


public class HelloWorldTest
{


		@Test
		public void testAdd()
		{
				HelloWorld hw = new HelloWorld();
				assertEquals(5, hw.add(3, 2));
		}

}
