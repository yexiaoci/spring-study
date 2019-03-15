package com.spring.exercises;

import com.spring.aop.MyBeforeAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDAOImpl implements UserDAO {
    private static final Logger logger= LoggerFactory.getLogger(UserDAOImpl.class);
    @Override
    public void insert() {
        logger.info("开始进行插入操作");





    }
}
