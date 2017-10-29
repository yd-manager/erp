package tr.com.yd.ee.erp.domain.entity.crm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import tr.com.yd.ee.erp.domain.entity.base.BaseEntity;

@Entity
@Table(name = "TEST_TABLE")
@SequenceGenerator(sequenceName = "SEQ_TEST_TABLE",name = "SequenceGenerator",allocationSize=1 ,initialValue=1)
public interface ParentEntity extends BaseEntity {

	@Column(name ="C1")
	String getC1();
	
	@OneToMany(mappedBy = "entityList")
	List<TestEntity> getEntityList();
}
