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

package com.liferay.ide.swtbot.liferay.ui.page.dialog;

import com.liferay.ide.swtbot.ui.page.Button;
import com.liferay.ide.swtbot.ui.page.Dialog;
import com.liferay.ide.swtbot.ui.page.Text;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

/**
 * @author Vicky Wang
 */
public class AddServiceWrapperDialog extends Dialog
{

    private final Text implClass;
    private final Button newBtn;
    private final Button selectImplClassBtn;
    private final Button selectServiceTypeBtn;
    private final Text serviceType;

    public AddServiceWrapperDialog( final SWTWorkbenchBot bot )
    {
        super( bot );

        serviceType = new Text( bot, SERVICE_TYPE );
        implClass = new Text( bot, IMPL_CLASS );
        selectServiceTypeBtn = new Button( bot, SELECT );
        selectImplClassBtn = new Button( bot, SELECT );
        newBtn = new Button( bot, NEW_WITH_DOT );
    }

    public Text getImplClass()
    {
        return implClass;
    }

    public Button getNewBtn()
    {
        return newBtn;
    }

    public Button getSelectImplClass( int index )
    {
        return selectImplClassBtn;
    }

    public Button getSelectServiceType()
    {
        return selectServiceTypeBtn;
    }

    public Text getServiceType()
    {
        return serviceType;
    }

}
