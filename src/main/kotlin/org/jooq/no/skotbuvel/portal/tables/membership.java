/*
 * This file is generated by jOOQ.
*/
package org.jooq.no.skotbuvel.portal.tables;


import java.sql.Date;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.no.skotbuvel.portal.DefaultSchema;
import org.jooq.no.skotbuvel.portal.Indexes;
import org.jooq.no.skotbuvel.portal.Keys;


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
public class membership extends TableImpl<org.jooq.no.skotbuvel.portal.tables.records.membership> {

    private static final long serialVersionUID = 84040048;

    /**
     * The reference instance of <code>membership</code>
     */
    public static final membership membership = new membership();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<org.jooq.no.skotbuvel.portal.tables.records.membership> getRecordType() {
        return org.jooq.no.skotbuvel.portal.tables.records.membership.class;
    }

    /**
     * The column <code>membership.id</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>membership.type</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, String> type = createField("type", org.jooq.impl.SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>membership.year</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, Date> year = createField("year", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>membership.price</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, Integer> price = createField("price", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>membership.created_by</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, String> created_by = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>membership.created_date</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, OffsetDateTime> created_date = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>membership.updated_by</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, String> updated_by = createField("updated_by", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>membership.updated_date</code>.
     */
    public final TableField<org.jooq.no.skotbuvel.portal.tables.records.membership, OffsetDateTime> updated_date = createField("updated_date", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>membership</code> table reference
     */
    public membership() {
        this(DSL.name("membership"), null);
    }

    /**
     * Create an aliased <code>membership</code> table reference
     */
    public membership(String alias) {
        this(DSL.name(alias), membership);
    }

    /**
     * Create an aliased <code>membership</code> table reference
     */
    public membership(Name alias) {
        this(alias, membership);
    }

    private membership(Name alias, Table<org.jooq.no.skotbuvel.portal.tables.records.membership> aliased) {
        this(alias, aliased, null);
    }

    private membership(Name alias, Table<org.jooq.no.skotbuvel.portal.tables.records.membership> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.membership_pkey);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<org.jooq.no.skotbuvel.portal.tables.records.membership> getPrimaryKey() {
        return Keys.membership_pkey;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<org.jooq.no.skotbuvel.portal.tables.records.membership>> getKeys() {
        return Arrays.<UniqueKey<org.jooq.no.skotbuvel.portal.tables.records.membership>>asList(Keys.membership_pkey);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public membership as(String alias) {
        return new membership(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public membership as(Name alias) {
        return new membership(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public membership rename(String name) {
        return new membership(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public membership rename(Name name) {
        return new membership(name, null);
    }
}
