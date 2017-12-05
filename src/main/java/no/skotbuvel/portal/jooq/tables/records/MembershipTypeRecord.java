/*
 * This file is generated by jOOQ.
*/
package no.skotbuvel.portal.jooq.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import no.skotbuvel.portal.jooq.tables.MembershipType;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class MembershipTypeRecord extends UpdatableRecordImpl<MembershipTypeRecord> implements Record10<Integer, Boolean, String, Integer, Integer, String, OffsetDateTime, String, OffsetDateTime, Integer> {

    private static final long serialVersionUID = -2033610735;

    /**
     * Setter for <code>membership_type.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>membership_type.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>membership_type.active</code>.
     */
    public void setActive(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>membership_type.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>membership_type.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>membership_type.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>membership_type.year</code>.
     */
    public void setYear(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>membership_type.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>membership_type.price</code>.
     */
    public void setPrice(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>membership_type.price</code>.
     */
    public Integer getPrice() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>membership_type.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>membership_type.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>membership_type.created_date</code>.
     */
    public void setCreatedDate(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>membership_type.created_date</code>.
     */
    public OffsetDateTime getCreatedDate() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for <code>membership_type.deleted_by</code>.
     */
    public void setDeletedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>membership_type.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>membership_type.deleted_date</code>.
     */
    public void setDeletedDate(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>membership_type.deleted_date</code>.
     */
    public OffsetDateTime getDeletedDate() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>membership_type.original_id</code>.
     */
    public void setOriginalId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>membership_type.original_id</code>.
     */
    public Integer getOriginalId() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Boolean, String, Integer, Integer, String, OffsetDateTime, String, OffsetDateTime, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Boolean, String, Integer, Integer, String, OffsetDateTime, String, OffsetDateTime, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MembershipType.MEMBERSHIP_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return MembershipType.MEMBERSHIP_TYPE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MembershipType.MEMBERSHIP_TYPE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MembershipType.MEMBERSHIP_TYPE.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MembershipType.MEMBERSHIP_TYPE.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MembershipType.MEMBERSHIP_TYPE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field7() {
        return MembershipType.MEMBERSHIP_TYPE.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MembershipType.MEMBERSHIP_TYPE.DELETED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field9() {
        return MembershipType.MEMBERSHIP_TYPE.DELETED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return MembershipType.MEMBERSHIP_TYPE.ORIGINAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component7() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDeletedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component9() {
        return getDeletedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getOriginalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value7() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDeletedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value9() {
        return getDeletedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getOriginalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value2(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value4(Integer value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value5(Integer value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value7(OffsetDateTime value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value9(OffsetDateTime value) {
        setDeletedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord value10(Integer value) {
        setOriginalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MembershipTypeRecord values(Integer value1, Boolean value2, String value3, Integer value4, Integer value5, String value6, OffsetDateTime value7, String value8, OffsetDateTime value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MembershipTypeRecord
     */
    public MembershipTypeRecord() {
        super(MembershipType.MEMBERSHIP_TYPE);
    }

    /**
     * Create a detached, initialised MembershipTypeRecord
     */
    public MembershipTypeRecord(Integer id, Boolean active, String type, Integer year, Integer price, String createdBy, OffsetDateTime createdDate, String deletedBy, OffsetDateTime deletedDate, Integer originalId) {
        super(MembershipType.MEMBERSHIP_TYPE);

        set(0, id);
        set(1, active);
        set(2, type);
        set(3, year);
        set(4, price);
        set(5, createdBy);
        set(6, createdDate);
        set(7, deletedBy);
        set(8, deletedDate);
        set(9, originalId);
    }
}
