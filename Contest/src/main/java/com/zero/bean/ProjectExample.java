package com.zero.bean;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andProjectRankIsNull() {
            addCriterion("project_rank is null");
            return (Criteria) this;
        }

        public Criteria andProjectRankIsNotNull() {
            addCriterion("project_rank is not null");
            return (Criteria) this;
        }

        public Criteria andProjectRankEqualTo(String value) {
            addCriterion("project_rank =", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankNotEqualTo(String value) {
            addCriterion("project_rank <>", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankGreaterThan(String value) {
            addCriterion("project_rank >", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankGreaterThanOrEqualTo(String value) {
            addCriterion("project_rank >=", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankLessThan(String value) {
            addCriterion("project_rank <", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankLessThanOrEqualTo(String value) {
            addCriterion("project_rank <=", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankLike(String value) {
            addCriterion("project_rank like", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankNotLike(String value) {
            addCriterion("project_rank not like", value, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankIn(List<String> values) {
            addCriterion("project_rank in", values, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankNotIn(List<String> values) {
            addCriterion("project_rank not in", values, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankBetween(String value1, String value2) {
            addCriterion("project_rank between", value1, value2, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectRankNotBetween(String value1, String value2) {
            addCriterion("project_rank not between", value1, value2, "projectRank");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIsNull() {
            addCriterion("project_grade is null");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIsNotNull() {
            addCriterion("project_grade is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGradeEqualTo(String value) {
            addCriterion("project_grade =", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeNotEqualTo(String value) {
            addCriterion("project_grade <>", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeGreaterThan(String value) {
            addCriterion("project_grade >", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeGreaterThanOrEqualTo(String value) {
            addCriterion("project_grade >=", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeLessThan(String value) {
            addCriterion("project_grade <", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeLessThanOrEqualTo(String value) {
            addCriterion("project_grade <=", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeLike(String value) {
            addCriterion("project_grade like", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeNotLike(String value) {
            addCriterion("project_grade not like", value, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeIn(List<String> values) {
            addCriterion("project_grade in", values, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeNotIn(List<String> values) {
            addCriterion("project_grade not in", values, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeBetween(String value1, String value2) {
            addCriterion("project_grade between", value1, value2, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectGradeNotBetween(String value1, String value2) {
            addCriterion("project_grade not between", value1, value2, "projectGrade");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectCheckIsNull() {
            addCriterion("project_check is null");
            return (Criteria) this;
        }

        public Criteria andProjectCheckIsNotNull() {
            addCriterion("project_check is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCheckEqualTo(Integer value) {
            addCriterion("project_check =", value, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckNotEqualTo(Integer value) {
            addCriterion("project_check <>", value, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckGreaterThan(Integer value) {
            addCriterion("project_check >", value, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_check >=", value, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckLessThan(Integer value) {
            addCriterion("project_check <", value, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckLessThanOrEqualTo(Integer value) {
            addCriterion("project_check <=", value, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckIn(List<Integer> values) {
            addCriterion("project_check in", values, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckNotIn(List<Integer> values) {
            addCriterion("project_check not in", values, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckBetween(Integer value1, Integer value2) {
            addCriterion("project_check between", value1, value2, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("project_check not between", value1, value2, "projectCheck");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(Integer value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(Integer value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(Integer value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(Integer value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<Integer> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<Integer> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}