/*
 * This file is generated by jOOQ.
*/
package alex.jooq;


import alex.jooq.tables.Customer;
import alex.jooq.tables.Person;
import alex.jooq.tables.School;
import javax.annotation.Generated;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling indexes of tables of the <code>test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CUSTOMER_PRIMARY = Indexes0.CUSTOMER_PRIMARY;
    public static final Index PERSON_PRIMARY = Indexes0.PERSON_PRIMARY;
    public static final Index SCHOOL_PRIMARY = Indexes0.SCHOOL_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index CUSTOMER_PRIMARY = createIndex("PRIMARY", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.ID }, true);
        public static Index PERSON_PRIMARY = createIndex("PRIMARY", Person.PERSON, new OrderField[] { Person.PERSON.ID }, true);
        public static Index SCHOOL_PRIMARY = createIndex("PRIMARY", School.SCHOOL, new OrderField[] { School.SCHOOL.ID }, true);
    }
}