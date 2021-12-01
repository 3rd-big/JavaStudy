package designPattern.command;

public class Button {

    private Command theCommand;

    // 생성자에서 버튼을 눌렀을 때, 필요한 기능을 인자로 받음
    public Button(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command newCommand) {
        this.theCommand = newCommand;
    }

    public void pressend() {
        theCommand.execute();
    }

}
