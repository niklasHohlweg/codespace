package Sem02_Bob.ObjektorientierteSysteme.virus;

import java.security.SecureRandom;
import java.util.Date;

public class VirusGenerator 
{
	private static SecureRandom sr = new SecureRandom();
	private static long millis = 0L;
	private static long modu = 10L;

	public static String generateVirus(boolean error)
	{
		String virus = null;
		millis = System.currentTimeMillis() - sr.nextInt(2_000_000_000);
		
		Date date = new Date(millis);
		
		virus = getVirus() + changeDate(date, error);
		
		return virus;
	}
	
	private static String getVirus()
	{
		return (millis % 2 == 0 ? "Divoc91 " : "Influenza ");
	}
	
	private static String changeDate(Date date, boolean error)
	{
		StringBuffer dateBuffer = new StringBuffer(date.toString());
		
		if (error) {
			switch ((int) (millis % modu))
			{
			case 10: 
				dateBuffer.replace(0, 1, "X");
				break;
			case 1: 
				dateBuffer.replace(4, 7, "MONTH");
				break;
			case 2: 
				dateBuffer.replace(8, 9, "7");
				break;
			case 3: 
				dateBuffer.replace(11, 12, "5");
				break;
			case 4: 
				dateBuffer.replace(13, 14, "-");
				break;
			case 5: 
				dateBuffer.replace(15, 16, "#");
				break;
			case 6: 
				dateBuffer.replace(17, 18, ">>");
				break;
			case 7: 
				dateBuffer.replace(20, 24, "BST");
				break;
			case 8: 
				dateBuffer.replace(26, 30, "ABC");
				break;
				
			default:
	
			}
		}
		
		return dateBuffer.toString();
	}
}