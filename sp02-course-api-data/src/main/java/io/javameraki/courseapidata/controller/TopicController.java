package io.javameraki.courseapidata.controller;

import io.javameraki.courseapidata.entity.TopicEntity;
import io.javameraki.courseapidata.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/home")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/getData")
    public List<TopicEntity> getData(){
        return topicService.getAllTopics();
    }

    @GetMapping("getTopic/{id}")
    public Optional<TopicEntity> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "addTopic", method = RequestMethod.POST, name = "application/Json")
    public void addTopic(@RequestBody TopicEntity topic){
            topicService.addTopic(topic);
    }

    @RequestMapping(value = "updateTopic/{id}", method = RequestMethod.PUT, name = "application/Json")
    public void updateTopic(@PathVariable String id,
                            @RequestBody TopicEntity topic){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(value = "deleteTopic/{id}", method = RequestMethod.DELETE, name = "application/Json")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

   

}
