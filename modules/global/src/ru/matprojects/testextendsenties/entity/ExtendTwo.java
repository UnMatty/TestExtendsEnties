package ru.matprojects.testextendsenties.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Extends;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "testextendsenties_ExtendTwo")
@Extends(BaseTestEntity.class)
public class ExtendTwo extends BaseTestEntity {
    private static final long serialVersionUID = -3074975818508195143L;

    @Column(name = "par4")
    protected String par4;

    public String getPar4() {
        return par4;
    }

    public void setPar4(String par4) {
        this.par4 = par4;
    }
}