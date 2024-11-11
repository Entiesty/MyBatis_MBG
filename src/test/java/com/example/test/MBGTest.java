package com.example.test;

import com.example.mapper.EmployeeMapper;
import com.example.model.Employee;
import com.example.model.EmployeeExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MBGTest {
    @Test
    public void testMBG() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

//            EmployeeExample employeeExample = new EmployeeExample();
//            employeeExample.createCriteria().andAgeBetween(24,30);
//            List<Employee> employees = employeeMapper.selectByExample(employeeExample);
//            employees.forEach(System.out::println);

//            EmployeeExample employeeExample = new EmployeeExample();
//            employeeExample.createCriteria().andNameEqualTo("张三");
//            List<Employee> employees = employeeMapper.selectByExample(employeeExample);
//            employees.forEach(System.out::println);

//            EmployeeExample employeeExample = new EmployeeExample();
//            employeeExample.createCriteria().andNameEqualTo("张三");
//            List<Employee> employees = employeeMapper.selectByExample(employeeExample);
//            employees.forEach(System.out::println);

            EmployeeExample employeeExample = new EmployeeExample();
            employeeExample.createCriteria().andNameEqualTo("a");
            int result = employeeMapper.deleteByExample(employeeExample);
            System.out.println(result);

//            List<Employee> employees = employeeMapper.selectByExample(null);
//            employees.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
