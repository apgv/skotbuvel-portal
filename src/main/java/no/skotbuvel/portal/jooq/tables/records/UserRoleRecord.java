/*
 * This file is generated by jOOQ.
*/
package no.skotbuvel.portal.jooq.tables.records;


import javax.annotation.Generated;

import no.skotbuvel.portal.jooq.tables.UserRole;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserRoleRecord extends UpdatableRecordImpl<UserRoleRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1134743581;

    /**
     * Setter for <code>user_role.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_role.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>user_role.role_id</code>.
     */
    public void setRoleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_role.role_id</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserRole.USER_ROLE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserRole.USER_ROLE.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord value2(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRoleRecord
     */
    public UserRoleRecord() {
        super(UserRole.USER_ROLE);
    }

    /**
     * Create a detached, initialised UserRoleRecord
     */
    public UserRoleRecord(Integer userId, Integer roleId) {
        super(UserRole.USER_ROLE);

        set(0, userId);
        set(1, roleId);
    }
}