package ru.matprojects.testextendsenties.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.EmbeddableEntity;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TESTEXTENDSENTIES_ENTITY_WITH_PAR")
@Entity(name = "testextendsenties_EntityWithPar")
public class EntityWithPar extends StandardEntity {
    private static final long serialVersionUID = 6363611093123541899L;

    @ManyToOne
    @JoinColumn(name = "BASE_COLUMN_REF")
    protected BaseTestEntity extendWars;

    public BaseTestEntity getExtendWars() {
        return extendWars;
    }

    public void setExtendWars(BaseTestEntity extendWars) {
        this.extendWars = extendWars;
    }
}