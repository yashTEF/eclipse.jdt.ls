/*******************************************************************************
 * Copyright (c) 2021 Red Hat Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Microsoft Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.jdt.ls.core.internal.preferences;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PreferencesTest {

	@Test
	public void testSetImportOnDemandThreshold() throws Exception {
		Preferences preferences = new Preferences();
		preferences.setImportOnDemandThreshold(10);
		assertEquals(10, preferences.getImportOnDemandThreshold());

		// Zero will fallback to default
		preferences.setImportOnDemandThreshold(0);
		assertEquals(Preferences.IMPORTS_ONDEMANDTHRESHOLD_DEFAULT, preferences.getImportOnDemandThreshold());

		// Negative will fallback to default
		preferences.setImportOnDemandThreshold(-1);
		assertEquals(Preferences.IMPORTS_ONDEMANDTHRESHOLD_DEFAULT, preferences.getImportOnDemandThreshold());
	}

	@Test
	public void testSetStaticImportOnDemandThreshold() throws Exception {
		Preferences preferences = new Preferences();
		preferences.setStaticImportOnDemandThreshold(10);
		assertEquals(10, preferences.getStaticImportOnDemandThreshold());

		// Zero will fallback to default
		preferences.setStaticImportOnDemandThreshold(0);
		assertEquals(Preferences.IMPORTS_STATIC_ONDEMANDTHRESHOLD_DEFAULT, preferences.getStaticImportOnDemandThreshold());

		// Negative will fallback to default
		preferences.setStaticImportOnDemandThreshold(-1);
		assertEquals(Preferences.IMPORTS_STATIC_ONDEMANDTHRESHOLD_DEFAULT, preferences.getStaticImportOnDemandThreshold());
	}
}
