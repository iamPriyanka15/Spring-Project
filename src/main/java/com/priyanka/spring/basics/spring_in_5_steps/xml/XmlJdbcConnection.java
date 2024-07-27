package com.priyanka.spring.basics.spring_in_5_steps.xml;

//import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


public class XmlJdbcConnection {

    public XmlJdbcConnection(){

        System.out.println("Jdbc Connection");
    }
}
