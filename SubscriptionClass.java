
public class SubscriptionClass {
	String userName;
	int userId;
	int subscriptionId;
     private static int autoGeneratedId = 1;
     public SubscriptionClass(String userName,int userId)
     {
    	 this.userName = userName;
    	 this.userId = userId;
    	 this.subscriptionId = autoGeneratedId++;
     }
     public int getTotalSubscriptionId()
     {
    	 return autoGeneratedId;
    	 
     }
}
