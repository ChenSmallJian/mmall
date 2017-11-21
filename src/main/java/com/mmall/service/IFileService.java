package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * create by chenjian
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}