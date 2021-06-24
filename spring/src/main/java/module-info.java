module com.gluonhq.ignite.spring {
    requires transitive com.gluonhq.ignite.common;

    requires spring.context;
    requires spring.beans;

    exports com.gluonhq.ignite.spring;

    opens com.gluonhq.ignite.spring to spring.core;
}