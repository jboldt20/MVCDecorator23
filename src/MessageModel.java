public class MessageModel {
    private Message m;
    private Message dm;
    private boolean angry;
    private boolean sms;
    private boolean binary;
    private boolean encrypted;

    public static final int ANGRY = 1;
    public static final int BINARY = 2;
    public static final int SMS = 3;
    public static final int ENCRYPTED = 4;

    public MessageModel() {
        m = new Message("Hello");
        angry = false;
        sms = false;
        binary = false;
        encrypted = false;
    }

    public String getMessage() {
        Message dm = new Message(m.getTheMsg());
        decorate();
        return dm.getTheMsg();
    }

    public void setMessage(String s) {
        m = new Message(s);
        //decorate();
    }
    private void decorate() {

        if (angry){
            dm = new AngryMessageDecorator(dm);
        }
        if (sms){
            dm = new SMSDecorator(dm);
        }
        if (binary){
            dm = new BinaryMessage(dm);
        }
        if (encrypted){
            dm = new EncryptedMessage(dm, 5);
        }
    }
    public void toggle(int state){
        switch (state) {
            case ANGRY:
                angry = !angry;
                break;
            case SMS:
                sms = !sms;
                break;
            case BINARY:
                binary = !binary;
                break;
            case ENCRYPTED:
                encrypted = !encrypted;
                break;
        }
    }
}
