/**
 * 
 */
package phone;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * @author Ronak Goyal
 *
 */
public class ConvertPhoneToUSE164 {
	
	public static String convertNumber(String usNumberStr){
		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
		String output = usNumberStr;
		try {
			// parsing in the US format 
			PhoneNumber usNumber = phoneUtil.parse(usNumberStr, "US");
			// validating the number
			boolean isValid = phoneUtil.isValidNumber(usNumber);
			// if valid convert the number in E.164 format  
			// else output message with number
			if(isValid){
				output = phoneUtil.format(usNumber, PhoneNumberFormat.E164);
				return output;
			}else{
				return ("You entered an invalid number = "+usNumberStr) ;
			}
		} catch (NumberParseException e) {
			return ("You entered an invalid number = "+usNumberStr) ;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For User Input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a US phone number");
		String usNumberStr = scan.next();
		String output = convertNumber(usNumberStr);
		System.out.println(output);
		
		
		// test cases
		assertEquals("+14256814131", ConvertPhoneToUSE164.convertNumber("4256814131")); 
		assertEquals("You entered an invalid number = 425681413199", ConvertPhoneToUSE164.convertNumber("425681413199"));

	}

}
