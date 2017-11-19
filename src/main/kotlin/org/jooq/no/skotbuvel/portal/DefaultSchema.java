/*
 * This file is generated by jOOQ.
*/
package org.jooq.no.skotbuvel.portal;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.no.skotbuvel.portal.tables.Membership;
import org.jooq.no.skotbuvel.portal.tables.MembershipType;
import org.jooq.no.skotbuvel.portal.tables.Person;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = -88823014;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>membership</code>.
     */
    public final Membership MEMBERSHIP = org.jooq.no.skotbuvel.portal.tables.Membership.MEMBERSHIP;

    /**
     * The table <code>membership_type</code>.
     */
    public final MembershipType MEMBERSHIP_TYPE = org.jooq.no.skotbuvel.portal.tables.MembershipType.MEMBERSHIP_TYPE;

    /**
     * The table <code>person</code>.
     */
    public final Person PERSON = org.jooq.no.skotbuvel.portal.tables.Person.PERSON;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.MEMBERSHIP_ID_SEQ,
            Sequences.MEMBERSHIP_TYPE_ID_SEQ,
            Sequences.PERSON_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Membership.MEMBERSHIP,
            MembershipType.MEMBERSHIP_TYPE,
            Person.PERSON);
    }
}
