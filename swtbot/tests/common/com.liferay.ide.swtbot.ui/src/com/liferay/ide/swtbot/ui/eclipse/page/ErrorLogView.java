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

package com.liferay.ide.swtbot.ui.eclipse.page;

import com.liferay.ide.swtbot.ui.page.View;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

/**
 * @author Terry Jia
 */
public class ErrorLogView extends View
{

    private final String clearErrorLogBtnLabel = CLEAR_LOG_VIEWER;

    public ErrorLogView( final SWTWorkbenchBot bot )
    {
        super( bot, ERROR_LOG_WORKSPACE_LOG );
    }

    public void clearErrorLog()
    {
        if( hasProblems() )
        {
            clickToolbarButton( clearErrorLogBtnLabel );
        }
    }

    public boolean hasProblems()
    {
        // return( problemTree.getAllItems().length > 0 );
        return false;
    }

}
