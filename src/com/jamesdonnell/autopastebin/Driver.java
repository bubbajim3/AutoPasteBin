package com.jamesdonnell.autopastebin;

/** Driver class for Auto-PasteBin application.
 * @author James A. Donnell Jr. */
public class Driver {

	private static final String file = "F:\\Desktop\\account.info";
	
	public static void main(String[] args) {
		String copy = CopyCapture.capture();
		String pasteBinURL = PasteBinUpload.upload(copy, GetAccount.get(file));
		String bitlyURL = BitlyShorten.shorten(pasteBinURL);
		PasteStore.store(bitlyURL);
	}
}