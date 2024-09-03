package seedu.avo.commands;

import seedu.avo.exceptions.AvoException;
import seedu.avo.tasks.TaskManager;
/**
 * Represents the command to delete a task
 */
public class DeleteCommand extends Command {
    private final TaskManager manager;
    public DeleteCommand(TaskManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute(String userInput) throws AvoException {
        String[] inputs = userInput.split(" ");
        if (inputs.length < 2) {
            throw new AvoException("OOPS!!! The task number cannot be empty.");
        }
        manager.deleteTask(Integer.parseInt(inputs[1]) - 1);
    }
}
