package model;

import org.hibernate.cfg.beanvalidation.ActivationContext;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Roma on 16.09.2016.
 */
public class BossTest {

    @Test
    public void testBean() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Boss beanBoss = context.getBean(Boss.class);
        Worker beanWorker1 = (Worker) context.getBean("worker1");
        Worker beanWorker2 = (Worker) context.getBean("worker2");

        assertEquals(beanBoss.getName(), "Alsi");
        assertTrue(beanBoss.getWorkerList().contains(beanWorker1));
        assertTrue(beanBoss.getWorkerList().contains(beanWorker2));

        assertEquals(beanWorker1.getBoss(), beanBoss);
        assertEquals(beanWorker2.getBoss(), beanBoss);
    }

}