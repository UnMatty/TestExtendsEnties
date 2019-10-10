package ru.matprojects.testextendsenties.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;


@Table(name = "testextendsenties_BaseTestEntity")
@Entity(name = "testextendsenties_BaseTestEntity")
public class BaseTestEntity extends StandardEntity {
    private static final long serialVersionUID = 170926717614909032L;

    @Column(name = "PAR1")
    protected String par1;

    @Column(name = "PAR2")
    protected String par2;

    public String getPar1() {
        return par1;
    }

    public void setPar1(String par1) {
        this.par1 = par1;
    }

    public String getPar2() {
        return par2;
    }

    public void setPar2(String par2) {
        this.par2 = par2;
    }
}