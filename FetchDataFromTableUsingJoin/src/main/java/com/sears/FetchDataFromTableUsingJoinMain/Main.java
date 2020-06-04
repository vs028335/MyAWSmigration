package com.sears.FetchDataFromTableUsingJoinMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sears.FetchDataFromTableUsingJoin.FetchDataFromTableUsingJoin;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FetchDataFromTableUsingJoin dataFromTableUsingJoin = (FetchDataFromTableUsingJoin) context
				.getBean("fetchDataFromTableUsingJoin");
		dataFromTableUsingJoin.fetchDataUsingJoin();
	}

}
