import java.util.ArrayList;

public class SystemLog {
    private ArrayList<LogMessage> messageList;

    public ArrayList<LogMessage> removeMessages(String keyword)
    {
         ArrayList<LogMessage> removed = new ArrayList<>();
        for(int i  = 0; i< messageList.size(); i++)
        {
            if(messageList.get(i).containsWord(keyword))
            {
                removed.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
        return removed;
    }


}
