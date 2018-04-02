package demo.service;

import demo.Bean.RoleAcountEntity;
import demo.dao.MybatisInterface;
import demo.dao.mybatis.RoleAccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liqianga on 2018/4/2.
 */
@Service
public class TestInterfaceImpl implements TestInterface {

    private final Logger log = LoggerFactory.getLogger(TestInterfaceImpl.class);

    @Autowired
    MybatisInterface mybatisInterface;

    @Autowired
    RoleAccountDao roleAccountDao;

    @Override
    public int getID() {
        log.info("testID");
        log.error("quanzi");
        return mybatisInterface.getCount();
    }

    @Override
    public List<RoleAcountEntity> getAll() {
        return roleAccountDao.selectAll();
    }
}
