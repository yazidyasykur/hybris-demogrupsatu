/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demogrupsatu.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.demogrupsatu.core.constants.DemogrupsatuCoreConstants;
import org.demogrupsatu.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class DemogrupsatuCoreManager extends GeneratedDemogrupsatuCoreManager
{
	public static final DemogrupsatuCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (DemogrupsatuCoreManager) em.getExtension(DemogrupsatuCoreConstants.EXTENSIONNAME);
	}
}
