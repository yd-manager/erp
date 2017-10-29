package tr.com.yd.ee.erp.domain.entity.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public interface BaseEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "SequenceGenerator" ,strategy=GenerationType.SEQUENCE)
	Long getId();

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATION_DATE")
	Date getCreationDate();

	@Column(name = "CREATED_USER_ID")
	Long getCreatedUserId();

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	Date getUpdateDate();

	@Column(name = "UPDATED_USER_ID")
	Long getUpdatedUserId();

	@Column(name = "VERSION")
	Long getVersion();
	
	@Column(name = "DELETED")
	Boolean getDeleted();
}
