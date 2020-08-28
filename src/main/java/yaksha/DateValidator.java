package yaksha;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class DateValidator {
	
	
  

 
//Java 8 - Use DateTimeFormatter (thread-safe)
public static boolean validateParseDate(String dateStr ) 
{
    LocalDate date = null;
    String dateFormat;
    if (dateStr.contains("-"))
     dateFormat = "MM-dd-uuuu";
    else if (dateStr.contains("."))
    	dateFormat = "MM.dd.uuuu";
    else dateFormat = "MM/dd/uuuu";
    
    
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormat)
            .withResolverStyle(ResolverStyle.STRICT);

    
    try {
        date = LocalDate.parse(dateStr, dateFormatter);
    } catch (DateTimeParseException e) {
    	
      //  e.printStackTrace();
        return false;
    }
    return true;
}


public static int calculateAge(String dateStr) {

	LocalDate currentDate = LocalDate.now();    
	//Today's date
	 LocalDate date = null;
	    String dateFormat;
	    if (dateStr.contains("-"))
	     dateFormat = "MM-dd-uuuu";
	    else if (dateStr.contains("."))
	    	dateFormat = "MM.dd.uuuu";
	    else dateFormat = "MM/dd/uuuu";
	    
	    
	    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormat)
	            .withResolverStyle(ResolverStyle.STRICT);

//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/uuuu");
	
	    LocalDate birthDate;
	//convert String to LocalDate
	    try {
	    	 birthDate = LocalDate.parse(dateStr, dateFormatter);  //Birth date
	    	 
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			return 0;
		}
	
	 
	if ((birthDate != null) && (currentDate != null)) {
        return Period.between(birthDate, currentDate).getYears();
    } else {
        return 0;
    }
	
	
	
	
}


}
	

