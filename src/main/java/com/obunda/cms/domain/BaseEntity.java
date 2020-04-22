package com.obunda.cms.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity implements Serializable {

	/**
	 * https://stackoverflow.com/questions/49954812/how-can-you-make-a-created-at-column-generate-the-creation-date-time-automatical
	 * https://mkyong.com/java/how-to-generate-serialversionuid/
	 */
	private static final long serialVersionUID = 6701635601151576699L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;

    @Column(name = "DataChange_CreatedBy", nullable = false)
    private String dataChangeCreatedBy;

    @Column(name = "DataChange_CreatedTime", nullable = false)
    private Date dataChangeCreatedTime;

    @Column(name = "DataChange_LastModifiedBy")
    private String dataChangeLastModifiedBy;

    @Column(name = "DataChange_LastTime")
    private Date dataChangeLastModifiedTime;

    @PrePersist
    protected void prePersist() {
        if (this.dataChangeCreatedTime == null) dataChangeCreatedTime = new Date();
        if (this.dataChangeLastModifiedTime == null) dataChangeLastModifiedTime = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        this.dataChangeLastModifiedTime = new Date();
    }

    @PreRemove
    protected void preRemove() {
        this.dataChangeLastModifiedTime = new Date();
    }
}