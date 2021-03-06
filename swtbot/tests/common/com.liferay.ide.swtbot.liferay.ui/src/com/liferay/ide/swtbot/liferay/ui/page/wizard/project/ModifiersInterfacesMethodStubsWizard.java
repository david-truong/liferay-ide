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

package com.liferay.ide.swtbot.liferay.ui.page.wizard.project;

import com.liferay.ide.swtbot.ui.page.Button;
import com.liferay.ide.swtbot.ui.page.CheckBox;
import com.liferay.ide.swtbot.ui.page.Table;
import com.liferay.ide.swtbot.ui.page.Wizard;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

/**
 * @author Ashley Yuan
 */
public class ModifiersInterfacesMethodStubsWizard extends Wizard
{

    private final Button addBtn;
    private final CheckBox constrcutFromSuperClass;
    private final CheckBox destory;
    private final CheckBox doAbout;
    private final CheckBox doConfig;
    private final CheckBox doEdit;
    private final CheckBox doEditDefaults;
    private final CheckBox doEditGuest;
    private final CheckBox doHelp;
    private final CheckBox doPreview;
    private final CheckBox doPrint;
    private final CheckBox doView;
    private final CheckBox inheritedAbstractMethods;
    private final CheckBox init;
    private final Table interfaces;
    private final CheckBox isAbstract;
    private final CheckBox isFinal;
    private final CheckBox isPublic;
    private final CheckBox processAction;
    private final Button removeBtn;
    private final CheckBox serveResource;

    public ModifiersInterfacesMethodStubsWizard( final SWTWorkbenchBot bot )
    {
        super( bot, 0 );

        isPublic = new CheckBox( bot, PUBLIC );
        isAbstract = new CheckBox( bot, ABSTRACT );
        isFinal = new CheckBox( bot, FINAL );
        interfaces = new Table( bot, INTERFACES );
        addBtn = new Button( bot, ADD_WITH_DOT );
        removeBtn = new Button( bot, REMOVE );
        constrcutFromSuperClass = new CheckBox( bot, CONSTRUCTORS_FROM_SUPERCLASS );
        inheritedAbstractMethods = new CheckBox( bot, INHERITED_ABSTRACT_METHODS );
        init = new CheckBox( bot, INIT );
        destory = new CheckBox( bot, DESTROY );
        doView = new CheckBox( bot, DOVIEW );
        doEdit = new CheckBox( bot, DOEDIT );
        doHelp = new CheckBox( bot, DOHELP );
        doAbout = new CheckBox( bot, DOABOUT );
        doConfig = new CheckBox( bot, DOCONFIG );
        doEditDefaults = new CheckBox( bot, DOEDITDEFAULTS );
        doEditGuest = new CheckBox( bot, DOEDITGUEST );
        doPreview = new CheckBox( bot, DOPREVIEW );
        doPrint = new CheckBox( bot, DOPRINT );
        processAction = new CheckBox( bot, PROCESSACTION );
        serveResource = new CheckBox( bot, SERVERESOURCE );
    }

    public Button getAddBtn()
    {
        return addBtn;
    }

    public CheckBox getConstrcutFromSuperClass()
    {
        return constrcutFromSuperClass;
    }

    public CheckBox getDestory()
    {
        return destory;
    }

    public CheckBox getDoAbout()
    {
        return doAbout;
    }

    public CheckBox getDoConfig()
    {
        return doConfig;
    }

    public CheckBox getDoEdit()
    {
        return doEdit;
    }

    public CheckBox getDoEditDefaults()
    {
        return doEditDefaults;
    }

    public CheckBox getDoEditGuest()
    {
        return doEditGuest;
    }

    public CheckBox getDoHelp()
    {
        return doHelp;
    }

    public CheckBox getDoPreview()
    {
        return doPreview;
    }

    public CheckBox getDoPrint()
    {
        return doPrint;
    }

    public CheckBox getDoView()
    {
        return doView;
    }

    public CheckBox getInheritedAbstractMethods()
    {
        return inheritedAbstractMethods;
    }

    public CheckBox getInit()
    {
        return init;
    }

    public Table getInterfaces()
    {
        return interfaces;
    }

    public CheckBox getIsAbstract()
    {
        return isAbstract;
    }

    public CheckBox getIsFinal()
    {
        return isFinal;
    }

    public CheckBox getIsPublic()
    {
        return isPublic;
    }

    public CheckBox getProcessAction()
    {
        return processAction;
    }

    public Button getRemoveBtn()
    {
        return removeBtn;
    }

    public CheckBox getServeResource()
    {
        return serveResource;
    }

}
