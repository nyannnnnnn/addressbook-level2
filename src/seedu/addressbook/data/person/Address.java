package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address implements Printable extends Contact{

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public Block block;
    public Street street;
    public Unit unit;
    public PostalCode postalCode;
    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        super(address, isPrivate, ADDRESS_VALIDATION_REGEX, MESSAGE_ADDRESS_CONSTRAINTS);
        String[] addressList = address.split(",");
        block = new Block(addressList[0]);
        street = new Street(addressList[1]);
        unit = new Unit(addressList[2]);
        postalCode = new PostalCode(addressList[3]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }
    @Override
    public String getPrintableString()
    {
    	return value;
    }

    @Override
    public String toString() {
        String totalAddress = block.toString() + ", " + street.toString() + ", " + unit.toString() + ", " + postalCode.toString();
        return totalAddress;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }
}
