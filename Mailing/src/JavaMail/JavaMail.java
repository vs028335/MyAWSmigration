package JavaMail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail 
{
	public static void sendMail(String recepient) throws MessagingException
	{
		System.out.println("Preparing to send mail.....");
		Properties properties=new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		
		String myAccount="vs028335@gmail.com";
		String password="8004633667anamika";
		
		Session session=Session.getInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return  new PasswordAuthentication(myAccount, password);
			}
		});
		
		Message message=prepareMessage(session,myAccount,recepient);
	
		Transport.send(message);
		System.out.println("Message send successfully");
	
	}

	private static Message prepareMessage(Session session, String myAccount, String recepient) {
		
		Message message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(myAccount));
			message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
			message.setSubject("This is myFirst java mailing program");
			message.setText("Please look my mail this is from java");
			
			return message;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
