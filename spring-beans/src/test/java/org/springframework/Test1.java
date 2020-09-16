package org.springframework;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test1 {
    public static void main(String[] args) {
        //根据xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
        ClassPathResource resource=new ClassPathResource("application-context.xml");
        //创建DefaultListableBeanFactory
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        //创建BeanDefinitionReader读取器，用于载入BeanDefiniton
        //之所以需要BeanFactory作为参数，是因为需要将读取的信息回调配置给factory
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        //XmlBeanDefinitionReader 执行载入BeanDefinition的方法，最后完成Bean的载入和注册
        //完成后Bean就成功的放置到IOC容器中，以后我们就可以从中取得Bean来使用
        reader.loadBeanDefinitions(resource);
    }

}
