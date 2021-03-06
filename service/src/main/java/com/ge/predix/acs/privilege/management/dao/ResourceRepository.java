/*******************************************************************************
 * Copyright 2016 General Electric Company.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.ge.predix.acs.privilege.management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ge.predix.acs.zone.management.dao.ZoneEntity;

/**
 *
 * @author 212360328
 */
public interface ResourceRepository extends JpaRepository<ResourceEntity, Long> {

    List<ResourceEntity> findByZone(final ZoneEntity zone);

    ResourceEntity getByZoneAndResourceIdentifier(final ZoneEntity zone, final String resourceIdentifier);

}
