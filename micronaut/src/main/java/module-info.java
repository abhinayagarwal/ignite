module com.gluonhq.ignite.micronaut {
    requires com.gluonhq.ignite.common;
    requires io.micronaut.core;
    requires io.micronaut.inject;
    requires io.micronaut.validation;
    requires io.micronaut.runtime;
    requires io.micronaut.http;
    requires io.micronaut.aop;
    requires io.micronaut.runtime;

    exports com.gluonhq.ignite.micronaut;
    exports com.gluonhq.ignite.micronaut.view;
}