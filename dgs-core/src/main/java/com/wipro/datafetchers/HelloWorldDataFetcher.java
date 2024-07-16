package com.wipro.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class HelloWorldDataFetcher {

    @DgsQuery(field = "hello")
    public String sayHello() {
        return "Hello";
    }

    @DgsQuery(field = "hai")
    public String sayHai() {
        return null;
    }

    @DgsQuery(field = "name")
    public String getName(@InputArgument String input) {
        return input.toUpperCase();
    }
}
