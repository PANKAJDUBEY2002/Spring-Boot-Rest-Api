package io.pankaj;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	TopicService topics;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		
		return topics.getAllTopic();
		
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topics.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topics.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void addTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		topics.updateTopic(topic,id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void addTopic(@PathVariable String id)
	{
		topics.deleteTopic(id);
	}

}
