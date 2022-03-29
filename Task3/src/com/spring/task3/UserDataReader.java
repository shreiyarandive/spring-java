package com.spring.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class UserDataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s = new Scanner(new FileReader("src/com/spring/task3/user_data.xml"))){
			UserBean bean = UserBean.getUserBeanInstance();
			
			s.nextLine();
			s.nextLine();
			s.nextLine();
			bean.setFirstName(s.nextLine().trim());
			s.nextLine();
			s.nextLine();
			bean.setLastName(s.nextLine().trim());
			
			System.out.println(bean);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
