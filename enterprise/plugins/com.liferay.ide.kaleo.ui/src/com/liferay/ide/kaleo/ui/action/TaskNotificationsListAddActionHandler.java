/**
 * Copyright (c) 2014 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the End User License
 * Agreement for Liferay Developer Studio ("License"). You may not use this file
 * except in compliance with the License. You can obtain a copy of the License
 * by contacting Liferay, Inc. See the License for the specific language
 * governing permissions and limitations under the License, including but not
 * limited to distribution rights of the Software.
 */

package com.liferay.ide.kaleo.ui.action;

import com.liferay.ide.kaleo.core.model.Task;
import com.liferay.ide.kaleo.core.model.TaskActionNotification;

/**
 * @author Gregory Amerson
 */
public class TaskNotificationsListAddActionHandler extends NotificationsListAddActionHandler
{

    public TaskNotificationsListAddActionHandler()
    {
        super( TaskActionNotification.TYPE, Task.PROP_TASK_NOTIFICATIONS );
    }

}
