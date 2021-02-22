package com.example.demo.controller;

import com.example.demo.dto.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/home")
public class CourseDetails {
    // @Controller its to create a map of model object and find the correct view.

    // @RestController means we can have methods in this class which maps to url request.
    // We can have request mapped to a particular method so this method executes when the user calls that request.

    // @RequestMapping maps only to GET methods by default. To map to other HTTP methods, you'll have to specify it in the annotation.

    /*@RequestMapping(value = "/getData", method = RequestMethod.GET)
    public List<Topic> getData(){
        List<Topic> list = new ArrayList<>();
        Topic topicLists = new Topic();
        topicLists.setId("s0115");
        topicLists.setName("Spring");
        topicLists.setDescription("famous science and discovery");

        list.add(topicLists);
        return list;
    }*/

    @Autowired
    private TopicService topicService;

    @GetMapping("/getData")
    public List<Topic> getData(){
        return topicService.getAllTopics();
    }

    @GetMapping("getTopic/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "addTopic", method = RequestMethod.POST, name = "application/Json")
    public void addTopic(@RequestBody Topic topic){
            topicService.addTopic(topic);
    }

    @RequestMapping(value = "updateTopic/{id}", method = RequestMethod.PUT, name = "application/Json")
    public void updateTopic(@PathVariable String id,
                            @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(value = "deleteTopic/{id}", method = RequestMethod.DELETE, name = "application/Json")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
