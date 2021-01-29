import org.jboss.shrinkwrap.impl.base.nio2.file.ShrinkWrapFileSystemProvider;

import java.nio.file.spi.FileSystemProvider;

module org.jboss.shrinkwrap.impl.base {
    exports org.jboss.shrinkwrap.impl.base;
    exports org.jboss.shrinkwrap.impl.base.asset;
    exports org.jboss.shrinkwrap.impl.base.container;
    exports org.jboss.shrinkwrap.impl.base.exporter;
    exports org.jboss.shrinkwrap.impl.base.exporter.tar;
    exports org.jboss.shrinkwrap.impl.base.exporter.zip;
    exports org.jboss.shrinkwrap.impl.base.filter;
    exports org.jboss.shrinkwrap.impl.base.importer;
    exports org.jboss.shrinkwrap.impl.base.importer.tar;
    exports org.jboss.shrinkwrap.impl.base.importer.zip;
    exports org.jboss.shrinkwrap.impl.base.io;
    exports org.jboss.shrinkwrap.impl.base.nio2.file;
    exports org.jboss.shrinkwrap.impl.base.path;
    exports org.jboss.shrinkwrap.impl.base.serialization;
    exports org.jboss.shrinkwrap.impl.base.spec;

    provides FileSystemProvider with ShrinkWrapFileSystemProvider;

    requires jakarta.activation;
    requires org.jboss.shrinkwrap.api;
    requires org.jboss.shrinkwrap.spi;
}
