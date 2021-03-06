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
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotPerspective;

/**
 * @author Terry Jia
 */
public class Perspective extends BasePageObject
{

    private final String label;

    public Perspective( final SWTWorkbenchBot bot, final String label )
    {
        super( bot );

        this.label = label;
    }

    public void activate()
    {
        getPerspective().activate();
    }

    protected SWTBotPerspective getPerspective()
    {
        return bot.perspectiveByLabel( label );
    }

}
