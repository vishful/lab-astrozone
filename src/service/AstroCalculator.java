package service;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import model.User;
// Type your code

public class AstroCalculator {
	public String findSign(User u) {
		String sign = "";
		LocalDate d=u.getDob();

		if(d.getMonthValue() == 1) {
			if(d.getDayOfMonth() < 20)
				sign = "Capricorn";
			else
				sign="Aquarius";
		}
		else if(d.getDayOfMonth() == 2) {
			if(d.getDayOfMonth()<19)
				sign = "Aquarius";
			else
				sign = "Pisces";
			}
		else if(d.getMonthValue() == 3) {
			if (d.getDayOfMonth()<21)
				sign = "Pisces";
			else
				sign = "Aries";
		}
		else if(d.getMonthValue() == 4) {
			if(d.getDayOfMonth()<20)
				sign = "Aries";
			else
				sign = "Taurus";
		}
		else if(d.getMonthValue() == 5) {
			if(d.getDayOfMonth()<21)
				sign = "Taurus";
			else
				sign = "Gemini";
		}
		else if(d.getMonthValue() == 6) {
			if(d.getDayOfMonth()<21)
				sign = "Gemini";
			else
				sign = "Cancer";
		}
		else if(d.getMonthValue() == 7) {
			if(d.getDayOfMonth()<23)
				sign = "Cancer";
			else
				sign = "Leo";
		}		
		else if(d.getMonthValue() == 8) {
			if(d.getDayOfMonth()<23)
				sign = "Leo";
			else
				sign = "Virgo";
		}		
		else if(d.getMonthValue() == 9) {
			if(d.getDayOfMonth()<23)
				sign = "Virgo";
			else
				sign = "Libra";
		}		
		else if(d.getMonthValue() == 10) {
			if(d.getDayOfMonth()<23)
				sign = "Libra";
			else
				sign = "Scorpio";
		}	
		else if(d.getMonthValue() == 11) {
			if(d.getDayOfMonth()<23)
				sign = "Scorpio";
			else
				sign = "Sagittarius";
		}
		else if(d.getMonthValue() == 12) {
			if(d.getDayOfMonth()<23)
				sign = "Sagittarius";
			else
				sign = "Capricorn";
		}
		return sign;

	}
}