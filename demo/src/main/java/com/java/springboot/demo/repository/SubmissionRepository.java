package com.java.springboot.demo.repository;

import com.java.springboot.demo.entity.SubmissionDTO;

import java.util.List;

public interface SubmissionRepository {

    SubmissionDTO getSubmission(String id);

    List<SubmissionDTO> getAll();
    SubmissionDTO addSubmission(SubmissionDTO submission);
    SubmissionDTO updateSubmission(SubmissionDTO submission);
    SubmissionDTO deleteSubmission(String id);
}
