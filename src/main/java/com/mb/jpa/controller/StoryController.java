package com.mb.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.mb.jpa.entity.Story;
import com.mb.jpa.repository.StoryRepository;

@RestController
@RequestMapping(value = "/story")
public class StoryController
{

	@Autowired
	StoryRepository storyRepository;

	@ResponseBody
	@RequestMapping(value = "/stories", method = RequestMethod.GET)
	public List<Story> getStoryDetails()
	{
		List<Story> storyresponse = (List<Story>) storyRepository.findAll();

		return storyresponse;
	}
}
