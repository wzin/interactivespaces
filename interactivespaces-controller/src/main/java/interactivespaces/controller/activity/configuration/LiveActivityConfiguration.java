/*
 * Copyright (C) 2013 Google Inc.
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

package interactivespaces.controller.activity.configuration;

import java.util.Map;

import interactivespaces.configuration.Configuration;
import interactivespaces.evaluation.EvaluationEnvironment;

/**
 * 
 * 
 * @author Keith M. Hughes
 */
public interface LiveActivityConfiguration extends Configuration,
		EvaluationEnvironment {
	
	/**
	 * Load all configurations.
	 */
	void load();

	/**
	 * Update the configuration.
	 * 
	 * <p>
	 * This will save it after it is updated.
	 * 
	 * @param update
	 *            key/value pairs for the update
	 */
	void update(Map<String, Object> update);
}