package io.khasang.cs.service;

import io.khasang.cs.config.AppContext;
import io.khasang.cs.config.AppSecurityConfig;
import io.khasang.cs.config.HibernateConfig;
import io.khasang.cs.config.WebConfig;
import io.khasang.cs.dao.impl.FindingCatDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Shafs on 21.08.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, WebConfig.class, AppSecurityConfig.class, HibernateConfig.class})
public class FindingCatDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    FindingCatDao findingCatDao;

    @Test
    public void getUserIdWhoFind() {
        Assert.assertNotNull(findingCatDao);
        Assert.assertEquals(1, findingCatDao.getByName("barsik").getUserId());
    }
}
