package com.spring.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MyFileReader {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(new FileReader("src/com/spring/task1/data.txt"))){
			MyBean bean = MyBean.getMyBeanInstance();
			
			bean.setFirstName(s.nextLine());
			bean.setLastName(s.nextLine());
			
			System.out.println(bean);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
