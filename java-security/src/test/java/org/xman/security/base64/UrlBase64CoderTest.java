
package org.xman.security.base64;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrlBase64CoderTest {


	@Test
	public final void test() throws Exception {

		String inputStr = "https://github.com/kingsmiler";

		System.err.println("原文:\t" + inputStr);

		// 进行Base64编码
		String code = UrlBase64Coder.encode(inputStr);

		System.err.println("编码后:\t" + code);

		// 进行Base64解码
		String outputStr = UrlBase64Coder.decode(code);

		System.err.println("解码后:\t" + outputStr);

		// 验证Base64编码解码一致性
		assertEquals(inputStr, outputStr);

	}

}
