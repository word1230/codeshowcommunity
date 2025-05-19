package com.cheems.codeshowcommunitybackend.common;

import lombok.Data;

/**
 * 分页请求类
 */
@Data
public class PageRequest {

    private int current=1;

    private int pageSize=2;

    private String sortField;

    private String sortOrder ="descend";


}
