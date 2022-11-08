package generic;

class Message<T> {
    private T message;

    public void setMessage(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }
}
public class Integer_String_Single_Generic_Class {
    public static void main(String[] args) {

        // Generic Class 1: T = Integer
        Message<Integer> message = new Message<>();
        message.setMessage(500);
        System.out.println("generic.Message Integer 1: "+ message.getMessage());

        // Generic Class 2: T = String
        Message<String> message1 = new Message<>();
        message1.setMessage("GenericCode");
        System.out.println("generic.Message String 2: "+ message1.getMessage());
    }
}

/*output-: generic.Message Integer 1: 500
        generic.Message String 2: GenericCode

 */