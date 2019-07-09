package com.zjh;

import com.zjh.dao.CustomerDao;
import com.zjh.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 查询一个
     */
    @Test
    public void testFindOne() {
        Customer customer = customerDao.findOne(1l);
        System.out.println("customer = " + customer);
    }

    /**
     * save : 保存或者更新
     * 根据传递的对象是否存在主键id，
     * 如果没有id主键属性：保存
     * 存在id主键属性，根据id查询数据，更新数据
     */
    @Test
    public void testSave() {
        Customer customer = new Customer();
        customer.setCustName("黑马程序员");
        customer.setCustLevel("vip");
        customer.setCustIndustry("it教育");
        customerDao.save(customer);

    }

    /**
     * 带有id 更新数据
     */
    @Test
    public void testUpdate() {
        Customer customer = new Customer();
        customer.setCustId(3l);
        customer.setCustLevel("svip");
        customerDao.save(customer);
    }

    /**
     * 根据id删除
     */
    @Test
    public void testDelete() {
        customerDao.delete(2l);
    }

    @Test
    public void testFindAll() {
        List<Customer> customerList = customerDao.findAll();
        for (Customer customer : customerList) {
            System.out.println("customer = " + customer);
        }
    }


    /**
     * 测试统计查询：查询客户的总数量
     *      count:统计总条数
     */
    @Test
    public void testCount() {
        long count = customerDao.count();//查询全部的客户数量
        System.out.println(count);
    }

    /**
     * 测试：判断id为4的客户是否存在
     *      1. 可以查询以下id为4的客户
     *          如果值为空，代表不存在，如果不为空，代表存在
     *      2. 判断数据库中id为4的客户的数量
     *          如果数量为0，代表不存在，如果大于0，代表存在
     */
    @Test
    public void  testExists() {
        boolean exists = customerDao.exists(4l);
        System.out.println("id为4的客户 是否存在："+exists);
    }


    /**
     * 根据id从数据库查询
     *      @Transactional : 保证getOne正常运行
     *
     *  findOne：
     *      em.find()           :立即加载
     *  getOne：
     *      em.getReference     :延迟加载
     *      * 返回的是一个客户的动态代理对象
     *      * 什么时候用，什么时候查询
     */
    @Test
    @Transactional
    public void  testGetOne() {
        Customer customer = customerDao.getOne(4l);
        System.out.println(customer);
    }
}
