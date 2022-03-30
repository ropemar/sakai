package org.sakaiproject.meetings.controller.data;

import java.io.Serializable;
import java.time.Instant;

import lombok.Data;

@Data
public class MeetingData implements Serializable {

	private static final long serialVersionUID = 3284276542110972341L;

	private String id;
	private String title;
	private String description;
	private String siteId;
	private Instant startDate;
	private Instant endDate;
	private String ownerId;
	private Integer live; 
	
}
