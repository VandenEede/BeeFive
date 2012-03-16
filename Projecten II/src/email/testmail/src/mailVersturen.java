package email.testmail.src;
import javax.mail.MessagingException;


public class mailVersturen 
{


	

	public static void main(String[] args) 
	{
		String recipients[] = new String[]{"soad_fan_666@hotmail.com"};
		 
		 String subject="testtest";
		 String message="als dit werk halliluja";
		 String from="arne.lammens.q1103@student.hogent.be";
	
		
		
	
		
		mail mm = new mail();
		try 
		{
			mm.postMail(recipients, subject, message, from);
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}

	}

}
