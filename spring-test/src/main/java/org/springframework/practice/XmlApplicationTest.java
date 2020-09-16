package org.springframework.practice;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlApplicationTest {
    public static void main(String[] args) {
        ClassPathResource resource=new ClassPathResource("application-context.xml");

        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();

        //创建reader读取器，用于载入BeanDefinition
        //之所以需要factory作为参数，是因为会将读取的信息回调配置给factory
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);

        //reader执行载入BeanDefinition的方法，最后会完成Bean的注册和载入
        //完成会Bean实例就会成功的放入ioc容易中，后面可拱我们get使用
        reader.loadBeanDefinitions(resource);
    }



}
