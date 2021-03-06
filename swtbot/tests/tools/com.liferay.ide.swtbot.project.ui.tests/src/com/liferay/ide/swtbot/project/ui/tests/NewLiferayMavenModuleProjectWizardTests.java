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

package com.liferay.ide.swtbot.project.ui.tests;

import com.liferay.ide.swtbot.liferay.ui.SwtbotBase;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Sunny Shi
 * @author Ying Xu
 */
public class NewLiferayMavenModuleProjectWizardTests extends SwtbotBase
{

    @Test
    public void createMvcPortlet()
    {
        final String projectName = "test-mvc-portlet";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, MVC_PORTLET );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createService()
    {
        final String projectName = "test-service";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, SERVICE );

        wizardAction.next();

        wizardAction.openSelectServiceDialog();

        dialogAction.prepareText( "*lifecycleAction" );

        dialogAction.confirm();

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createServiceBuilder()
    {
        final String projectName = "test-service-builder";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, SERVICE_BUILDER );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createActivator()
    {
        final String projectName = "test-activator";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, ACTIVATOR );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createApi()
    {
        final String projectName = "test-api";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, API );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createContentTargetingReport()
    {
        final String projectName = "test-content-targeting-report";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, CONTENT_TARGETING_REPORT );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createContentTargetingRule()
    {
        final String projectName = "test-content-targeting-rule";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, CONTENT_TARGETING_RULE );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createContentTargetingTrackingAction()
    {
        final String projectName = "test-content-targeting-tracking-action";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, CONTENT_TARGETING_TRACKING_ACTION );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createControlMenuEntry()
    {
        final String projectName = "test-control-menu-entry";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, CONTROL_MENU_ENTRY );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createFormField()
    {
        final String projectName = "test-form-field";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, FORM_FIELD );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createPanelApp()
    {
        final String projectName = "test-panel-app";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, PANEL_APP );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createPortlet()
    {
        final String projectName = "test-portlet";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, PORTLET );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createPortletConfigurationIcon()
    {
        final String projectName = "test-portlet-configuration-icon";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, PORTLET_CONFIGURATION_ICON );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createPortletProvider()
    {
        final String projectName = "test-portlet-provider";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, PORTLET_PROVIDER );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createPortletToolbarContributor()
    {
        final String projectName = "test-portlet-toolbar-contributor";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, PORTLET_TOOLBAR_CONTRIBUTOR );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createRest()
    {
        final String projectName = "test-rest";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, REST );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createServiceWrapper()
    {
        final String projectName = "test-service-wrapper";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, SERVICE_WRAPPER );

        wizardAction.next();

        wizardAction.openSelectServiceDialog();

        dialogAction.prepareText( "*bookmarksEntryServiceWrapper" );

        dialogAction.confirm();

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createSimulationPanelEntry()
    {
        final String projectName = "test-simulation-panel-entry";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, SIMULATION_PANEL_ENTRY );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createTemplateContextContributor()
    {
        final String projectName = "test-template-context-contributor";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, TEMPLATE_CONTEXT_CONCONTRIBUTOR );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Ignore
    @Test
    public void createTheme()
    {
        final String projectName = "test-theme";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, THEME );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

    @Test
    public void createThemeContributor()
    {
        final String projectName = "test-theme-contributor";

        wizardAction.openNewLiferayModuleWizard();

        wizardAction.prepareLiferayModuleMaven( projectName, THEME_CONTRIBUTOR );

        wizardAction.finishToWait();

        viewAction.deleteProject( projectName );
    }

}
