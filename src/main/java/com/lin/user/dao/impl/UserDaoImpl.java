package com.lin.user.dao.impl;



import com.lin.user.dao.UserDao;
import com.lin.user.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImpl implements UserDao {

    @Override
    public void savaUser(User user){
        Session s = null;
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
        //获取Session
        s =sf.openSession();
        //开启事务
        s.beginTransaction();
        //把对象保存到数据库
        s.save(user);
        //提交事务
        s.getTransaction().commit();
        s.close();
        sf.close();
    }

}
