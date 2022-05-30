package com.mb.jpa.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mb.jpa.entity.Story;

@Repository
public interface StoryRepository extends CrudRepository<Story, Serializable>
{

}
