package com.zjh.array;


import com.zjh.domain.Student;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class ListTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("测试", "男", 18));
        list.add(new Student("开发", "男", 20));
        list.add(new Student("运维", "女", 19));
        list.add(new Student("DBA", "女", 22));
        list.add(new Student("运营", "男", 24));
        list.add(new Student("产品", "女", 21));
        list.add(new Student("经理", "女", 25));
        list.add(new Student("产品", "女", 21));

        //求性别为男的学生集合
        List<Student> l1 = list.stream().filter(student -> student.sex.equals("男")).collect(toList());

        //map的key值true为男，false为女的集合
        Map<Boolean, List<Student>> map = list.stream().collect(partitioningBy(student -> student.getSex().equals("男")));

        //求性别为男的学生总岁数
        Integer sum = list.stream().filter(student -> student.sex.equals("男")).mapToInt(Student::getAge).sum();

        //按性别进行分组统计人数

        Map<String, Integer> map2 = list.stream().collect(Collectors.groupingBy(Student::getSex, Collectors.summingInt(p -> 1)));

        //判断是否有年龄大于25岁的学生
        boolean check = list.stream().anyMatch(student -> student.getAge() > 25);

        //获取所有学生的姓名集合
        List<String> l2 = list.stream().map(Student::getName).collect(toList());

        //求所有人的平均年龄
        double avg = list.stream().collect(averagingInt(Student::getAge));

        //求年龄最大的学生
        Student s = list.stream().reduce((student, student2) -> student.getAge() > student2.getAge() ? student:student2).get();

        Student stu = list.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getAge))).get();

        //按照年龄从小到大排序
        List<Student> l3 = list.stream().sorted((s1, s2) -> s1.getAge().compareTo(s2.getAge())).collect(toList());

        //求年龄最小的两个学生
        List<Student> l4 = l3.stream().limit(2).collect(toList());

        //获取所有的名字，组成一条语句
        String str = list.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));

        //获取年龄的最大值、最小值、平均值、求和等等
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Student::getAge).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getCount());
    }

}
