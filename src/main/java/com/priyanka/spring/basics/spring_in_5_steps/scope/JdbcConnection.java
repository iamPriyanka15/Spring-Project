package com.priyanka.spring.basics.spring_in_5_steps.scope;

//import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

    public JdbcConnection(){
        System.out.println("Jdbc Connection");
    }
}
