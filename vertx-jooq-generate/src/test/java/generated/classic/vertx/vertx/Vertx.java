/*
 * This file is generated by jOOQ.
*/
package generated.classic.vertx.vertx;


import generated.classic.vertx.DefaultCatalog;
import generated.classic.vertx.vertx.tables.Something;
import generated.classic.vertx.vertx.tables.Somethingcomposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Vertx extends SchemaImpl {

    private static final long serialVersionUID = 1443980659;

    /**
     * The reference instance of <code>VERTX</code>
     */
    public static final Vertx VERTX = new Vertx();

    /**
     * The table <code>VERTX.SOMETHING</code>.
     */
    public final Something SOMETHING = generated.classic.vertx.vertx.tables.Something.SOMETHING;

    /**
     * The table <code>VERTX.SOMETHINGCOMPOSITE</code>.
     */
    public final Somethingcomposite SOMETHINGCOMPOSITE = generated.classic.vertx.vertx.tables.Somethingcomposite.SOMETHINGCOMPOSITE;

    /**
     * No further instances allowed
     */
    private Vertx() {
        super("VERTX", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Something.SOMETHING,
            Somethingcomposite.SOMETHINGCOMPOSITE);
    }
}