package ru.matprojects.testextendsenties.core;

import ru.matprojects.testextendsenties.TestextendsentiesTestContainer;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import ru.matprojects.testextendsenties.entity.BaseTestEntity;
import ru.matprojects.testextendsenties.entity.EntityWithPar;
import ru.matprojects.testextendsenties.entity.ExtendOne;
import ru.matprojects.testextendsenties.entity.ExtendTwo;

import static org.junit.Assert.assertEquals;

public class SampleIntegrationTest {

    @ClassRule
    public static TestextendsentiesTestContainer cont = TestextendsentiesTestContainer.Common.INSTANCE;

    private Metadata metadata;
    private Persistence persistence;
    private DataManager dataManager;

    @Before
    public void setUp() throws Exception {
        metadata = cont.metadata();
        persistence = cont.persistence();
        dataManager = AppBeans.get(DataManager.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createExtendOne(){
        ExtendOne extendOne;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            extendOne = metadata.create(ExtendOne.class);
            extendOne.setPar1("test1");
            extendOne.setPar2("test2");
            extendOne.setPar3("test3");

            em.persist(extendOne);

            tx.commit();
        }

        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            em.remove(extendOne);
            tx.commit();
        }
    }

    @Test
    public void createExtendTwo(){
        ExtendTwo extendTwo;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            extendTwo = metadata.create(ExtendTwo.class);
            extendTwo.setPar1("test1");
            extendTwo.setPar2("test2");
            extendTwo.setPar4("test4");

            em.persist(extendTwo);

            tx.commit();
        }

        try (Transaction tx = persistence.createTransaction()) {
            EntityManager em = persistence.getEntityManager();
            em.remove(extendTwo);
            tx.commit();
        }
    }
}