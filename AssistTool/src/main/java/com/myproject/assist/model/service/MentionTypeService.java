package com.myproject.assist.model.service;

import java.util.ArrayList;

public interface MentionTypeService {
	
	ArrayList<ArrayList<String>> missingMentionTypeCheck(String folderName, String nextPath);

	ArrayList<ArrayList<String>> addedMentionTypeCheck(String folderName, String nextPath);

}
