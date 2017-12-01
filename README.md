"# PhoneNumberE.164" 
/ *
Write a function that accepts a user input phone number string type and returns a normalized United States phone number string type in E.164 format. Return null (or an equivalent value) if the user input phone number is invalid.
*/
I have used the google library called libphonenumber. As you said i can use the libraries.
Process :-
1.We are parsing the input number in US number.
2. Checking whether the number is a valid US number or not.
3. If it is a valid number we convert the number into E.164 format.
4. Else we print the number is invalid.


Reference:-
1.https://support.twilio.com/hc/en-us/articles/223183008-Formatting-International-Phone-Numbers
2. https://mvnrepository.com/artifact/com.googlecode.libphonenumber/libphonenumber/7.0
3. https://www.cm.com/blog/how-to-format-international-telephone-numbers/

other way to do this is shown  below:-
Process:-
1. Use the regex to validate the number and remove the brackets and non- numeric characters.
2. check the length of the number.
3. if valid number add +1 to it.
4. else print invalid unput with the input.
