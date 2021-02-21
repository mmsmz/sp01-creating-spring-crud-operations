package com.example.demo.service;

import com.example.demo.dto.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("S001", "Spring", "IT tech book collections"),
            new Topic("S002", "Science", "Science and solutions"),
            new Topic("S003", "Maths", "Calculas Programing"),
            new Topic("S004", "IT", "Engineering")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    };

    public Topic getTopic(String id){
        return topics.stream().filter( t-> t.getId().equals(id)).findFirst().get();

    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t-> t.getId().equals(id));
    }
}
