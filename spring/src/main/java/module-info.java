module com.gluonhq.ignite.spring {
    requires transitive com.gluonhq.ignite.common;

    exports com.gluonhq.ignite.spring;

    opens com.gluonhq.ignite.spring to spring.core;
}