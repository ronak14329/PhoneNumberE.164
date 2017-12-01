/**
 * 
 */
package phone;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ronak Goyal
 *
 */
public class ValidNumber {

	/**
	 * Test method for {@link phone.ConvertPhoneToUSE164#main(java.lang.String[])}.
	 */
	@Test
	public final void testMain() {
	//	fail("Not yet implemented"); // TODO
		assertEquals("+14256814131", ConvertPhoneToUSE164.convertNumber("4256814131"));
		assertEquals("+425681413111", ConvertPhoneToUSE164.convertNumber("425681413111"));
	}

}
