package com.jamesdonnell.autopastebin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.jpaste.pastebin.account.PastebinAccount;

public class GetAccount {
	
	public static PastebinAccount get(String file) {
		
		String developerKey, username, password;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			developerKey = in.readLine();
			username = in.readLine();
			password = in.readLine();
			
			in.close();
		} catch (IOException e) {
			return null;
		}
		
		PastebinAccount account = new PastebinAccount(developerKey, username, password);
		return account;
	}
}