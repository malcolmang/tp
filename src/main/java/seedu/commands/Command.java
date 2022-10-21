package seedu.commands;

import seedu.data.CarparkList;
import seedu.exception.InvalidCommandException;
import seedu.exception.NoCarparkFoundException;

/**
 * Represents an executable command
 */
public class Command {
    protected CarparkList carparkList;

    protected Command() {
    }

    public CommandResult execute() throws InvalidCommandException, NoCarparkFoundException {
        throw new InvalidCommandException();
    }
}
