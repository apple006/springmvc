/*
 * Powered By tangzezhi
 * Since 2013 - 2014
 */

package org.tang.jpa.dto.exam;
import org.apache.log4j.Logger;

public class ExampaperDTO {

	private static final long serialVersionUID = 1L;
	private Logger logger = Logger.getLogger(this.getClass());
	
    private java.lang.String examid;
    private java.lang.String examName;
    private java.lang.String examOperater;
    private java.lang.String examTime;
    private java.lang.String examSubject;
	
	public java.lang.String getExamid() {
		return this.examid;
	}
	
	public void setExamid(java.lang.String examid) {
		this.examid = examid;
	}
	public java.lang.String getExamName() {
		return this.examName;
	}
	
	public void setExamName(java.lang.String examName) {
		this.examName = examName;
	}
	public java.lang.String getExamOperater() {
		return this.examOperater;
	}
	
	public void setExamOperater(java.lang.String examOperater) {
		this.examOperater = examOperater;
	}
	public java.lang.String getExamTime() {
		return this.examTime;
	}
	
	public void setExamTime(java.lang.String examTime) {
		this.examTime = examTime;
	}
	public java.lang.String getExamSubject() {
		return this.examSubject;
	}
	
	public void setExamSubject(java.lang.String examSubject) {
		this.examSubject = examSubject;
	}

}
