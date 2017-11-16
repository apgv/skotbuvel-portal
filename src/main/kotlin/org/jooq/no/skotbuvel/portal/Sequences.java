/*
 * This file is generated by jOOQ.
*/
package org.jooq.no.skotbuvel.portal;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>member_id_seq</code>
     */
    public static final Sequence<Long> MEMBER_ID_SEQ = new SequenceImpl<Long>("member_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>membership_id_seq</code>
     */
    public static final Sequence<Long> MEMBERSHIP_ID_SEQ = new SequenceImpl<Long>("membership_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>person_id_seq</code>
     */
    public static final Sequence<Long> PERSON_ID_SEQ = new SequenceImpl<Long>("person_id_seq", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
