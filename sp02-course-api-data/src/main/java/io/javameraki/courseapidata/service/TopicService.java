package io.javameraki.courseapidata.service;


import io.javameraki.courseapidata.entity.TopicEntity;
import io.javameraki.courseapidata.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("S001", "Spring", "IT tech book collections"),
//            new Topic("S002", "Science", "Science and solutions"),
//            new Topic("S003", "Maths", "Calculas Programing"),
//            new Topic("S004", "IT", "Engineering")
//    ));

    public List<TopicEntity> getAllTopics() {
      //  return topics;
        List<TopicEntity> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;
    };

    public Optional<TopicEntity> getTopic(String id){
        //return topics.stream().filter( t-> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);

    }

    public void addTopic(TopicEntity topic) {
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, TopicEntity topic) {
//        for (int i=0; i<topics.size(); i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);

    }

    public void deleteTopic(String id) {
        //topics.removeIf(t-> t.getId().equals(id));
        topicRepository.deleteById(id);

    }
}
