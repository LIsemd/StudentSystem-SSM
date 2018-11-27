package com.zero.bean;

public class Project {
    private Integer id;

    private Integer studentId;

    private String projectRank;

    private String projectGrade;

    private String projectName;

    private Integer projectCheck;

    private Integer projectStatus;

    private String teacherId;
    
    private Student student;
    
    private Teacher teacher;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getProjectRank() {
        return projectRank;
    }

    public void setProjectRank(String projectRank) {
        this.projectRank = projectRank == null ? null : projectRank.trim();
    }

    public String getProjectGrade() {
        return projectGrade;
    }

    public void setProjectGrade(String projectGrade) {
        this.projectGrade = projectGrade == null ? null : projectGrade.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Integer getProjectCheck() {
        return projectCheck;
    }

    public void setProjectCheck(Integer projectCheck) {
        this.projectCheck = projectCheck;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}