package ru.matprojects.testextendsenties.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Extends;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "testextendsenties_ExtendOne")
@Extends(BaseTestEntity.class)
public class ExtendOne extends BaseTestEntity {
    private static final long serialVersionUID = -6957988278597509286L;

    @Column(name = "PAR3")
    private String par3;

    public String getPar3() {
        return par3;
    }

    public void setPar3(String par3) {
        this.par3 = par3;
    }
}