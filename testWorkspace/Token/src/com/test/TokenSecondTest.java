package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class TokenSecondTest {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://www.homeDepot.com");
		URLConnection myconnection = url.openConnection();
		Scanner sc = new Scanner(new InputStreamReader(myconnection.getInputStream()));
		
		
		int counter=0;
		
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
			counter++;
		}
		System.out.println("Total Token Count: "+counter);

	}

}
