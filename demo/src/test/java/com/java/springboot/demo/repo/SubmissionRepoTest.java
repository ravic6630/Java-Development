package com.java.springboot.demo.repo;

import com.java.springboot.demo.entity.SubmissionDTO;
import com.java.springboot.demo.repository.SubmissionRepoClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.HashMap;

public class SubmissionRepoTest {
    static SubmissionRepoClass sRep;
    @BeforeAll
    public static void init(){
        sRep= new SubmissionRepoClass();
    }


    @Test
    public void test_addSubmission() throws Exception{

        SubmissionDTO dto= getSubmission("25-1-2023","Ravi","java","Akshay","Srihari");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        int size=hm.size();

        SubmissionDTO result = sRep.addSubmission(dto);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("Ravi",result.getSalesPersonName());
        Assertions.assertEquals("Akshay",result.getVendorName());
        Assertions.assertEquals(size+1,hm.size());
    }

    @Test
    public void test_updateSubmission() throws NoSuchFieldException, IllegalAccessException {
        SubmissionDTO dto= getSubmission("25-1-2023","Ravi","java","Akshay","Srihari");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        hm.put("id-1",dto);
        SubmissionDTO dto1= getSubmission("25-1-2023","Ravi","java","Srihari","Srihari");
        dto1.setId("id-1");
        SubmissionDTO result = sRep.updateSubmission(dto1);

        //check whether the vendorname updated from  uday to srihari

        Assertions.assertEquals("Srihari",hm.get("id-1").getVendorName());

        Assertions.assertNotNull(result);

    }

    @Test
    public void test_delSubmission() throws Exception{
        SubmissionDTO dto= getSubmission("25-1-2023","Ravi","java","Akshay","Srihari");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        hm.put("id-1",dto);

        boolean result= sRep.deleteSubmission("Srihari");

        Assertions.assertTrue(result);
        Assertions.assertEquals(0,hm.size());

    }
    @Test
    public void test_getSubmission() throws Exception{
        SubmissionDTO dto= getSubmission("25-1-2023","Ravi","java","Akshay","Srihari");
        Class<?> myClass = SubmissionRepoClass.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        hm.put("id-1",dto);

        SubmissionDTO result=sRep.getSubmission("id-1");
        Assertions.assertEquals("Ravi",result.getSalesPersonName());
    }

    public static SubmissionDTO getSubmission(String date,String salesPersonName,String technology, String vendorName,String consultantName){
        SubmissionDTO dto = new SubmissionDTO();
        dto.setSubmissionDate(date);
        dto.setSalesPersonName(salesPersonName);
        dto.setTechnology(technology);
        dto.setVendorName(vendorName);
        dto.setConsultantName(consultantName);
        return dto;
    }
}
