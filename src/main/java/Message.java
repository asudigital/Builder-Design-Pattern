public class Message {

    private final MessageType messageType;
    private final String content;
    private final String sender;
    private final String recipient;
    private final boolean isDelivered;
    private final long timestamp;

    private Message(MessageBuilder messageBuilder) {
        this.messageType = messageBuilder.messageType;
        this.content = messageBuilder.content;
        this.sender =  messageBuilder.sender;
        this.recipient = messageBuilder.recipient;;
        this.isDelivered = messageBuilder.isDelivered;;
        this.timestamp =  messageBuilder.timestamp;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public long getTimestamp() {
        return timestamp;
    }

    // Static Builder class
    public static class MessageBuilder {

        private final MessageType messageType;
        private final String content;
        private final String sender;
        private final String recipient;
        private  boolean isDelivered;
        private  long timestamp;

        public MessageBuilder(MessageType messageType, String content, String sender, String recipient){
            this.messageType = messageType;
            this.content = content;
            this.sender = sender;
            this.recipient = recipient;
        }

        public MessageBuilder isDelivered(boolean isDelivered) {
            this.isDelivered = isDelivered;
            return this;
        }

        public MessageBuilder timestamp(long timestamp)
        {
            this.timestamp = timestamp;
            return this;
        }

        public Message build() {
            return new Message(this);
        }
        
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", isDelivered=" + isDelivered +
                ", timestamp=" + timestamp +
                '}';
    }
}