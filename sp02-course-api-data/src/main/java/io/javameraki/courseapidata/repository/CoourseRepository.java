package io.javameraki.courseapidata.repository;

import io.javameraki.courseapidata.entity.TopicEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoourseRepository extends CrudRepository<TopicEntity, String>{

    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)

}
