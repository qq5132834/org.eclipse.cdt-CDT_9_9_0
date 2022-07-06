/*******************************************************************************
 * Copyright (c) 2000, 2010 QNX Software Systems and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     QNX Software Systems - Initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.make.core.makefile.gnu;

import org.eclipse.cdt.make.core.makefile.IMacroDefinition;

/**
 */
/**
 * @noextend This class is not intended to be subclassed by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IVariableDefinition extends IMacroDefinition {

	boolean isRecursivelyExpanded();

	boolean isSimplyExpanded();

	boolean isConditional();

	boolean isAppend();

	boolean isTargetSpecific();

	boolean isExport();

	boolean isMultiLine();

	/**
	 * Variable from an `override' directive.
	 */
	boolean isOverride();

	/**
	 * Automatic variable -- cannot be set.
	 */
	boolean isAutomatic();

	String getTarget();
}
