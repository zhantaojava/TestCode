import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Amazon {
  
	

/*
 * import java.util.*;
 * import java.io.*;
 *
 * public List<String> getDirectFriendsForUser(String user)
 *
 * public List<String> getAttendedCoursesForUser(String user)
 *
 * Please complete the method below
 */
public List<String> getRankedCourses(String user) {
    
    List<String> FriendList = new LinkedList<String>();
       FriendList= getDirectFriendsForUser(user);
    
    //get all direct and indirect friends from user.
       List<String> AllFriendsList=new LinkedList<String>();
    for(int i=0;i<FriendList.size();i++){
        AllFriendsList=FriendList.get(i).getDirectFriendsForUser(FriendList.get(i));
        
    }
    
    //get all course that everyone attends
    List<String> AllCourseList=new LinkedList<String>();
    
    for(int i=0;i<FriendList.size();i++){
      
        AllCourseList=AllFriendsList.get(i).getAttendedCoursesForUser(AllFriendsList.get(i));        
    }
    
    Map<String,Integer> AllCourseMap =new HashMap<String,Integer>();
    
    for(int i=0;i<AllFriendsList.size();i++){
        
        if(AllCourseMap.containsKey(AllCourseList.get(i))){
            AllCourseMap.put(AllCourseList.get(i),AllCourseMap.get(AllCouserList.get(i))+1);
        }
        else{
            AllCourseMap.put(AllCourseList.get(i),1);
        }
    }
    
    List<Map.Entry<String,Integer>> PopularityList=new ArrayList(AllCourseMap.entrySet());
    
    Collections.sort(PopularityList, new Comparator<Map.Entry<String, Integer>>() {  
            public int compare(Map.Entry<String, Integer> o1,  
                    Map.Entry<String, Integer> o2) {  
                return (o1.getValue()).toString().compareTo(o2.getValue().toString());  
            }  
        }); 
    
    return PopularityList;
}
}
