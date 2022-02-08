public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        int i = message.indexOf((":"));
        machineId = message.substring(0,i);
        description = message.substring(i);
    }

    public boolean containsWord(String keyword) {
        for (int i = 0; i < description.length();i++)
        {
            if(description.indexOf(keyword) != -1)
            {
                return true;
            }

        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
