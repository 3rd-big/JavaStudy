package designPattern.command;

public class Button {

    private Command theCommand;

    // �����ڿ��� ��ư�� ������ ��, �ʿ��� ����� ���ڷ� ����
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
