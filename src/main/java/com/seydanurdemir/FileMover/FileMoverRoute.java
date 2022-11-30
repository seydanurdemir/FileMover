package com.seydanurdemir.FileMover;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoverRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:/Users/sdemir/IdeaProjects/CamelTutorial/FileMover/src/main/resources/tmp/files")
                .log("${headers}")
                .log("${body}")
                .to("file:C:/Users/sdemir/IdeaProjects/CamelTutorial/FileMover/src/main/resources/tmp/files/processed")
        ;
    }
}
