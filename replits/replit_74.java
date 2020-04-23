package replits;

/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line
 */
public class replit_74 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring(0, message.indexOf(">")).replace('<', ' ');
        phoneNumber = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{") + 1, message.indexOf("}"));

        System.out.println(sender + "\nPhone Number: " + phoneNumber + "\nMessage body: " + messageBody);

    }}
