package Commands;

import Exceptions.AvoException;

public class ExitCommand extends Command {
    @Override
    public boolean isExit() { return true; }
    @Override
    public void execute(String userInput) throws AvoException {

    }
}
