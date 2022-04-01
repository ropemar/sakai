package org.sakaiproject.meetings.api;

import java.util.List;
import java.util.Optional;

import org.sakaiproject.meetings.api.model.AttendeeType;
import org.sakaiproject.meetings.api.model.Meeting;

public interface MeetingService {

	public Iterable<Meeting> getAllMeetings();
	public List<Meeting> getUserMeetings(String userId, List<String> siteIds, List <String> groupIds);
	public Meeting createMeeting(Meeting meetingData);
	public void updateMeeting(Meeting meetingData);
	public void deleteMeetingById(String id);
	public Optional<Meeting> getMeetingById(String id);
	public void setMeetingProperty(Meeting meeting, String property, String value);
	public String getMeetingProperty(Meeting meeting, String property);
	public void addAttendeeToMeeting(Meeting meeting, String objectId, AttendeeType type);
	
}
