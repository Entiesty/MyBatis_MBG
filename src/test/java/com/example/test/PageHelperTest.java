package com.example.test;

import com.example.mapper.EmployeeMapper;
import com.example.model.Employee;
import com.example.model.EmployeeExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageHelperTest {
    @Test
    public void testPageHelper() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

            PageHelper.startPage(3,2);
            List<Employee> employees = employeeMapper.selectByExample(null);
            PageInfo<Employee> employeePageInfo = new PageInfo<>(employees,3);
            System.out.println(employeePageInfo);

//            employees.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
