package com.n2hsu.android.o0o.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Tool {

	// ���������ַ�
	public static String StringFilter(String str) throws PatternSyntaxException {
		// ֻ������ĸ������
		// String regEx = "[^a-zA-Z0-9]";
		if (str == null) {
			return null;
		}
		String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}
}
