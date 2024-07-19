package com.example;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.security.access.annotation.Secured;

@DgsComponent
public class HelloDataFetcher {

    @Secured("ROLE_ADMIN")
    @DgsQuery(field = "hello")
    public String hello(){
        return  "Hello";
    }
}
