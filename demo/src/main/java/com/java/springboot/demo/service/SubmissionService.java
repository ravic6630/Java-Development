package com.java.springboot.demo.service;

import com.java.springboot.demo.entity.SubmissionDTO;

import java.util.List;

public interface SubmissionService {
    SubmissionDTO getSubmission(String id);

    SubmissionDTO addSubmission(SubmissionDTO submission);

    SubmissionDTO updateSubmission(SubmissionDTO submission);

    SubmissionDTO deleteSubmission(String id);

    List<SubmissionDTO> getAll();
}
