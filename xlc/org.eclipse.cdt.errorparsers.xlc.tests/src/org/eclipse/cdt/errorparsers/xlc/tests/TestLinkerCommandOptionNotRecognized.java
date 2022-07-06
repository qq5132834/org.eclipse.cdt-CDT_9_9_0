/*******************************************************************************
 * Copyright (c) 2006, 2013 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.cdt.errorparsers.xlc.tests;

import org.eclipse.cdt.core.IMarkerGenerator;

import junit.framework.TestCase;

public class TestLinkerCommandOptionNotRecognized extends TestCase {
	String err_msg;

	/**
	 * This function tests parseLine function of the
	 * XlcErrorParser class. A warning message generated by
	 * xlc linker about command options is given as
	 * input for testing.
	 */
	public void testparseLine() {
		XlcErrorParserTester aix = new XlcErrorParserTester();
		aix.parseLine(err_msg);
		assertEquals("", aix.getFileName(0));
		assertEquals(0, aix.getLineNumber(0));
		assertEquals(IMarkerGenerator.SEVERITY_WARNING, aix.getSeverity(0));
		assertEquals("The -9 flag is not recognized.", aix.getMessage(0));
	}

	public TestLinkerCommandOptionNotRecognized(String name) {
		super(name);
		err_msg = "ld: 0706-012 The -9 flag is not recognized.";
	}
}
