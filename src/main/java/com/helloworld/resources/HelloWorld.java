package com.helloworld.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

@Path("hello-world")
public class HelloWorld {

    @GET
    public String getHelloWorld(@QueryParam("name") String name) {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add("Hello");
        if (name != null && !name.isEmpty()) {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d");

            joiner.add(name + ",");
            joiner.add("what a lovely");
            joiner.add(formatter.format(date));
            joiner.add("it is!");
        } else {
            joiner.add("World!");
        }

        return joiner.toString();
    }
}
