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

import com.liferay.ide.swtbot.ui.page.CheckBox;
import com.liferay.ide.swtbot.ui.page.Radio;
import com.liferay.ide.swtbot.ui.page.Text;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

/**
 * @author Li Lu
 */
public class CreateJSFPortletWizard extends CreateLiferayPortletWizard
{

    private final CheckBox createViewFiles;
    private final Radio iceFaces;
    private final Radio liferayFacesAlloy;
    private final Radio primeFaces;
    private final Radio richFaces;
    private final Radio standardJsf;
    private final Text viewFolder;

    public CreateJSFPortletWizard( final SWTWorkbenchBot bot )
    {
        super( bot, 4 );

        createViewFiles = new CheckBox( bot, CREATE_VIRW_FILES );
        viewFolder = new Text( bot, VIEW_FOLDER );
        standardJsf = new Radio( bot, STANDARD_JSF );
        iceFaces = new Radio( bot, ICEFACES );
        liferayFacesAlloy = new Radio( bot, LIFERAY_FACES_ALLOY );
        primeFaces = new Radio( bot, PRIMEFACES );
        richFaces = new Radio( bot, RICHFACES );
    }

    public boolean isLiferayFacesAlloySelected()
    {
        return liferayFacesAlloy.isSelected();
    }

    public boolean _isStandardJSFSelected()
    {
        return standardJsf.isSelected();
    }

    public void deSelectCreateViewFiles()
    {
        createViewFiles.deselect();
    }

    public String getViewFolderText()
    {
        return viewFolder.getText();
    }

    public boolean isCreateViewFilesChecked()
    {
        return createViewFiles.isChecked();
    }

    public boolean isICEfacesEnabled()
    {
        return iceFaces.isEnabled();
    }

    public boolean isICEfacesSelected()
    {
        return iceFaces.isSelected();
    }

    public boolean isliferayFacesAlloyEnbled()
    {
        return liferayFacesAlloy.isEnabled();
    }

    public boolean isPrimeFacesEnbled()
    {
        return primeFaces.isEnabled();
    }

    public boolean isPrimeFacesSelected()
    {
        return primeFaces.isSelected();
    }

    public boolean isRichFacesEnbled()
    {
        return richFaces.isEnabled();
    }

    public boolean isRichFacesSelected()
    {
        return richFaces.isSelected();
    }

    public boolean isStandardJSFEnabled()
    {
        return standardJsf.isEnabled();
    }

    public boolean isViewFolderEnabled()
    {
        return viewFolder.isEnabled();
    }

    public void selectCreateViewFiles()
    {
        createViewFiles.select();
    }

    public void selectViewTemplate( String lable )
    {
        switch( lable )
        {
        case STANDARD_JSF:
            standardJsf.click();
        case ICEFACES:
            iceFaces.click();
        case LIFERAY_FACES_ALLOY:
            liferayFacesAlloy.click();
        case PRIMEFACES:
            primeFaces.click();
        case RICHFACES:
            richFaces.click();
        }
    }

    public void setViewFolderText( String text )
    {
        viewFolder.setText( text );
    }

}
