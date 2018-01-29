/*
* Copyright 2015 herd contributors
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.finra.herd.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A storage platform.
 */
@Table(name = StoragePlatformEntity.TABLE_NAME)
@Entity
public class StoragePlatformEntity extends AuditableEntity
{
    /**
     * The table name.
     */
    public static final String TABLE_NAME = "strge_pltfm";

    /**
     * The S3 storage platform.
     */
    public static final String S3 = "S3";

    /**
     * The Relational storage platform
     */
    public static final String RELATIONAL = "RELATIONAL";

    /**
     * The name column.
     */
    public static final String COLUMN_NAME = "strge_pltfm_cd";

    @Id
    @Column(name = COLUMN_NAME)
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
