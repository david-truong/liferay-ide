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

package com.liferay.ide.swtbot.ui.page;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton;

/**
 * @author Terry Jia
 */
public class ToolbarDropDownButton extends AbstractWidget
{

    public ToolbarDropDownButton( final SWTWorkbenchBot bot, final String label )
    {
        super( bot, label );
    }

    @Override
    protected SWTBotToolbarDropDownButton getWidget()
    {
        return bot.toolbarDropDownButtonWithTooltip( label );
    }

    public void menuClick( final String menuItemLabel )
    {
        new MenuItem( bot, this, menuItemLabel ).click();
    }

    public void click()
    {
        getWidget().click();
    }

}
