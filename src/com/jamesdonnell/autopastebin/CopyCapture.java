package com.jamesdonnell.autopastebin;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class CopyCapture {

	public static String capture() {
		String result;
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			result = (String) clipboard.getData(DataFlavor.stringFlavor);
		} catch(Exception e) {
			result = "error";
		}
		return result;
	}
}