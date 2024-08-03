package io.pankaj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topic=new ArrayList<>(Arrays.asList(
			new Topic("1","Java","object oriented programming language"),
			new Topic("2","c","not a object oriented programming language")
			));
	public List<Topic> getAllTopic()
	{
		return topic;
	}
	public Topic getTopic(String id)
	{
		return topic.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic2) {
		// TODO Auto-generated method stub
		topic.add(topic2);
		
	}
	public void updateTopic(Topic topic2, String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topic.size();i++)
		{
			Topic t=topic.get(i);
			if(t.getId().equals(id));
			{
				topic.set(i, topic2);
			}
		}
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topic.removeIf(t-> t.getId().equals(id));
		
	}

}
