package com.zero.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNull() {
            addCriterion("student_grade is null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNotNull() {
            addCriterion("student_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeEqualTo(String value) {
            addCriterion("student_grade =", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotEqualTo(String value) {
            addCriterion("student_grade <>", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThan(String value) {
            addCriterion("student_grade >", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("student_grade >=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThan(String value) {
            addCriterion("student_grade <", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("student_grade <=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLike(String value) {
            addCriterion("student_grade like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotLike(String value) {
            addCriterion("student_grade not like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIn(List<String> values) {
            addCriterion("student_grade in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotIn(List<String> values) {
            addCriterion("student_grade not in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeBetween(String value1, String value2) {
            addCriterion("student_grade between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotBetween(String value1, String value2) {
            addCriterion("student_grade not between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNull() {
            addCriterion("student_class is null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNotNull() {
            addCriterion("student_class is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClassEqualTo(String value) {
            addCriterion("student_class =", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotEqualTo(String value) {
            addCriterion("student_class <>", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThan(String value) {
            addCriterion("student_class >", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThanOrEqualTo(String value) {
            addCriterion("student_class >=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThan(String value) {
            addCriterion("student_class <", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThanOrEqualTo(String value) {
            addCriterion("student_class <=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLike(String value) {
            addCriterion("student_class like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotLike(String value) {
            addCriterion("student_class not like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassIn(List<String> values) {
            addCriterion("student_class in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotIn(List<String> values) {
            addCriterion("student_class not in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassBetween(String value1, String value2) {
            addCriterion("student_class between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotBetween(String value1, String value2) {
            addCriterion("student_class not between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIsNull() {
            addCriterion("student_college is null");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIsNotNull() {
            addCriterion("student_college is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeEqualTo(String value) {
            addCriterion("student_college =", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotEqualTo(String value) {
            addCriterion("student_college <>", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeGreaterThan(String value) {
            addCriterion("student_college >", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("student_college >=", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLessThan(String value) {
            addCriterion("student_college <", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLessThanOrEqualTo(String value) {
            addCriterion("student_college <=", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLike(String value) {
            addCriterion("student_college like", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotLike(String value) {
            addCriterion("student_college not like", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIn(List<String> values) {
            addCriterion("student_college in", values, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotIn(List<String> values) {
            addCriterion("student_college not in", values, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeBetween(String value1, String value2) {
            addCriterion("student_college between", value1, value2, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotBetween(String value1, String value2) {
            addCriterion("student_college not between", value1, value2, "studentCollege");
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