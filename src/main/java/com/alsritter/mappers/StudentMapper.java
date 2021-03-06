package com.alsritter.mappers;

import com.alsritter.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    // 如果只有一个映射可以直接使用 @Result 而不是 @Results
    @Result(column = "student_id", property = "id")
    @Select("select * from STUDENT_TB WHERE student_id=#{studentId} and password=#{password}")
    Student loginStudent(String studentId, String password);

    @Result(column = "student_id", property = "id")
    @Select("select * from STUDENT_TB WHERE student_id=#{studentId}")
    Student getStudent(String studentId);

    @Insert("insert into STUDENT_TB (student_id, name, gender, password, phone) " +
            "VALUES (#{studentId},#{name},#{gender},#{password},#{phone})")
    int signUpStudent(String studentId, String name, String password, String phone, String gender);

    // 用来把学生 id 更新到 redis
    @Select("select student_id from STUDENT_TB")
    List<String> getStudentIdList();

    @Update("update STUDENT_TB set name=#{name},phone=#{phone},gender=#{gender} where student_id = #{studentId}")
    int updateStudent(String studentId, String gender ,String name, String phone);

    @Result(column = "student_id", property = "id")
    @Select("select * from STUDENT_TB")
    List<Student> getStudentList();

    List<Student> searchStudent(String id, String name, String phone);

    @Select("select COUNT(*) from STUDENT_TB;")
    int getCount();
}
