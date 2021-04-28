package com.salesmanager.shop.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class PrintEnviroments {


    @Value("${elasticsearch.server.host}")
    private List<String> hosts;

    @Value("${elasticsearch.server.protocole}")
    private String protocol;

    @Value("${elasticsearch.server.port}")
    private int port;

    @Value("${elasticsearch.security.enabled}")
    private Boolean securityEnabled;

//    @Value("${elasticsearch.security.user}")
//    private String user;
//
//    @Value("${elasticsearch.security.password}")
//    private String password;

    @Value("${db.driverClass}")
    private String driverClassName;

    @Value("${db.jdbcUrl}")
    private String urlDB;

    @Value("${db.user}")
    private String userDB;

    @Value("${db.password}")
    private String passwordDB;

    @PostConstruct
    public void printEnviroments(){
        System.out.println("ElasticSearch Hosts:"+ hosts+", port: "+port);
        System.out.println(urlDB);
        System.out.println(userDB);
        System.out.println(passwordDB);
    }




}
