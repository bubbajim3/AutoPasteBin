package com.jamesdonnell.autopastebin;

import org.jpaste.exceptions.PasteException;
import org.jpaste.pastebin.PastebinPaste;
import org.jpaste.pastebin.account.PastebinAccount;
import org.jpaste.pastebin.exceptions.LoginException;

public class PasteBinUpload {

	private static final String title = "Paste done by AutoPastebin";
	
	public static String upload(String pasteText, PastebinAccount account) {
		try {
			account.login();
		} catch (LoginException e) {
			System.out.println("error on login");
			return "error on login";
		}
		
		try {
			PastebinPaste paste = new PastebinPaste(account);
			paste.setContents(pasteText);
			paste.setPasteTitle(title);
			return paste.paste().getLink().toString();
		} catch (PasteException e) {
			e.printStackTrace();
			return "error on paste";
		}
	}
}