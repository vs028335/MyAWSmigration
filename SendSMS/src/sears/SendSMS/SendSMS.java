package sears.SendSMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;

public class SendSMS {
	public static void sendSMS(String message, String number) throws Exception {
		try {
			String apiKey = "OoXKDJcMTmvARIa7NP4FLkxYw9g3s0lVpyWSzUqH5eniC6hBd29gqMvJUkjXuaOpcLNn3RYEoWTedshy";
			String sendId = "FSTSMS";
			message = URLEncoder.encode(message, "UTF-8");
			String language = "english";
			String route = "p";

			String myUrl = "https://www.fast2sms.com/dev/bulk?authorization=" + apiKey + "&sender_id=" + sendId
					+ "&language=" + language + "&route=" + route + "&numbers=" + number + "&message=" + message;

			// SAending get request using java
			URL url = new URL(myUrl);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", "Mozilla/5.0");
			conn.setRequestProperty("cache-control", "no-cache");
			System.out.println("Waiting----------");
			int code = conn.getResponseCode();
			System.out.println("Response code:=" + code);
			StringBuffer responce = new StringBuffer();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				responce.append(line);
			}
			System.out.println(responce);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
