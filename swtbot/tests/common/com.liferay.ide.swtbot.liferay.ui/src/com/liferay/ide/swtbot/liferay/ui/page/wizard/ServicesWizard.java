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

package com.liferay.ide.swtbot.liferay.ui.page.wizard;

import org.eclipse.swtbot.swt.finder.SWTBot;

import com.liferay.ide.swtbot.liferay.ui.DialogUI;
import com.liferay.ide.swtbot.liferay.ui.WizardUI;
import com.liferay.ide.swtbot.ui.page.Button;
import com.liferay.ide.swtbot.ui.page.Dialog;
import com.liferay.ide.swtbot.ui.page.Table;
import com.liferay.ide.swtbot.ui.page.Wizard;

/**
 * @author Vicky Wang
 */
public class ServicesWizard extends Wizard implements DialogUI, WizardUI
{

    private Button addBtn;
    private Dialog addServiceDialog;
    private Dialog addServiceWrapperDialog;
    private Table definePortalServices;
    private Button editBtn;
    private Button removeBtn;

    public ServicesWizard( SWTBot bot, int indexPortalPropertiesValidationMsg )
    {
        this( bot, TEXT_BLANK, indexPortalPropertiesValidationMsg );
    }

    public ServicesWizard( SWTBot bot, String title, int indexPortalPropertiesValidationMsg )
    {
        super( bot, title, indexPortalPropertiesValidationMsg );

        addServiceDialog = new Dialog( bot, WINDOW_ADD_SERVICE );
        addServiceWrapperDialog = new Dialog( bot, WINDOW_ADD_SERVICE_WRAPPER );
        definePortalServices = new Table( bot, LABLE_DEFINE_PORTAL_SERVICES );
        addBtn = new Button( bot, ADD_WITH_THREE_DOT );
        editBtn = new Button( bot, BUTTON_EDIT );
        removeBtn = new Button( bot, REMOVE_WITH_THREE_DOT );
    }

    public Button getAddBtn()
    {
        return addBtn;
    }

    public Dialog getAddServiceDialog()
    {
        return addServiceDialog;
    }

    public Dialog getAddServiceWrapperDialog()
    {
        return addServiceWrapperDialog;
    }

    public Table getDefinePortalServices()
    {
        return definePortalServices;
    }

    public Button getEditBtn()
    {
        return editBtn;
    }

    public Button getRemoveBtn()
    {
        return removeBtn;
    }

}