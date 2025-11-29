package org.example.test;


/**
 *
 * @author lijiafu
 * @since 2025/11/29
 */

import java.util.List;

import javax.annotation.Resource;

import org.example.infrastructure.persistent.dao.IAwardDao;
import org.example.infrastructure.persistent.po.Award;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;

/**
 * 奖品持久化单元测试
 *
 * @author lijiafu
 * @since 2025/11/29
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(awards));
    }

}
