module com.gluonhq.ignite.micronaut {

    requires com.gluonhq.ignite.common;

    requires io.micronaut.core;
    requires io.micronaut.inject;
    requires io.micronaut.validation;
    requires io.micronaut.aop;

    requires javax.inject;
    requires javafx.graphics;
    requires slf4j.api;
    requires java.validation;
    requires java.annotation;

    exports com.gluonhq.ignite.micronaut;
    exports com.gluonhq.ignite.micronaut.view;

}