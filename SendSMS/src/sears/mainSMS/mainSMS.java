package sears.mainSMS;

import java.util.Date;
import sears.SendSMS.SendSMS;

public class mainSMS {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		System.out.println("Program started..........");
		SendSMS.sendSMS("Hello Anudisya :) " + new Date().toLocaleString(), "7978551832,8299830629");
	}

}
