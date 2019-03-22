/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.springframework.geode.boot.autoconfigure.configuration.support;

import java.util.Properties;

import org.apache.geode.cache.DataPolicy;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.RegionShortcut;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Spring Boot {@link ConfigurationProperties} used to configure the {@link DataPolicy} of all {@link Region Regions}
 * in an Apache Geode / Pivotal GemFire cluster.
 *
 * The configuration {@link Properties} are based on well-known, documented Spring Data for Apache Geode/Pivotal GemFire
 * (SDG) {@link Properties}.
 *
 * @author John Blum
 * @see java.util.Properties
 * @see org.apache.geode.cache.Region
 * @see org.springframework.boot.context.properties.ConfigurationProperties
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class ClusterProperties {

	private final RegionProperties regionProperties = new RegionProperties();

	public RegionProperties getRegion() {
		return this.regionProperties;
	}

	public static class RegionProperties {

		private RegionShortcut peerRegionType;

		public RegionShortcut getType() {
			return this.peerRegionType;
		}

		public void setType(RegionShortcut peerRegionType) {
			this.peerRegionType = peerRegionType;
		}
	}
}
