package seedu.avo.commands;

import seedu.avo.tasks.TaskManager;
/**
 * Represents the command to list tasks
 */
public class ListCommand extends Command {
    private final TaskManager manager;
    public ListCommand(TaskManager manager) {
        this.manager = manager;
    }
    @Override
    public void execute(String userInput) {
        manager.listTasks();
    }
}
