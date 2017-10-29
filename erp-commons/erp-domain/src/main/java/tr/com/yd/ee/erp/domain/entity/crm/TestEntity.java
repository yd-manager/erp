package tr.com.yd.ee.erp.domain.entity.crm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import tr.com.yd.ee.erp.domain.entity.base.BaseEntity;

@Entity
@Table(name = "TEST_TABLE")
@SequenceGenerator(sequenceName = "SEQ_TEST_TABLE",name = "SequenceGenerator",allocationSize=1 ,initialValue=1)
public interface TestEntity extends BaseEntity{

	@Column(name = "C1")
	String getTestColumn();
	
	@ManyToOne(targetEntity = ParentEntity.class)
	ParentEntity getParent();
}
