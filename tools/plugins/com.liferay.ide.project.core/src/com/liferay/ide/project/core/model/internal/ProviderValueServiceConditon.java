/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.project.core.model.internal;

import com.liferay.ide.project.core.modules.BaseModuleOp;

import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.services.ServiceCondition;
import org.eclipse.sapphire.services.ServiceContext;

/**
 * @author Simon Jiang
 */

public class ProviderValueServiceConditon extends ServiceCondition
{

    @Override
    public boolean applicable( final ServiceContext context )
    {
        boolean retval = false;

        final ValueProperty prop = context.find( ValueProperty.class );

        ValueProperty property = getProjectProvider();

        if( prop != null && ( prop.name().equals( property.name() ) ) )
        {
            retval = true;
        }

        return retval;
    }

    public ValueProperty getProjectProvider()
    {
        return BaseModuleOp.PROP_PROJECT_PROVIDER;
    }
}
