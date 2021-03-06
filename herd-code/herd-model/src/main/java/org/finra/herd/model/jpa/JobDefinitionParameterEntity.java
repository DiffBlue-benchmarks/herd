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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Parameter associated with job definition.
 */
@Table(name = JobDefinitionParameterEntity.TABLE_NAME)
@Entity
public class JobDefinitionParameterEntity extends AuditableEntity
{
    /**
     * The table name.
     */
    public static final String TABLE_NAME = "job_dfntn_atrbt";

    @Id
    @Column(name = TABLE_NAME + "_id")
    @GeneratedValue(generator = TABLE_NAME + "_seq")
    @SequenceGenerator(name = TABLE_NAME + "_seq", sequenceName = TABLE_NAME + "_seq", allocationSize = 1)
    private Integer id;

    /**
     * The parameter name column.
     */
    @Column(name = "atrbt_nm", nullable = false)
    private String name;

    /**
     * The parameter value column.
     */
    @Column(name = "atrbt_value_tx", length = 4000)
    private String value;

    @ManyToOne
    @JoinColumn(name = "job_dfntn_id", referencedColumnName = "job_dfntn_id", nullable = false)
    private JobDefinitionEntity jobDefinition;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public JobDefinitionEntity getJobDefinition()
    {
        return jobDefinition;
    }

    public void setJobDefinition(JobDefinitionEntity jobDefinition)
    {
        this.jobDefinition = jobDefinition;
    }
}
