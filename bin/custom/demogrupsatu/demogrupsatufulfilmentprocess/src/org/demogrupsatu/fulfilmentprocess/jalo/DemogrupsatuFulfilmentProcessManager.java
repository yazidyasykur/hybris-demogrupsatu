/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demogrupsatu.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.demogrupsatu.fulfilmentprocess.constants.DemogrupsatuFulfilmentProcessConstants;

public class DemogrupsatuFulfilmentProcessManager extends GeneratedDemogrupsatuFulfilmentProcessManager
{
	public static final DemogrupsatuFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (DemogrupsatuFulfilmentProcessManager) em.getExtension(DemogrupsatuFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
