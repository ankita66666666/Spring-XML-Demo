package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String args[]) {


//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movieFirst = (Movie) xmlBeanFactory.getBean("movie4");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo=(BeanLifeCycleDemo) applicationContext.getBean("Lifecycle");


//        System.out.println(movieFirst.getActor());

        // BeanDefinitionRegistry beanDefinitionRegistry= new BeanDefinitionReader("BeanFile.xml");

    }
}
