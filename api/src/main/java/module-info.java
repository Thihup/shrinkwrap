module org.jboss.shrinkwrap.api {
    exports org.jboss.shrinkwrap.api;
    exports org.jboss.shrinkwrap.api.asset;
    exports org.jboss.shrinkwrap.api.classloader;
    exports org.jboss.shrinkwrap.api.container;
    exports org.jboss.shrinkwrap.api.exporter;
    exports org.jboss.shrinkwrap.api.formatter;
    exports org.jboss.shrinkwrap.api.importer;
    exports org.jboss.shrinkwrap.api.nio2.file;
    exports org.jboss.shrinkwrap.api.serialization;
    exports org.jboss.shrinkwrap.api.spec;

    requires transitive java.logging;
}
