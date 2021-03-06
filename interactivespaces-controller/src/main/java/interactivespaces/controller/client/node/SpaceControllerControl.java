/*
 * Copyright (C) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package interactivespaces.controller.client.node;

import interactivespaces.controller.SpaceController;
import interactivespaces.controller.domain.InstalledLiveActivity;
import interactivespaces.liveactivity.runtime.LiveActivityRunner;

import java.util.List;
import java.util.Map;

/**
 * Control points for a {@link SpaceController}.
 *
 * @author Keith M. Hughes
 */
public interface SpaceControllerControl extends SpaceController {

  /**
   * Shut down the controller container.
   */
  void shutdownControllerContainer();

  /**
   * Configure the activity.
   *
   * @param uuid
   *          uuid of the activity
   * @param configuration
   *          the configuration request
   */
  void configureActivity(String uuid, Map<String, Object> configuration);

  /**
   * Get all live activities installed on this controller.
   *
   * @return all locally installed activities
   */
  List<InstalledLiveActivity> getAllInstalledLiveActivities();

  /**
   * Get an activity by UUID.
   *
   * @param uuid
   *          the UUID of the activity
   *
   * @return the activity with the given UUID, {@code null} if no such activity
   */
  LiveActivityRunner getLiveActivityRunnerByUuid(String uuid);

  /**
   * Clean the temp data folder for a given activity.
   *
   * @param uuid
   *          uuid of the activity
   */
  void cleanLiveActivityTmpData(String uuid);

  /**
   * Clean the permanent data folder for a given activity.
   *
   * @param uuid
   *          uuid of the activity
   */
  void cleanLiveActivityPermanentData(String uuid);

  /**
   * Clean the temp data folder for the controller.
   */
  void cleanControllerTempData();

  /**
   * Clean the permanent data folder for the controller.
   */
  void cleanControllerPermanentData();

  /**
   * Start up all activities in the controller that aren't currently started.
   */
  void startupAllActivities();

  /**
   * Shut down all activities in the controller.
   */
  void shutdownAllActivities();

  /**
   * Start up an activity given its UUID.
   *
   * @param uuid
   *          UUID of the activity to start.
   */
  void startupActivity(String uuid);

  /**
   * Start up an activity given its UUID.
   *
   * @param uuid
   *          UUID of the activity to start.
   */
  void shutdownActivity(String uuid);

  /**
   * Start up an activity given its UUID.
   *
   * @param uuid
   *          UUID of the activity to activate.
   */
  void activateActivity(String uuid);

  /**
   * Start up an activity given its UUID.
   *
   * @param uuid
   *          UUID of the activity to deactivate
   */
  void deactivateActivity(String uuid);

  /**
   * Cause a status check of an activity given its UUID.
   *
   * @param uuid
   *          UUID of the activity to get the status of
   */
  void statusLiveActivity(String uuid);

  /**
   * Capture data for the given controller from a URI.
   *
   * @param bundleUri
   *          The transfer uri.
   */
  void captureControllerDataBundle(String bundleUri);

  /**
   * Restore data for the given controller from a URI.
   *
   * @param bundleUri
   *          The transfer uri.
   */
  void restoreControllerDataBundle(String bundleUri);

  /**
   * Clean the temp data folder for the controller and all live activities.
   */
  void cleanControllerTempDataAll();

  /**
   * Clean the permanent data folder for the controller and all live activities.
   */
  void cleanControllerPermanentDataAll();
}
