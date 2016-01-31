package com.jamesdonnell.autopastebin;

import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class PasteStore {

	public static boolean store(String text) {
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);
		return true;
	}
}