package cn.edu.dao;

import cn.edu.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

@Repository
public class CustomerDaoImpl implements CustomerDao
{
    @Override
    public int addCustomer(Customer customer)
    {
        int insertCustomer = 0;

        try
        {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();

            insertCustomer = sqlSession.insert("insertCustomer", customer);

            sqlSession.commit();
            sqlSession.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("addCustomer:-----------" + customer);
        return insertCustomer;
    }
}
